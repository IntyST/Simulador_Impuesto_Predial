/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Modelo;

/**
 *
 * @author Usuario
 */
public class DatosPredialesModelo {
    private int idPred;
    private String cedulaPer;
    private String codCastralPred;
    private String tipoPred;
    private String direccionPropie;
    private double areaTotalPred;
    private double areaConstruccionPred;
    private double valorTerrenoPred;
    private double valorEdificacionPred;
    private double valorComercialPred;

    public DatosPredialesModelo() {
    }

    public DatosPredialesModelo(int idPred, String codCastralPred, String cedulaPer, String tipoPred, String direccionPropie, double areaTotalPred, double areaConstruccionPred, double valorTerrenoPred, double valorEdificacionPred, double valorComercialPred) {
        this.idPred = idPred;
        this.codCastralPred = codCastralPred;
        this.cedulaPer = cedulaPer;
        this.tipoPred = tipoPred;
        this.direccionPropie = direccionPropie;
        this.areaTotalPred = areaTotalPred;
        this.areaConstruccionPred = areaConstruccionPred;
        this.valorTerrenoPred = valorTerrenoPred;
        this.valorEdificacionPred = valorEdificacionPred;
        this.valorComercialPred = valorComercialPred;
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

    public String getCedulaPer() {
        return cedulaPer;
    }

    public void setCedulaPer(String cedulaPer) {
        this.cedulaPer = cedulaPer;
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
        return "DATOS PREDIALES";}
    
    
}
