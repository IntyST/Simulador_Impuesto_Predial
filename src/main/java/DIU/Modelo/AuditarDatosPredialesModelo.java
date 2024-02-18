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
public class AuditarDatosPredialesModelo {
    private int idAudi;
    private int idPred;
    private String codCastralPred;
    private String tipoPred;
    private String direccionPred;
    private double valorTerrenoPred;
    private double valorEdificacionPred;
    private double valorComercialPred;
    private String accion;
    private Date fechaHora;
    private String usuario;

    public AuditarDatosPredialesModelo() {
    }

    public AuditarDatosPredialesModelo(int idAudi, int idPred, String codCastralPred, String tipoPred, String direccionPred, double valorTerrenoPred, double valorEdificacionPred, double valorComercialPred, String accion, Date fechaHora, String usuario) {
        this.idAudi = idAudi;
        this.idPred = idPred;
        this.codCastralPred = codCastralPred;
        this.tipoPred = tipoPred;
        this.direccionPred = direccionPred;
        this.valorTerrenoPred = valorTerrenoPred;
        this.valorEdificacionPred = valorEdificacionPred;
        this.valorComercialPred = valorComercialPred;
        this.accion = accion;
        this.fechaHora = fechaHora;
        this.usuario = usuario;
    }

    public AuditarDatosPredialesModelo(String codCastralPred, String tipoPred, String direccionPred, double valorTerrenoPred, double valorEdificacionPred, double valorComercialPred, String accion, Date fechaHora, String usuario) {
        this.codCastralPred = codCastralPred;
        this.tipoPred = tipoPred;
        this.direccionPred = direccionPred;
        this.valorTerrenoPred = valorTerrenoPred;
        this.valorEdificacionPred = valorEdificacionPred;
        this.valorComercialPred = valorComercialPred;
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

    public int getIdPred() {
        return idPred;
    }

    public void setIdPred(int idPred) {
        this.idPred = idPred;
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

    public String getDireccionPred() {
        return direccionPred;
    }

    public void setDireccionPred(String direccionPred) {
        this.direccionPred = direccionPred;
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
        return "DATOS AUDITAR DATOS PREDIALES";
    }
    
}
