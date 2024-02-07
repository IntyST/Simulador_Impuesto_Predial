/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

import DIU.Modelo.PersonaYDatosPredialesModelo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class PersonaYDatosPredialesControlador {

    private PersonaYDatosPredialesModelo DatosPersonaPredios;
    ConexionBDD conectar = new ConexionBDD();
    Connection conectado = (Connection) conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;//para leer u obtener datos
    int res;//para escribir

    public PersonaYDatosPredialesControlador() {

    }

    public PersonaYDatosPredialesModelo getPersona() {
        return DatosPersonaPredios;
    }

    public void setPersona(PersonaYDatosPredialesModelo DatosPersonaPredios) {
        this.DatosPersonaPredios = DatosPersonaPredios;
    }

    //TRANSACCIONABILIDAD
    //CREAR 
    public void crearPersona(PersonaYDatosPredialesModelo p) {
        try {
            String sql = "call sp_InsertarPersonaYDatosPrediales('" + p.getNombres() + "','" + p.getApellidos()
                    + "','" + p.getCedula() + "','" + p.getCorreo() + "','" + p.getTelefono()
                    + "','" + p.getEdad() + "','" + p.getCodCastralPred() + "','" + p.getTipoPred()
                    + "','" + p.getDireccionPropie() + "','" + p.getAreaTotalPred() + "','" + p.getAreaConstruccionPred()
                    + "','" + p.getValorTerrenoPred() + "','" + p.getValorEdificacionPred() + "','" + p.getValorComercialPred() + "');";

            ejecutar = (PreparedStatement) conectado.prepareCall(sql);

            int res = ejecutar.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Datos de persona y prediales creados con éxito");
                System.out.println("DATOS DE PERSONA Y PREDIALES CREADOS CON ÉXITO");
            } else {
                JOptionPane.showMessageDialog(null, "Error al crear los datos");
                System.out.println("ERROR AL CREAR LOS DATOS");
            }
            ejecutar.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la conexión a la base de datos");
            System.out.println("ERROR EN LA CONEXIÓN A LA BASE DE DATOS: " + e.getMessage());
        }
    }
}
