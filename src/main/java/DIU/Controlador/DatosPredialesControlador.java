/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

import DIU.Modelo.DatosPredialesModelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class DatosPredialesControlador {

    private DatosPredialesModelo DatosPredios;
    ConexionBDD conectar = new ConexionBDD();
    Connection conectado = conectar.conectar();
    PreparedStatement ejecutar;

    public DatosPredialesControlador() {

    }

    public DatosPredialesModelo getPersona() {
        return DatosPredios;
    }

    public void setPersona(DatosPredialesModelo DatosPredios) {
        this.DatosPredios = DatosPredios;
    }

    public void crearDatosPrediales(String cedula, DatosPredialesModelo datosPrediales) {
        try {
            String SQL = "CALL sp_InsertarDatosPrediales(?, ?, ?, ?, ?, ?, ?, ?)";
            ejecutar = conectado.prepareStatement(SQL);

            // Establecer los valores de los parámetros del procedimiento almacenado
            ejecutar.setString(1, cedula);
            ejecutar.setString(2, datosPrediales.getCodCastralPred());
            ejecutar.setString(3, datosPrediales.getTipoPred());
            ejecutar.setString(4, datosPrediales.getDireccionPropie());
            ejecutar.setDouble(5, datosPrediales.getAreaTotalPred());
            ejecutar.setDouble(6, datosPrediales.getAreaConstruccionPred());
            ejecutar.setDouble(7, datosPrediales.getValorTerrenoPred());
            ejecutar.setDouble(8, datosPrediales.getValorEdificacionPred());

            // El valor comercial no se establece aquí, ya que se calcula dentro del procedimiento almacenado
            int res = ejecutar.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Datos prediales creados con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "Error al crear los datos prediales");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al crear los datos prediales: " + e.getMessage());
        }
    }
}
