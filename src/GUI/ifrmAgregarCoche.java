/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;
 
import SQL.Administrador;

/**
 *
 * @author sebas
 */
public class ifrmAgregarCoche extends javax.swing.JInternalFrame {
 Administrador admin = new Administrador ();
    /**
     * Creates new form ifrmAgregar
     */
    public ifrmAgregarCoche() {
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

        txtMarca = new javax.swing.JTextField();
        txtAnio = new javax.swing.JTextField();
        txtColorin = new javax.swing.JTextField();
        lblIdAgencia = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtIdGarage = new javax.swing.JTextField();
        lblAnio = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblIdGarage = new javax.swing.JLabel();
        lblMatricula = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        txtIdAgencia = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        lblColor = new javax.swing.JLabel();
        btnAgreg = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(459, 603));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 225, 191, -1));

        txtAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnioActionPerformed(evt);
            }
        });
        getContentPane().add(txtAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 367, 83, -1));

        txtColorin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorinActionPerformed(evt);
            }
        });
        getContentPane().add(txtColorin, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 259, 191, -1));

        lblIdAgencia.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblIdAgencia.setText("Id Agencia:");
        getContentPane().add(lblIdAgencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 331, -1, -1));

        lblModelo.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblModelo.setText("Modelo:");
        getContentPane().add(lblModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 198, -1, -1));
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 404, 131, -1));
        getContentPane().add(txtIdGarage, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 293, 55, -1));

        lblAnio.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblAnio.setText("Año:");
        getContentPane().add(lblAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 367, 80, -1));

        lblMarca.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblMarca.setText("Marca:");
        getContentPane().add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 231, -1, -1));

        lblPrecio.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblPrecio.setText("Precio:");
        getContentPane().add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 411, -1, -1));

        lblIdGarage.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblIdGarage.setText("Id Garage:");
        getContentPane().add(lblIdGarage, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 297, -1, -1));

        lblMatricula.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblMatricula.setText("Matricula:");
        getContentPane().add(lblMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 152, 69, -1));
        getContentPane().add(txtMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 148, 191, -1));
        getContentPane().add(txtIdAgencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 327, 191, -1));

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });
        getContentPane().add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 191, 191, -1));

        lblColor.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblColor.setText("Color:");
        getContentPane().add(lblColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 264, -1, -1));

        btnAgreg.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        btnAgreg.setText("Agregar");
        btnAgreg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregMouseClicked(evt);
            }
        });
        getContentPane().add(btnAgreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 488, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Carro.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 450, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EncabezadoAgregarPersonas.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2090, 1120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnioActionPerformed

    private void txtColorinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorinActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void btnAgregMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregMouseClicked
      admin.agregarVehiculo(txtMatricula, txtIdAgencia, txtIdGarage, txtModelo, txtColorin, txtAnio, txtMarca, txtPrecio);        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgreg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAnio;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblIdAgencia;
    private javax.swing.JLabel lblIdGarage;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtColorin;
    private javax.swing.JTextField txtIdAgencia;
    private javax.swing.JTextField txtIdGarage;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
