/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Modelo;

/**
 *
 * @author Usuario
 */
public class PersonaYDatosPredialesModelo {
    private int idpersona;
    private String nombres;
    private String apellidos;
    private String cedula;
    private String correo;
    private String telefono;
    private int edad;
    private int idPred;
    private int idPersonaPer;
    private String codCastralPred;
    private String tipoPred;
    private String direccionPropie;
    private double areaTotalPred;
    private double areaConstruccionPred;
    private double valorTerrenoPred;
    private double valorEdificacionPred;
    private double valorComercialPred;

    public PersonaYDatosPredialesModelo() {
    }

    public PersonaYDatosPredialesModelo(int idpersona, String nombres, String apellidos, String cedula, String correo, String telefono, int edad, int idPred, int idPersonaPer, String codCastralPred, String tipoPred, String direccionPropie, double areaTotalPred, double areaConstruccionPred, double valorTerrenoPred, double valorEdificacionPred, double valorComercialPred) {
        this.idpersona = idpersona;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
        this.edad = edad;
        this.idPred = idPred;
        this.idPersonaPer = idPersonaPer;
        this.codCastralPred = codCastralPred;
        this.tipoPred = tipoPred;
        this.direccionPropie = direccionPropie;
        this.areaTotalPred = areaTotalPred;
        this.areaConstruccionPred = areaConstruccionPred;
        this.valorTerrenoPred = valorTerrenoPred;
        this.valorEdificacionPred = valorEdificacionPred;
        this.valorComercialPred = valorComercialPred;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdPred() {
        return idPred;
    }

    public void setIdPred(int idPred) {
        this.idPred = idPred;
    }

    public int getIdPersonaPer() {
        return idPersonaPer;
    }

    public void setIdPersonaPer(int idPersonaPer) {
        this.idPersonaPer = idPersonaPer;
    }

    public String getCodCastralPred() {
        return codCastralPred;
    }

    public void setCodCastralPred(String codCastralPred) {
        this.codCastralPred = codCastralPred;
    }

    public String getTipoPred() {
        return tipoPred;
    }

    public void setTipoPred(String tipoPred) {
        this.tipoPred = tipoPred;
    }

    public String getDireccionPropie() {
        return direccionPropie;
    }

    public void setDireccionPropie(String direccionPropie) {
        this.direccionPropie = direccionPropie;
    }

    public double getAreaTotalPred() {
        return areaTotalPred;
    }

    public void setAreaTotalPred(double areaTotalPred) {
        this.areaTotalPred = areaTotalPred;
    }

    public double getAreaConstruccionPred() {
        return areaConstruccionPred;
    }

    public void setAreaConstruccionPred(double areaConstruccionPred) {
        this.areaConstruccionPred = areaConstruccionPred;
    }

    public double getValorTerrenoPred() {
        return valorTerrenoPred;
    }

    public void setValorTerrenoPred(double valorTerrenoPred) {
        this.valorTerrenoPred = valorTerrenoPred;
    }

    public double getValorEdificacionPred() {
        return valorEdificacionPred;
    }

    public void setValorEdificacionPred(double valorEdificacionPred) {
        this.valorEdificacionPred = valorEdificacionPred;
    }

    public double getValorComercialPred() {
        return valorComercialPred;
    }

    public void setValorComercialPred(double valorComercialPred) {
        this.valorComercialPred = valorComercialPred;
    }
    
    @Override
    public String toString() {
        return "DATOS PERSONA Y PREDIALES";}
}
