/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

import DIU.Modelo.ConsultaPagosModelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ConsultaPagosControlador {

    private ConsultaPagosModelo consultaPredios;
    ConexionBDD parametros = new ConexionBDD();
    Connection conectar = (Connection) parametros.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    public ConsultaPagosControlador() {

    }

    public ConsultaPagosModelo getPersona() {
        return consultaPredios;
    }

    public void setPersona(ConsultaPagosModelo consultaPredios) {
        this.consultaPredios = consultaPredios;
    }

    
    
    public ArrayList<Object[]> consultaPago(String cedula) {
        ArrayList<Object[]> listaObject = new ArrayList<>();

        try {
            String sql = "CALL sp_ConsultaPagos(?)";
            ejecutar = conectar.prepareCall(sql);
            ejecutar.setString(1, cedula);
            resultado = ejecutar.executeQuery();

            int cont = 1;
            while (resultado.next()) {
                Object[] obpersona = new Object[6];
                obpersona[0] = resultado.getString("COD_CASTRAL_PRED");
                obpersona[1] = resultado.getDate("FECHA_INGRESO_PAGO");
                obpersona[2] = resultado.getDate("FECHA_VENCIMIENTO_PAGO");
                obpersona[3] = resultado.getString("DESCRIPCION_PAGO");
                obpersona[4] = resultado.getString("DIRECCION_PRED");
                obpersona[5] = resultado.getDouble("SUB_TOTAL_PAGO");
                listaObject.add(obpersona);
                cont++;
            }
            ejecutar.close();
            return listaObject;

        } catch (SQLException e) {
            System.out.println("ERROR SQL CARGA CONSULTA PAGOS");
            e.printStackTrace();
        }

        return null;
    }
    
     public ArrayList<Object[]> verDatosPrediales(String cedula) {
        ArrayList<Object[]> listaObject = new ArrayList<>();

        try {
            // Llamar al procedimiento almacenado
            String sql = "{CALL sp_VerDatosPredialesCiudadano(?)}";
            ejecutar = conectar.prepareCall(sql);
            ejecutar.setString(1, cedula);
            resultado = ejecutar.executeQuery();

            // Recorrer el resultado y almacenarlo en una lista de objetos
            while (resultado.next()) {
                Object[] obpersona = new Object[8];
                obpersona[0] = resultado.getString("codCastral");
                obpersona[1] = resultado.getString("TipoPred");
                obpersona[2] = resultado.getString("direccion");
                obpersona[3] = resultado.getDouble("areaTotal");
                obpersona[4] = resultado.getDouble("areaConstruccion");
                obpersona[5] = resultado.getDouble("valorTerreno");
                obpersona[6] = resultado.getDouble("valorEdificacion");
                obpersona[7] = resultado.getDouble("valorComercial");
                listaObject.add(obpersona);
            }
            resultado.close();
            ejecutar.close();
            return listaObject;

        } catch (SQLException e) {
            System.out.println("ERROR SQL CARGA CONSULTA PAGOS");
            e.printStackTrace();
        }

        return null;
    }
}
