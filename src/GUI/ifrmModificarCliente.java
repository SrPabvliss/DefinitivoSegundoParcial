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
public class ifrmModificarCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form ifrmModificarCliente
     */
    Administrador admin2 = new Administrador ();
    public ifrmModificarCliente() {
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

        btnActualizar = new javax.swing.JButton();
        lblEstado = new javax.swing.JLabel();
        lblDirec = new javax.swing.JLabel();
        txtdirec = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtNacion = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        lblcedula = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtcedu = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        lblNacion = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        btnConsul = new javax.swing.JButton();
        lblTelefono = new javax.swing.JLabel();

        setClosable(true);

        btnActualizar.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });

        lblEstado.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblEstado.setText("Estado Civil:");

        lblDirec.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblDirec.setText("Direccion:");

        lblEdad.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblEdad.setText("Edad:");

        lblSexo.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblSexo.setText("Sexo:");

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        lblcedula.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblcedula.setText("Cedula de identidad:");

        lblFecha.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblFecha.setText("Fecha de nacimiento:");

        lblNombre.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblNombre.setText("Nombre:");

        lblNacion.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblNacion.setText("Nacionalidad:");

        lblApellido.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblApellido.setText("Apellido:");

        btnConsul.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        btnConsul.setText("Consultar");
        btnConsul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsulMouseClicked(evt);
            }
        });

        lblTelefono.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblTelefono.setText("Telefono:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(btnConsul)
                .addGap(43, 43, 43)
                .addComponent(btnActualizar)
                .addGap(140, 140, 140))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblTelefono)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblEstado)
                                .addComponent(lblFecha)
                                .addComponent(lblNacion))
                            .addGap(46, 46, 46)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEstado)
                                .addComponent(txtFecha)
                                .addComponent(txtNacion)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblSexo)
                                .addComponent(lblEdad)
                                .addComponent(lblApellido)
                                .addComponent(lblNombre)
                                .addComponent(lblDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblcedula))
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtdirec, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                .addComponent(txtNom)
                                .addComponent(txtApellido)
                                .addComponent(txtSexo)
                                .addComponent(txtcedu, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(42, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(442, Short.MAX_VALUE)
                .addComponent(lblTelefono)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnConsul))
                .addGap(31, 31, 31))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(105, 105, 105)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblcedula)
                        .addComponent(txtcedu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDirec)
                        .addComponent(txtdirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(15, 15, 15)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNombre)
                        .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(8, 8, 8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblApellido)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSexo)
                        .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEdad)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(15, 15, 15)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(lblEstado)
                            .addGap(18, 18, 18)
                            .addComponent(lblFecha))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNacion))
                    .addGap(15, 15, 15)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(105, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void btnConsulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsulMouseClicked
        admin2.consultaCliente(txtNom, txtApellido, txtTelefono, txtdirec, txtFecha, txtcedu, txtEstado, txtNacion, txtSexo, txtEdad);// TODO add your handling code here:
    }//GEN-LAST:event_btnConsulMouseClicked

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
     admin2.actualizarCliente(txtcedu, txtNom, txtApellido, txtEdad, txtSexo, txtdirec, txtTelefono, txtFecha, txtEstado, txtNacion);        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsul;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblDirec;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNacion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblcedula;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNacion;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtcedu;
    private javax.swing.JTextField txtdirec;
    // End of variables declaration//GEN-END:variables
}
