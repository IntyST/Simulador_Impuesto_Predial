/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Modelo;

import java.util.Date;


/**
 *
 * @author Usuario
 */
public class AuditarPersonaModelo {
    private int idAudi;
    private int idPer;
    private String nombre;
    private String apellidos;
    private String cedula;
    private String correo;
    private String telefono;
    private String accion;
    private Date fechaHora;
    private String usuario;

    public AuditarPersonaModelo() {
    }

    public AuditarPersonaModelo(int idAudi, int idPer, String nombre, String apellidos, String cedula, String correo, String telefono, String accion, Date fechaHora, String usuario) {
        this.idAudi = idAudi;
        this.idPer = idPer;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
        this.accion = accion;
        this.fechaHora = fechaHora;
        this.usuario = usuario;
    }

    public AuditarPersonaModelo(String nombre, String apellidos, String cedula, String correo, String telefono, String accion, Date fechaHora, String usuario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
        this.accion = accion;
        this.fechaHora = fechaHora;
        this.usuario = usuario;
    }

    public int getIdAudi() {
        return idAudi;
    }

    public void setIdAudi(int idAudi) {
        this.idAudi = idAudi;
    }

    public int getIdPer() {
        return idPer;
    }

    public void setIdPer(int idPer) {
        this.idPer = idPer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
    @Override
    public String toString(){
        return "DATOS AUDITAR PERSONA";
    }
    
}
