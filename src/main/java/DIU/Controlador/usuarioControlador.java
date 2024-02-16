/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

import DIU.Modelo.PersonaModelo;
import DIU.Modelo.UsuarioModelo;
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
public class usuarioControlador {

    private UsuarioModelo login;
    ConexionBDD parametros = new ConexionBDD();
    Connection conectar = (Connection) parametros.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    public usuarioControlador() {

    }

    public UsuarioModelo getPersona() {
        return login;
    }

    public void setPersona(UsuarioModelo login) {
        this.login = login;
    }

    public PersonaModelo validarLogin(String correo, String contrasenia) {
        PersonaModelo persona = null;
        try {
            // Preparar la llamada al SP
            CallableStatement cs = conectar.prepareCall("{call sp_ValidarLogin(?, ?)}");

            // Establecer los parámetros de entrada
            cs.setString(1, correo);
            cs.setString(2, contrasenia);

            // Ejecutar el SP y obtener los resultados
            ResultSet rs = cs.executeQuery();

            // Si se encontró un usuario, crear el objeto PersonaModelo
            if (rs.next()) {
                persona = new PersonaModelo();
                persona.setNombres(rs.getString("nombreUsuario"));
                persona.setApellidos(rs.getString("apellidoUsuario"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión revice el usuario o contraseña: " + e.getMessage());
        }

        return persona;
    }

}
