/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

import DIU.Modelo.DatosPredialesModelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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

    public void crearDatosPrediales(DatosPredialesModelo datosPrediales) {
        try {
            String SQL = "call sp_CrearDatosPrediales('" + datosPrediales.getCodCastralPred() + "',"
                    + "'" + datosPrediales.getCedulaPer() + "',"
                    + "'" + datosPrediales.getTipoPred() + "',"
                    + "'" + datosPrediales.getDireccionPropie() + "',"
                    + datosPrediales.getAreaTotalPred() + ","
                    + datosPrediales.getAreaConstruccionPred() + ","
                    + datosPrediales.getValorTerrenoPred() + ","
                    + datosPrediales.getValorEdificacionPred() + ","
                    + datosPrediales.getValorComercialPred() + ")";
            ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
            int resultado = ejecutar.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "PERSONA CREADA CON ÉXITO");
            } else {
                JOptionPane.showMessageDialog(null, "REVISAR LA INFORMACIÓN INGRESADA");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }
    }

}
