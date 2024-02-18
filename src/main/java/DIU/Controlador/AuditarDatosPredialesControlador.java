/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

import DIU.Modelo.AuditarDatosPredialesModelo;
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
public class AuditarDatosPredialesControlador {

    private AuditarDatosPredialesModelo DatosPredios;
    ConexionBDD parametros = new ConexionBDD();
    Connection conectar = (Connection) parametros.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    public AuditarDatosPredialesControlador() {

    }

    public AuditarDatosPredialesModelo getPersona() {
        return DatosPredios;
    }

    public void setPersona(AuditarDatosPredialesModelo DatosPredios) {
        this.DatosPredios = DatosPredios;
    }

    public ArrayList<Object[]> obtenerAuditarDatosPrediales() {
        ArrayList<Object[]> listaObject = new ArrayList<>();
        try {
            String sql = "CALL sp_ObtenerAuditarDatosPrediales()";
            ejecutar = conectar.prepareCall(sql);
            resultado = ejecutar.executeQuery();
            while (resultado.next()) {
                Object[] obPredio = new Object[8];
                obPredio[0] = resultado.getString("cod_castral_pred");
                obPredio[1] = resultado.getString("tipo_pred");
                obPredio[2] = resultado.getString("direccion_pred");
                obPredio[3] = resultado.getDouble("valor_terreno_pred");
                obPredio[4] = resultado.getDouble("valor_edificacion_pred");
                obPredio[5] = resultado.getDouble("valor_comercial_pred");
                obPredio[6] = resultado.getString("accion");
                obPredio[7] = resultado.getTimestamp("fechaHora");
                listaObject.add(obPredio);
            }
            ejecutar.close();
            return listaObject;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR SQL: " + e.getMessage());
        }
        return null;
    }

}
