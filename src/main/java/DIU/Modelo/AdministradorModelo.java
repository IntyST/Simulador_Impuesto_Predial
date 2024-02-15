/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Modelo;

/**
 *
 * @author Usuario
 */
public class AdministradorModelo {
    private int id_administrador;
    private String nombres;
    private String apellidos;
    private String cedula;
    private String usuario;
    private String clave;
    
    public AdministradorModelo(){
        
    }

    public AdministradorModelo(int id_administrador, String nombres, String apellidos, String cedula, String usuario, String clave) {
        this.id_administrador = id_administrador;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.usuario = usuario;
        this.clave = clave;
    }
   

    /**
     * @return the id_administrador
     */
    public int getId_administrador() {
        return id_administrador;
    }

    /**
     * @param id_administrador the id_administrador to set
     */
    public void setId_administrador(int id_administrador) {
        this.id_administrador = id_administrador;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }



    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }
    
    @Override
    public String toString() {
        return "DATOS DE USUARIO";
    }
}
