/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

import DIU.Modelo.ConsultaPagosModelo;
import DIU.Modelo.DatosPredialesModelo;
import DIU.Modelo.PersonaModelo;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class PlantillaPDFConsultaPagosControlador {

    String nombrePropietario;
    String fecha;
    String rutaImagen;
    public List<PersonaModelo> personas;
    public List<ConsultaPagosModelo> consultas;
    public List<DatosPredialesModelo> predios;

    Document documento = new Document();

    public void crearPDF(String rutaArchivo) {
        try {
            PdfWriter.getInstance(documento, new FileOutputStream(rutaArchivo));
            documento.open();

            // Agregar título
            Paragraph titulo = new Paragraph("Informe de Impuesto Predial", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18));
            titulo.setAlignment(Element.ALIGN_CENTER);
            documento.add(titulo);

            // Agregar información del propietario
            for (PersonaModelo persona : personas) {
                documento.add(new Paragraph("Nombre: " + persona.getNombres() + " " + persona.getApellidos()));
                documento.add(new Paragraph("Cédula: " + persona.getCedula()));
                documento.add(new Paragraph("Correo: " + persona.getCorreo()));
                documento.add(new Paragraph("Teléfono: " + persona.getTelefono()));
                documento.add(new Paragraph("\n"));
            }

            // Agregar información de los predios
            for (DatosPredialesModelo predio : predios) {
                documento.add(new Paragraph("Código Catastral: " + predio.getCodCastralPred()));
                documento.add(new Paragraph("Tipo de Predio: " + predio.getTipoPred()));
                documento.add(new Paragraph("Dirección: " + predio.getDireccionPropie()));
                documento.add(new Paragraph("Área Total: " + predio.getAreaTotalPred()));
                documento.add(new Paragraph("Área de Construcción: " + predio.getAreaConstruccionPred()));
                documento.add(new Paragraph("Valor del Terreno: " + predio.getValorTerrenoPred()));
                documento.add(new Paragraph("Valor de la Edificación: " + predio.getValorEdificacionPred()));
                documento.add(new Paragraph("Valor Comercial: " + predio.getValorComercialPred()));
                documento.add(new Paragraph("\n"));
            }

            // Agregar información de los pagos
            for (ConsultaPagosModelo consulta : consultas) {
                documento.add(new Paragraph("Fecha de ingreso: " + consulta.getFecha_ingreso_pago()));
                documento.add(new Paragraph("Fecha de vencimiento: " + consulta.getFecha_vencimiento_pago()));
                documento.add(new Paragraph("Descripción: " + consulta.getDescripcion_pago()));
                documento.add(new Paragraph("Subtotal a pagar: " + consulta.getSub_total_pago()));
                documento.add(new Paragraph("\n"));
            }

            documento.close();
        JOptionPane.showMessageDialog(null, "El archivo PDF se a creado correctamente!");
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch(DocumentException e){
            System.err.println(e.getMessage());
        }
        
    }
    }


