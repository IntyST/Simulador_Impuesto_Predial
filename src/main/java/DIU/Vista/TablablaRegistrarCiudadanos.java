/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package DIU.Vista;

import DIU.Controlador.PersonaControlador;
import DIU.Modelo.PersonaModelo;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pablo
 */
public class TablablaRegistrarCiudadanos extends javax.swing.JInternalFrame {

    ArrayList<PersonaModelo> listaPersonaModelo = new ArrayList<>();
    DefaultTableModel modelo = new DefaultTableModel();
    // private Date date;

    /**
     * Creates new form Lista_de_Usuarios
     */
    public TablablaRegistrarCiudadanos() {
        initComponents();
        setModelo();
    }

    public void setModelo() {
        String[] cabecera = {"Nro.", "Nombres", "Apellidos",
            "Cedula",
            "Correo Electrónico",
            "Teléfono",
            "Fecha de Nacimiento"};
        modelo.setColumnIdentifiers(cabecera);
        tblPersona.setModel(modelo);

    }

    public void setDatos() {
        Object[] Datosfila = new Object[modelo.getColumnCount()];
        int nro = 1;
        for (PersonaModelo datos : listaPersonaModelo) {
            Datosfila[0] = nro;
            Datosfila[1] = datos.getNombres();
            Datosfila[2] = datos.getApellidos();
            Datosfila[3] = datos.getCedula();
            Datosfila[4] = datos.getCorreo();
            Datosfila[5] = datos.getTelefono();
            Datosfila[6] = datos.getFechaNacimiento();
            nro++;
            modelo.addRow(Datosfila);

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        tbnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtFecha = new com.toedter.calendar.JDateChooser();
        lblNombres = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lbltelefono = new javax.swing.JLabel();
        lblfechaN = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersona = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestor de ciudadanos ");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("INGRESE LOS SIGUIENTES DATOS"));

        btnLimpiar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnCrear.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        tbnEliminar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tbnEliminar.setText("Eliminar");
        tbnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        txtFecha.setDateFormatString("yyyy-MM-dd");

        lblNombres.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblNombres.setText("Nombres:");

        lblApellidos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblApellidos.setText("Apellidos:");

        lblCedula.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCedula.setText("Cédula:");

        lblCorreo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCorreo.setText("Correo electrónico:");

        lbltelefono.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbltelefono.setText("Teléfono:");

        lblfechaN.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblfechaN.setText("Fecha de nacimiento:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbltelefono, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombres)
                            .addComponent(lblApellidos)
                            .addComponent(lblCedula)
                            .addComponent(lblfechaN))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                        .addComponent(txtApellidos)
                                        .addComponent(txtCedula))
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(127, 127, 127)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tbnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)))
                .addGap(64, 85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombres)
                            .addComponent(btnCrear)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCedula)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(tbnEliminar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLimpiar)
                        .addGap(38, 38, 38)
                        .addComponent(btnModificar)
                        .addGap(34, 34, 34)
                        .addComponent(btnBuscar)
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCorreo)
                                .addGap(18, 18, 18)
                                .addComponent(lbltelefono)
                                .addGap(18, 18, 18)
                                .addComponent(lblfechaN))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        tblPersona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblPersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPersonaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPersona);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 943, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // Obtener los datos de los campos de texto u otros componentes de entrada
        String nombres = txtNombres.getText();
        String apellidos = txtApellidos.getText();
        String cedula = txtCedula.getText();
        String correo = txtCorreo.getText();
        String telefono = txtTelefono.getText();
        Date fechaNacimiento = txtFecha.getDate();

        // Crear una instancia de PersonaModelo con los datos obtenidos
        PersonaModelo nuevaPersona = new PersonaModelo(cedula, nombres, apellidos, correo, telefono, fechaNacimiento);

        // Crear una instancia de PersonaControlador
        PersonaControlador controlador = new PersonaControlador();

        // Llamar al método crearPersona
        controlador.crearPersona(nuevaPersona);
        setDatos();
        limpiarTabla();
        cargarTabla();

    }//GEN-LAST:event_btnCrearActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        PersonaControlador pC = new PersonaControlador();
        ArrayList<Object[]> listaP = pC.datosPersona();
        for (Object[] filas : listaP) {
            modelo.addRow(filas);

        }
        tblPersona.setModel(modelo);
        limpiarTabla();
        cargarTabla();
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarEntradas();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // Obtener la cédula del campo de texto
        String cedula = txtCedula.getText();

        // Crear una instancia de PersonaModelo con la cédula
        PersonaModelo personaBuscada = new PersonaModelo();
        personaBuscada.setCedula(cedula);

        // Crear una instancia de PersonaControlador
        PersonaControlador controlador = new PersonaControlador();

        // Llamar al método recuperarDatosPersona
        controlador.recuperarDatosPersona(personaBuscada);

        // Limpiar la tabla
        limpiarTabla();

        // Agregar la persona buscada a la lista de personas
        listaPersonaModelo.clear();
        listaPersonaModelo.add(personaBuscada);

        // Llamar al método setDatos para agregar las personas a la tabla
        setDatos();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tblPersonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPersonaMouseClicked
        DefaultTableModel dtm = (DefaultTableModel) tblPersona.getModel();
        int filaSeleccionada = tblPersona.getSelectedRow();
        if (filaSeleccionada != -1) { // Verifica si se ha seleccionado una fila válida
            // Obtener los datos de la fila seleccionada y establecerlos en los campos correspondientes
            txtCedula.setText((String) dtm.getValueAt(filaSeleccionada, 3));
            txtNombres.setText((String) dtm.getValueAt(filaSeleccionada, 1));
            txtApellidos.setText((String) dtm.getValueAt(filaSeleccionada, 2));
            txtCorreo.setText((String) dtm.getValueAt(filaSeleccionada, 4));
            txtTelefono.setText((String) dtm.getValueAt(filaSeleccionada, 5));
            txtFecha.setDate((Date) dtm.getValueAt(filaSeleccionada, 6));
        }
    }//GEN-LAST:event_tblPersonaMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // Obtener los datos de los campos de texto u otros componentes de entrada
        String cedula = txtCedula.getText();
        String nombres = txtNombres.getText();
        String apellidos = txtApellidos.getText();
        String correo = txtCorreo.getText();
        String telefono = txtTelefono.getText();
        Date fechaNacimiento = txtFecha.getDate();

        // Crear una instancia de PersonaModelo con los datos obtenidos
        PersonaModelo personaModificada = new PersonaModelo(cedula, nombres, apellidos, correo, telefono, fechaNacimiento);

        // Crear una instancia de PersonaControlador
        PersonaControlador controlador = new PersonaControlador();

        // Llamar al método actualizarPersona
        controlador.actualizarPersona(personaModificada);

        // Actualizar la tabla
        limpiarTabla();
        cargarTabla();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        limpiarTabla();
        cargarTabla();
    }//GEN-LAST:event_formMouseClicked

    private void tbnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnEliminarActionPerformed
        String cedula = txtCedula.getText();
        PersonaControlador pC = new PersonaControlador();
        pC.eliminarPersonaPorCedula(cedula); // Llama al nuevo procedimiento almacenado
        limpiarTabla();
        cargarTabla();
        limpiarEntradas();
    }//GEN-LAST:event_tbnEliminarActionPerformed
    public void limpiarTabla() {
        int a = modelo.getRowCount() - 1;

        for (int i = a; i >= 0; i--) {

            modelo.removeRow(i);
        }
    }

    public void limpiarEntradas() {
        txtNombres.setText("");
        txtApellidos.setText("");
        txtCedula.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
        txtFecha.setDate(null);
    }

    private void cargarTabla() {
        PersonaControlador pC = new PersonaControlador();
        ArrayList<Object[]> listaP = pC.datosPersona();
        for (Object[] fila : listaP) {
            modelo.addRow(fila);
        }
        tblPersona.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblfechaN;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JTable tblPersona;
    private javax.swing.JButton tbnEliminar;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
