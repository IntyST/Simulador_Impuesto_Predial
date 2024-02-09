/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DIU.Vista;
/**
 *
 * @author Usuario
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public PantallaPrincipal() {
        initComponents();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        capa5 = new javax.swing.JPanel();
        pnlAdmin3 = new javax.swing.JPanel();
        lblAdmin3 = new javax.swing.JLabel();
        pnlConsulta = new javax.swing.JPanel();
        lblConsulta = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblGADM = new javax.swing.JLabel();
        lblImpuestoPredial = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        capa5.setBackground(new java.awt.Color(0, 204, 204));

        pnlAdmin3.setBackground(new java.awt.Color(0, 102, 102));

        lblAdmin3.setBackground(new java.awt.Color(255, 255, 255));
        lblAdmin3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAdmin3.setForeground(new java.awt.Color(255, 255, 255));
        lblAdmin3.setText("   Administrador");
        lblAdmin3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdmin3lblAdminMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlAdmin3Layout = new javax.swing.GroupLayout(pnlAdmin3);
        pnlAdmin3.setLayout(pnlAdmin3Layout);
        pnlAdmin3Layout.setHorizontalGroup(
            pnlAdmin3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAdmin3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
        );
        pnlAdmin3Layout.setVerticalGroup(
            pnlAdmin3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAdmin3, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        pnlConsulta.setBackground(new java.awt.Color(0, 102, 102));

        lblConsulta.setBackground(new java.awt.Color(0, 0, 0));
        lblConsulta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblConsulta.setForeground(new java.awt.Color(255, 255, 255));
        lblConsulta.setText("   Consultar Predio");

        javax.swing.GroupLayout pnlConsultaLayout = new javax.swing.GroupLayout(pnlConsulta);
        pnlConsulta.setLayout(pnlConsultaLayout);
        pnlConsultaLayout.setHorizontalGroup(
            pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        pnlConsultaLayout.setVerticalGroup(
            pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultaLayout.createSequentialGroup()
                .addComponent(lblConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout capa5Layout = new javax.swing.GroupLayout(capa5);
        capa5.setLayout(capa5Layout);
        capa5Layout.setHorizontalGroup(
            capa5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(capa5Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(capa5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlAdmin3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        capa5Layout.setVerticalGroup(
            capa5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(capa5Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(pnlAdmin3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153)
                .addComponent(pnlConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        lblTitulo.setText("SIMULADOR DE IMPUESTO PREDIAL");

        lblGADM.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Documentos\\NetBeansProjects\\SimuladorImpuestoPredial\\src\\main\\resources\\Imgs\\Logo_GADM.jpg")); // NOI18N

        lblImpuestoPredial.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Documentos\\NetBeansProjects\\SimuladorImpuestoPredial\\src\\main\\resources\\Imgs\\Impuesto_predial.jpg")); // NOI18N

        escritorio.setLayer(capa5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(lblTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(lblGADM, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(lblImpuestoPredial, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(capa5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImpuestoPredial)
                            .addComponent(lblGADM)))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(lblTitulo)))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(capa5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblGADM, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblImpuestoPredial)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblAdmin3lblAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdmin3lblAdminMouseClicked
        PantallaAdministrador pantallaAdmin  = new PantallaAdministrador();
        pantallaAdmin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblAdmin3lblAdminMouseClicked

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel capa5;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel lblAdmin3;
    private javax.swing.JLabel lblConsulta;
    private javax.swing.JLabel lblGADM;
    private javax.swing.JLabel lblImpuestoPredial;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlAdmin3;
    private javax.swing.JPanel pnlConsulta;
    // End of variables declaration//GEN-END:variables
}
