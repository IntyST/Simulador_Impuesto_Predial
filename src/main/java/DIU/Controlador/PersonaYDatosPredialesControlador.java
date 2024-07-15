/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

import DIU.Modelo.PersonaYDatosPredialesModelo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class PersonaYDatosPredialesControlador {

    private PersonaYDatosPredialesModelo DatosPersonaPredios;
    ConexionBDD conectar = new ConexionBDD();
    Connection conectado = (Connection) conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;//para leer u obtener datos
    int res;//para escribir

    public PersonaYDatosPredialesControlador() {

    }

    public PersonaYDatosPredialesModelo getPersona() {
        return DatosPersonaPredios;
    }

    public void setPersona(PersonaYDatosPredialesModelo DatosPersonaPredios) {
        this.DatosPersonaPredios = DatosPersonaPredios;
    }

    //TRANSACCIONABILIDAD
    //CREAR 
    public void crearPersona(PersonaYDatosPredialesModelo p) {
        try {
            String sql = "call sp_InsertarPersonaYDatosPrediales('" + p.getCedula() + "','" + p.getNombres()
                    + "','" + p.getApellidos() + "','" + p.getCorreo() + "','" + p.getTelefono()
                    + "','" + p.getEdad() + "','" + p.getCodCastralPred() + "','" + p.getTipoPred()
                    + "','" + p.getDireccionPropie() + "','" + p.getAreaTotalPred() + "','" + p.getAreaConstruccionPred()
                    + "','" + p.getValorTerrenoPred() + "','" + p.getValorEdificacionPred() + "','" + p.getValorComercialPred() + "');";

            ejecutar = (PreparedStatement) conectado.prepareCall(sql);

            int res = ejecutar.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Datos de persona y prediales creados con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "Error al crear los datos");
            }
            ejecutar.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la conexión a la base de datos");
        }
    }

    //CONSULTA DE TODA LA TABLA
    public ArrayList<Object[]> datosPersonasYPrediales() {
        ArrayList<Object[]> listaTotalRegistros = new ArrayList<>();
        try {
            String SQL = "call sp_Lista_Personas_Datos_Prediales()";
            ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
            //excuteQuery cuando consulto la bdd
            //Recibo un result set cuando consulto
            ResultSet res = ejecutar.executeQuery();
            int cont = 1;
            while (res.next()) {
                Object[] fila = new Object[15];
                for (int i = 0; i < 15; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                fila[0] = cont;
                listaTotalRegistros.add(fila);
                cont++;
            }
            ejecutar.close();
            return listaTotalRegistros;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }

        return null;
    }

    public ArrayList<Object[]> buscarPersonaYDatosPrediales(String cedula) {
        ArrayList<Object[]> listaTotalRegistros = new ArrayList<>();
        try {
            String SQL = "CALL sp_BuscarPersonaYDatosPrediales(?)";
            ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
            ejecutar.setString(1, cedula);
            ResultSet res = ejecutar.executeQuery();
            int cont = 1;
            while (res.next()) {
                Object[] fila = new Object[17]; // Ajusta el tamaño del arreglo para incluir todas las columnas
                for (int i = 0; i < 17; i++) { // Ajusta el límite del bucle para coincidir con el número de columnas
                    fila[i] = res.getObject(i + 1);
                }
                fila[0] = cont;
                listaTotalRegistros.add(fila);
                cont++;
            }
            ejecutar.close();
            return listaTotalRegistros;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }
        return null;
    }
    public void actualizarPersonaYDatosPrediales(PersonaYDatosPredialesModelo p){
        try {
            String sql = "call sp_ActualizarPersonaYDatosPrediales('" + p.getCedula() + "','" + p.getNombres()
                    + "','" + p.getApellidos() + "','" + p.getCorreo() + "','" + p.getTelefono()
                    + "','" + p.getEdad() + "','" + p.getCodCastralPred() + "','" + p.getTipoPred()
                    + "','" + p.getDireccionPropie() + "','" + p.getAreaTotalPred() + "','" + p.getAreaConstruccionPred()
                    + "','" + p.getValorTerrenoPred() + "','" + p.getValorEdificacionPred() + "','" + p.getValorComercialPred() + "');";

            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            int res=ejecutar.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog
        (null, "Persona actualizada con éxito");
                System.out.println("PERSONA CREADA CON ÉXITO");
                ejecutar.close();
            }else{
                JOptionPane.showMessageDialog
        (null, "Revisar los datos ingresados al momento de querer actualizar");
                System.out.println("REVISAR LA INFORMACIÓN INGRESADA");
            }
            } catch (SQLException e) {
                System.out.println("COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }
    }
    
    
    public void eliminarPersonaYDatosPrediales(String cedula){
        try {
            
            String sql = "call sp_EliminarPersonaYDatosPrediales('"+cedula+"');";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            //executeUpdate cuando escribo la bdd
            //int res cuando escribo
            int res=ejecutar.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog
        (null, "Persona eliminada con éxito");
                System.out.println("PERSONA CREADA CON ÉXITO");
                ejecutar.close();
            }else{
                JOptionPane.showMessageDialog
        (null, "Revisar los datos ingresados al momento de querer eliminar");
                System.out.println("REVISAR LA INFORMACIÓN INGRESADA");
            }
            } catch (SQLException e) {
                System.out.println("COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }
    }
}
