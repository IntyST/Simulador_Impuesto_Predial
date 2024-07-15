/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;



import DIU.Modelo.loginModelo;
import DIU.Vista.MenuPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class loginControlador {
    private loginModelo usuario;
    ConexionBDD conectar = new ConexionBDD();
    Connection conectado = (Connection) conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;//para leer u obtener un dato
    //int res;para escribir

    /**
     * @return the usuario
     */
    public loginModelo getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(loginModelo usuario) {
        this.usuario = usuario;
    }
   
    public boolean inisiarSesion(loginModelo p) {
        try {
            String SQL = "{CALL sp_ValidarLogin(?, ?)}";

            //ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
        ejecutar = conectado.prepareStatement(SQL);
        ejecutar.setString(1, p.getCedulaU());
        ejecutar.setString(2, p.getContrasenia());
        
            ResultSet resultado = ejecutar.executeQuery();

            if (resultado.next()) {

                //System.out.println("Bienvenido " + Usuario);
                JOptionPane.showMessageDialog(null, "Bienvenido " + p.getCedulaU());
                MenuPrincipal Mp = new MenuPrincipal();
                Mp.setVisible(true);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrecto"); 
                return false;
                
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "error de coneccion" + e);
            return false;
}
}   
}


   
