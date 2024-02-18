/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Map;
import com.itextpdf.text.Image;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class PDFConsultaPagos {

    public void generarPDF(String cedula, Object[][] datosPago, Map<String, String> datosPersona) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("ConsultaPagos_" + cedula + ".pdf"));
            document.open();

            // Agregar el título con espacio adicional
            Paragraph titulo = new Paragraph("Informe de Impuesto Predial a Pagar", new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA, 24, com.itextpdf.text.Font.BOLD));
            titulo.setAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
            document.add(titulo);
            // Agregar espacio adicional después del título
            document.add(new Paragraph("\n\n\n"));

            // Agregar la imagen en la parte superior derecha con ajuste de posición
            Image imagen = null;
            try {
                imagen = Image.getInstance("C:\\Users\\Usuario\\OneDrive\\Documentos\\NetBeansProjects\\SimuladorImpuestoPredial\\src\\main\\resources\\Imgs\\Escudo_de_Ibarra.png");
                imagen.scaleToFit(175, 125); // Ajuste el tamaño de la imagen según sea necesario
                imagen.setAbsolutePosition(450, 630); // Ajuste la posición de la imagen según sea necesario

            } catch (IOException e) {
                e.printStackTrace();
            }

            // Agregar los datos de la persona
            if (imagen != null) {
                document.add(imagen);
            }
            document.add(new Paragraph("Datos de la persona:"));
            for (Map.Entry<String, String> entry : datosPersona.entrySet()) {
                document.add(new Paragraph(entry.getKey() + ": " + entry.getValue()));
            }
            document.add(new Paragraph("\n"));

            // Agregar los datos de pago
            document.add(new Paragraph("Consulta de pagos para la cédula: " + cedula));
            document.add(new Paragraph("\n"));

            double totalPredios = 0; // Inicializar el total de todos los predios

            for (Object[] fila : datosPago) {
                document.add(new Paragraph("Código Catastral: " + fila[0])); // Agregar el código catastral
                document.add(new Paragraph("Fecha inicio de pago: " + fila[1]));
                document.add(new Paragraph("Fecha limite de pago: " + fila[2]));
                document.add(new Paragraph("Descripción: " + fila[3]));
                document.add(new Paragraph("Sub total a pagar: " + fila[5]));
                document.add(new Paragraph("\n"));

                totalPredios += Double.parseDouble(fila[5].toString()); // Sumar al total de todos los predios
            }

            // Agregar el total de todos los predios al final del PDF
            document.add(new Paragraph("Total a pagar por todos los predios: " + totalPredios));

            // Agregar la fecha de emisión en la parte inferior izquierda
            Paragraph fechaEmision = new Paragraph("Fecha emisión: " + new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
            fechaEmision.setAlignment(com.itextpdf.text.Element.ALIGN_LEFT);
            document.add(fechaEmision);

            document.close();
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
