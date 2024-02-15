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
    
    public boolean inisiarSesion(String usuario, String contrasenia) {
        try {
            String SQL = "SELECT * FROM ADMINISTRADOR "
                    + "WHERE cadministrador = '" + usuario + "' AND Contrasenia = '" + contrasenia + "';";
            ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
            ResultSet res = ejecutar.executeQuery();

            if (res.next()) {

                System.out.println("Bienvenido " + usuario);
                JOptionPane.showMessageDialog(null, "Bienvenido " + usuario);

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
