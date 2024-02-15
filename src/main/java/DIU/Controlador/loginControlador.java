/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

//import DIU.Modelo.PersonaModelo;
import DIU.Modelo.AdministradorModelo;
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
    int res;//para escribir

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
            String SQL = "CALL ValidarInicioSesion('"+p.getCedulaU()+"', '"+p.getContrasenia()+"');";
            ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
            ResultSet res = ejecutar.executeQuery(SQL);

            if (res.next()) {

                //System.out.println("Bienvenido " + Usuario);
                JOptionPane.showMessageDialog(null, "Bienvenido " + p.getCedulaU());
                MenuPrincipal MP = new MenuPrincipal();
                MP.setVisible(true);
                
                res.close();
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrecto");
                MenuPrincipal MP = new MenuPrincipal();
                MP.setVisible(false);
                return false;
                
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "error de coneccion" + e);
            return false;
}

}

   
}