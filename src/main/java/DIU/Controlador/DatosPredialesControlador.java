/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

import DIU.Modelo.DatosPredialesModelo;
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
public class DatosPredialesControlador {

    private DatosPredialesModelo DatosPredios;
    ConexionBDD parametros = new ConexionBDD();
    Connection conectar = (Connection) parametros.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    public DatosPredialesControlador() {

    }

    public DatosPredialesModelo getPersona() {
        return DatosPredios;
    }

    public void setPersona(DatosPredialesModelo DatosPredios) {
        this.DatosPredios = DatosPredios;
    }

    public void crearDatosPrediales(String cedula, DatosPredialesModelo datosPrediales) {
        try {
            String SQL = "CALL sp_InsertarDatosPrediales(?, ?, ?, ?, ?, ?, ?, ?)";
            ejecutar = conectar.prepareStatement(SQL);

            // Establecer los valores de los parámetros del procedimiento almacenado
            ejecutar.setString(1, cedula);
            ejecutar.setString(2, datosPrediales.getCodCastralPred());
            ejecutar.setString(3, datosPrediales.getTipoPred());
            ejecutar.setString(4, datosPrediales.getDireccionPropie());
            ejecutar.setDouble(5, datosPrediales.getAreaTotalPred());
            ejecutar.setDouble(6, datosPrediales.getAreaConstruccionPred());
            ejecutar.setDouble(7, datosPrediales.getValorTerrenoPred());
            ejecutar.setDouble(8, datosPrediales.getValorEdificacionPred());

            // El valor comercial no se establece aquí, ya que se calcula dentro del procedimiento almacenado
            int res = ejecutar.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Datos prediales creados con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "Error al crear los datos prediales");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al crear los datos prediales: " + e.getMessage());
        }
    }

    public ArrayList<Object[]> obtenerDatosPrediales() {
        ArrayList<Object[]> listaObject = new ArrayList<>();

        try {
            String sql = "CALL sp_ObtenerDatosPrediales()";
            ejecutar = conectar.prepareCall(sql);
            resultado = ejecutar.executeQuery();

            int cont = 1;
            while (resultado.next()) {
                Object[] obpersona = new Object[12]; // Ajustar el tamaño del array a 12
                obpersona[0] = cont; // Número de fila
                obpersona[1] = resultado.getString("CEDULA_PER");
                obpersona[2] = resultado.getString("NOMBRES_PER");
                obpersona[3] = resultado.getString("APELLIDOS_PER");
                obpersona[4] = resultado.getString("COD_CASTRAL_PRED");
                obpersona[5] = resultado.getString("TIPO_PRED");
                obpersona[6] = resultado.getString("DIRECCION_PRED");
                obpersona[7] = resultado.getDouble("AREA_TOTAL_PRED");
                obpersona[8] = resultado.getDouble("AREA_CONSTRUCCION_PRED");
                obpersona[9] = resultado.getDouble("VALOR_TERRENO_PRED");
                obpersona[10] = resultado.getDouble("VALOR_EDIFICACION_PRED");
                obpersona[11] = resultado.getDouble("VALOR_COMERCIAL_PRED");
                listaObject.add(obpersona);
                cont++;
            }
            ejecutar.close();
            return listaObject;

        } catch (SQLException e) {
            System.out.println("ERROR SQL CARGA PERSONAS");
        }

        return null;
    }

    public ArrayList<Object[]> buscarPropiedadesPorCedula(String cedula) {
        ArrayList<Object[]> listaObject = new ArrayList<>();
        try {
            String sql = "CALL sp_BuscarPropiedadesPorCedula(?)";
            ejecutar = conectar.prepareCall(sql);
            ejecutar.setString(1, cedula);
            resultado = ejecutar.executeQuery();
            int cont = 1;
            while (resultado.next()) {
                Object[] obPropiedad = new Object[12]; // Ajustar el tamaño del array a 12
                obPropiedad[0] = cont; // Número de fila
                obPropiedad[1] = resultado.getString("CEDULA_PER");
                obPropiedad[2] = resultado.getString("NOMBRES_PER");
                obPropiedad[3] = resultado.getString("APELLIDOS_PER");
                obPropiedad[4] = resultado.getString("COD_CASTRAL_PRED");
                obPropiedad[5] = resultado.getString("TIPO_PRED");
                obPropiedad[6] = resultado.getString("DIRECCION_PRED");
                obPropiedad[7] = resultado.getDouble("AREA_TOTAL_PRED");
                obPropiedad[8] = resultado.getDouble("AREA_CONSTRUCCION_PRED");
                obPropiedad[9] = resultado.getDouble("VALOR_TERRENO_PRED");
                obPropiedad[10] = resultado.getDouble("VALOR_EDIFICACION_PRED");
                obPropiedad[11] = resultado.getDouble("VALOR_COMERCIAL_PRED");
                listaObject.add(obPropiedad);
                cont++;
            }
            ejecutar.close();
            return listaObject;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR SQL: " + e.getMessage());
        }
        return null;
    }

    public void actualizarDatosPrediales(String cedula, DatosPredialesModelo datosPrediales) {
        try {
            // Preparar la llamada al procedimiento almacenado
            String SQL = "CALL sp_ActualizarDatosPrediales(?, ?, ?, ?, ?, ?, ?, ?)";
            ejecutar = conectar.prepareStatement(SQL);

            // Establecer los valores de los parámetros del procedimiento almacenado
            ejecutar.setString(1, cedula);
            ejecutar.setString(2, datosPrediales.getCodCastralPred());
            ejecutar.setString(3, datosPrediales.getTipoPred());
            ejecutar.setString(4, datosPrediales.getDireccionPropie());
            ejecutar.setDouble(5, datosPrediales.getAreaTotalPred());
            ejecutar.setDouble(6, datosPrediales.getAreaConstruccionPred());
            ejecutar.setDouble(7, datosPrediales.getValorTerrenoPred());
            ejecutar.setDouble(8, datosPrediales.getValorEdificacionPred());

            // Ejecutar el procedimiento almacenado
            boolean resultado = ejecutar.execute();

            if (!resultado) {
                JOptionPane.showMessageDialog(null, "Datos prediales actualizados con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar los datos prediales");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar los datos prediales: " + e.getMessage());
        }
    }

    public void eliminarDatosPrediales(String codCastralPred) {
        try {
            String sql = "CALL sp_EliminarDatosPrediales(?)"; // Usar un placeholder '?' para el parámetro
            ejecutar = conectar.prepareStatement(sql);
            ejecutar.setString(1, codCastralPred); // Establecer el valor del parámetro
            int resultado = ejecutar.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Datos prediales eliminados con éxito");
                System.out.println("DATOS PREDIALES ELIMINADOS CON ÉXITO");
                ejecutar.close();
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron datos prediales para eliminar");
                System.out.println("NO SE ENCONTRARON DATOS PREDIALES PARA ELIMINAR");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar datos prediales: " + e.getMessage());
            System.out.println("ERROR SQL: " + e);
        }
    }

}
