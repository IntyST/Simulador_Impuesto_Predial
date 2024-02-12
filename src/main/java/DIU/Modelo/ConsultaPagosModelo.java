/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Modelo;

import java.sql.Date;

/**
 *
 * @author Usuario
 */
public class ConsultaPagosModelo {
    private int id_pago;
    private int id_predio;
    private Date fecha_ingreso_pago;
    private Date fecha_vencimiento_pago;
    private String descripcion_pago;
    private double sub_total_pago;

    public ConsultaPagosModelo() {
    }

    public ConsultaPagosModelo(int id_pago, int id_predio, Date fecha_ingreso_pago, Date fecha_vencimiento_pago, String descripcion_pago, double sub_total_pago) {
        this.id_pago = id_pago;
        this.id_predio = id_predio;
        this.fecha_ingreso_pago = fecha_ingreso_pago;
        this.fecha_vencimiento_pago = fecha_vencimiento_pago;
        this.descripcion_pago = descripcion_pago;
        this.sub_total_pago = sub_total_pago;
    }

    public int getId_pago() {
        return id_pago;
    }

    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
    }

    public int getId_predio() {
        return id_predio;
    }

    public void setId_predio(int id_predio) {
        this.id_predio = id_predio;
    }

    public Date getFecha_ingreso_pago() {
        return fecha_ingreso_pago;
    }

    public void setFecha_ingreso_pago(Date fecha_ingreso_pago) {
        this.fecha_ingreso_pago = fecha_ingreso_pago;
    }

    public Date getFecha_vencimiento_pago() {
        return fecha_vencimiento_pago;
    }

    public void setFecha_vencimiento_pago(Date fecha_vencimiento_pago) {
        this.fecha_vencimiento_pago = fecha_vencimiento_pago;
    }

    public String getDescripcion_pago() {
        return descripcion_pago;
    }

    public void setDescripcion_pago(String descripcion_pago) {
        this.descripcion_pago = descripcion_pago;
    }

    public double getSub_total_pago() {
        return sub_total_pago;
    }

    public void setSub_total_pago(double sub_total_pago) {
        this.sub_total_pago = sub_total_pago;
    }
    
    @Override
    public String toString() {
        return "CONSULTA PREDIALES";}
}
