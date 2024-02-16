/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Modelo;

/**
 *
 * @author Usuario
 */
public class UsuarioModelo {
    
   private int idUsuario;
   private int idpersona;
   private String contrasenia;

    public UsuarioModelo() {
    }

    public UsuarioModelo(int idUsuario, int idpersona, String contrasenia) {
        this.idUsuario = idUsuario;
        this.idpersona = idpersona;
        this.contrasenia = contrasenia;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString(){
        return "LOGIN";
    }
   
   
   
}
