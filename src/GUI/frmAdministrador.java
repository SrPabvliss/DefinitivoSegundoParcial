/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Det-Pc
 */
public class frmAdministrador extends javax.swing.JFrame {
    
    
    
    /**
     * Creates new form frmAdministrador
     */
    public frmAdministrador() {
        initComponents();
        this.setLocationRelativeTo(null);
         


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
        lblFlecha = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblContrasenia = new javax.swing.JLabel();
        txtContrasenia = new javax.swing.JPasswordField();
        btnIngresoS = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFlecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFlecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-izquierda-círculo-60.png"))); // NOI18N
        lblFlecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFlecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFlechaMouseClicked(evt);
            }
        });
        jPanel1.add(lblFlecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-configuración-del-administrador-96.png"))); // NOI18N
        jPanel1.add(lblAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 236, -1));

        lblNombre.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblNombre.setText("Nombre:");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 143, 63, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 139, 152, -1));

        lblContrasenia.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblContrasenia.setText("Contraseña:");
        jPanel1.add(lblContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 177, -1, -1));
        jPanel1.add(txtContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 173, 152, -1));

        btnIngresoS.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        btnIngresoS.setText("Ingresar");
        btnIngresoS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoSActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresoS, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 100, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Wallpaper.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 270));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void lblFlechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFlechaMouseClicked
        this.setVisible(false);
        frmLogin login = new frmLogin();
        login.setVisible(true);
    }//GEN-LAST:event_lblFlechaMouseClicked

    private void btnIngresoSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoSActionPerformed
        
       String usuario = txtNombre.getText();
       String contrasena = "";
       String contr = "root";
      
       char [] password = txtContrasenia.getPassword();
        for (int i = 0; i < password.length ; i++) {
            contrasena +=  password [i];
        }
        
        switch (usuario) {
            case "Pablo":
                if (contrasena.equals(contr)) {
                    System.out.println("Ingreso correcto");
                 this.setVisible(false);
                 frmEleccionAdmin adm = new frmEleccionAdmin();
                 adm.toFront();
                 adm.show();    
                }else
                     JOptionPane.showMessageDialog(rootPane, "Clave Incorrecta");
                    
    
                break;
            case "Josue":
                if (contrasena.equals(contr)) {
                    System.out.println("Ingreso correcto");
                 this.setVisible(false);
                 frmEleccionAdmin adm = new frmEleccionAdmin();
                 adm.toFront();
                 adm.show();    
                }else
                     JOptionPane.showMessageDialog(rootPane, "Clave Incorrecta");
                    
    
                break;
                
            case "Paulo":
                if (contrasena.equals(contr)) {
                    System.out.println("Ingreso correcto");
                 this.setVisible(false);
                 frmEleccionAdmin adm = new frmEleccionAdmin();
                 adm.toFront();
                 adm.show();    
                }else
                     JOptionPane.showMessageDialog(rootPane, "Clave Incorrecta");
                    
    
                break;
            default:
                JOptionPane.showMessageDialog(rootPane, "Usuario Incorrecto");
                System.out.println("Usuario Incorrecto");
                
        }
        
        
    }//GEN-LAST:event_btnIngresoSActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(frmAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(frmAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(frmAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(frmAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new frmAdministrador().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresoS;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblFlecha;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
