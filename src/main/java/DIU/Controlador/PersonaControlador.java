/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

import DIU.Modelo.PersonaModelo;
import java.sql.CallableStatement;
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
            String SQL = "{call sp_InsertarPersona(?, ?, ?, ?, ?, ?)}";
            CallableStatement ejecutar = conectado.prepareCall(SQL);
            ejecutar.setString(1, p.getCedula());
            ejecutar.setString(2, p.getNombres());
            ejecutar.setString(3, p.getApellidos());
            ejecutar.setString(4, p.getCorreo());
            ejecutar.setString(5, p.getTelefono());
            ejecutar.setDate(6, new java.sql.Date(p.getFechaNacimiento().getTime()));

            int resultado = ejecutar.executeUpdate();

            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Persona Creada con Éxito");
                System.out.println("PERSONA CREADA CON ÉXITO");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Revise los Datos ingresados");
            System.out.println("REVISE LOS DATOS INGRESADOS");
            ex.printStackTrace();
        }
    }

    public ArrayList<Object[]> datosPersona() {
        ArrayList<Object[]> listaObject = new ArrayList<>();

        try {
            String sql = "call sp_listaPersonas();";
            CallableStatement cs = conectado.prepareCall(sql);
            resultado = cs.executeQuery();

            int cont = 1;
            while (resultado.next()) {
                Object[] fila = new Object[7];
                fila[0] = cont++;
                fila[1] = resultado.getString("CEDULA_PER");
                fila[2] = resultado.getString("NOMBRES_PER");
                fila[3] = resultado.getString("APELLIDOS_PER");
                fila[4] = resultado.getString("CORREO_PER");
                fila[5] = resultado.getString("TELEFONO_PER");
                fila[6] = resultado.getDate("FECHA_NACIMIENTO_PER");
                listaObject.add(fila);
            }

            cs.close();
            return listaObject;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }

        return null;
    }

    public PersonaModelo recuperarDatosPersona(String cedula) {
        PersonaModelo persona = new PersonaModelo();
        try {
            String sql = "CALL sp_RecuperarDatosPersona(?)";
            CallableStatement statement = conectado.prepareCall(sql);
            statement.setString(1, cedula);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                // Obtener los datos de la persona
                persona.setNombres(rs.getString("nombres_res"));
                persona.setApellidos(rs.getString("apellidos_res"));
                persona.setCorreo(rs.getString("correo_res"));
                persona.setTelefono(rs.getString("telefono_res"));
                persona.setFechaNacimiento(rs.getDate("fechaNacimiento_res"));
            } else {
                System.out.println("No se encontraron datos para la cédula proporcionada.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }
        return persona;
    }

}
