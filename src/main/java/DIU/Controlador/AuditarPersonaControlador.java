/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

import DIU.Modelo.AuditarPersonaModelo;
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
public class AuditarPersonaControlador {

    private AuditarPersonaModelo DatosPersona;
    ConexionBDD parametros = new ConexionBDD();
    Connection conectar = (Connection) parametros.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    public AuditarPersonaControlador() {

    }

    public AuditarPersonaModelo getAuditarPersona() {
        return DatosPersona;
    }

    public void setPersona(AuditarPersonaModelo DatosPersona) {
        this.DatosPersona = DatosPersona;
    }

    public ArrayList<Object[]> obtenerAuditarPersona() {
        ArrayList<Object[]> listaObject = new ArrayList<>();
        try {
            String sql = "CALL sp_ObtenerAuditarPersona()";
            ejecutar = conectar.prepareCall(sql);
            resultado = ejecutar.executeQuery();
            while (resultado.next()) {
                Object[] obPersona = new Object[7];
                obPersona[0] = resultado.getString("nombre");
                obPersona[1] = resultado.getString("apellido");
                obPersona[2] = resultado.getString("cedula");
                obPersona[3] = resultado.getString("correo");
                obPersona[4] = resultado.getString("telefono");
                obPersona[5] = resultado.getString("accion");
                obPersona[6] = resultado.getTimestamp("fechaHora");
                listaObject.add(obPersona);
            }
            ejecutar.close();
            return listaObject;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR SQL: " + e.getMessage());
        }
        return null;
    }

}
