/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

import DIU.Modelo.AdministradorModelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class AdministradorControlador {
    private AdministradorModelo persona;
    ConexionBDD conectar = new ConexionBDD();
    Connection conectado=(Connection)conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;
    
    public boolean inisiarSesion(String CEDULA_PER, String CLAVE_ADMIN) {
        try {
            String SQL = "SELECT ID_ADMIN "
                    + "FROM ADMINISTRADOR "
                    + "WHERE CEDULA_PER = '" + CEDULA_PER + "' AND Contrasenia = '" + CLAVE_ADMIN + "';";
            ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
            ResultSet res = ejecutar.executeQuery();

            if (res.next()) {

                System.out.println("Bienvenido " + CEDULA_PER);
                JOptionPane.showMessageDialog(null, "Bienvenido " + CEDULA_PER);

                return true;
            } else {
                System.out.println("Usuario o Contraseña incorrecto");
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "error de coneccion" + e);
            return false;
}

}
    
}
