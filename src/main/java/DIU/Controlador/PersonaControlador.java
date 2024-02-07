/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

import DIU.Modelo.PersonaModelo;
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
public class PersonaControlador {

    private PersonaModelo persona;
    ConexionBDD conectar = new ConexionBDD();
    Connection conectado = (Connection) conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    public PersonaControlador() {

    }

    public PersonaModelo getPersona() {
        return persona;
    }

    public void setPersona(PersonaModelo persona) {
        this.persona = persona;
    }

    //TRANSACCIONABILIDAD
    public void crearPersona(PersonaModelo p) {
        try {
            String SQL = "call sp_CrearPersona('" + p.getNombres() + "',"
                    + "'" + p.getApellidos() + "',"
                    + "'" + p.getCedula() + "',"
                    + "'" + p.getCorreo() + "',"
                    + "'" + p.getTelefono() + "',"
                    + "'" + p.getEdad() + "')";
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
public ArrayList<Object[]> datosPersona() {
    ArrayList<Object[]> listaObject = new ArrayList<>();

    try {
        String sql = "call sp_listaPersonas();";
        ejecutar = (PreparedStatement) conectado.prepareCall(sql);
        resultado = ejecutar.executeQuery();
        int cont = 1;
        while (resultado.next()) {
            Object[] obpersona = new Object[6];
            for (int i = 1; i < 6; i++) {
                obpersona[i] = resultado.getObject(i + 1);
            }
            obpersona[0] = cont;
            listaObject.add(obpersona);
            cont++;
        }
        ejecutar.close();
        return listaObject;

    } catch (SQLException e) {
        System.out.println("ERROR SQL CARGA PERSONAS");
    }

    return null;
}
    
   
}
