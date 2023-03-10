/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

// ARREGLAR LA SELECCION DE SEXO Y QUE APAREZCA SOLAMENTE CUANDO SE APALSTE PERSONALIZADO Y NO ELEGIR MAS DE UNO
import SQL.Usuario;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;

public class frmRegistro extends javax.swing.JFrame {

    Usuario us = new Usuario();

    public frmRegistro() {
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

        jTextField3 = new javax.swing.JTextField();
        fondo = new javax.swing.JPanel();
        lblCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        lblPrimerNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblSegundoNombre = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblPrimerApellido = new javax.swing.JLabel();
        txtNacionalidad = new javax.swing.JTextField();
        lblSegundoApellido = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        lblEstadoCivil = new javax.swing.JLabel();
        lblFechaNacimiento = new javax.swing.JLabel();
        lblDia = new javax.swing.JLabel();
        lblMes = new javax.swing.JLabel();
        lblAnio = new javax.swing.JLabel();
        lblFlecha = new javax.swing.JLabel();
        lblRegistroUsuario = new javax.swing.JLabel();
        lblRegistrarse = new javax.swing.JToggleButton();
        cmbEstado = new javax.swing.JComboBox<>();
        cmbDia = new javax.swing.JComboBox<>();
        cmbMes = new javax.swing.JComboBox<>();
        cmbAnio = new javax.swing.JComboBox<>();
        cmbSexo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jTextField3.setPreferredSize(new java.awt.Dimension(150, 20));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setPreferredSize(new java.awt.Dimension(630, 360));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCedula.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblCedula.setText("C??dula: ");
        fondo.add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        txtCedula.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        txtCedula.setPreferredSize(new java.awt.Dimension(150, 30));
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        fondo.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        lblPrimerNombre.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblPrimerNombre.setText("Nombre:");
        fondo.add(lblPrimerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        txtNombre.setPreferredSize(new java.awt.Dimension(150, 30));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        fondo.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        lblSegundoNombre.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblSegundoNombre.setText("Apellido:");
        fondo.add(lblSegundoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        txtApellido.setPreferredSize(new java.awt.Dimension(150, 30));
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        fondo.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        lblPrimerApellido.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblPrimerApellido.setText("Nacionalidad:");
        fondo.add(lblPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        txtNacionalidad.setPreferredSize(new java.awt.Dimension(150, 30));
        txtNacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNacionalidadActionPerformed(evt);
            }
        });
        fondo.add(txtNacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        lblSegundoApellido.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblSegundoApellido.setText("Telefono:");
        fondo.add(lblSegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        txtTelefono.setPreferredSize(new java.awt.Dimension(150, 30));
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        fondo.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        lblTelefono.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblTelefono.setText("Direccion:");
        fondo.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        txtDireccion.setPreferredSize(new java.awt.Dimension(150, 30));
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        fondo.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        lblSexo.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblSexo.setText("Sexo:");
        fondo.add(lblSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, 20));

        lblEstadoCivil.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblEstadoCivil.setText("Estado Civil:");
        fondo.add(lblEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));

        lblFechaNacimiento.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblFechaNacimiento.setText("Fecha de nacimiento:");
        fondo.add(lblFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        lblDia.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblDia.setText("Dia:");
        fondo.add(lblDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));

        lblMes.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblMes.setText("Mes:");
        fondo.add(lblMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, -1, -1));

        lblAnio.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblAnio.setText("A??o:");
        fondo.add(lblAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, -1, -1));

        lblFlecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFlecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-izquierda-c??rculo-60.png"))); // NOI18N
        lblFlecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFlecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFlechaMouseClicked(evt);
            }
        });
        fondo.add(lblFlecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        lblRegistroUsuario.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        lblRegistroUsuario.setText("Registro de Usuario");
        fondo.add(lblRegistroUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        lblRegistrarse.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        lblRegistrarse.setText("Registrarse");
        lblRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblRegistrarseActionPerformed(evt);
            }
        });
        fondo.add(lblRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, -1, -1));

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero", "Casado", "Divorciado", "Viudo" }));
        cmbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstadoActionPerformed(evt);
            }
        });
        fondo.add(cmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 110, -1));

        cmbDia.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        cmbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        fondo.add(cmbDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 60, 20));

        cmbMes.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        cmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        fondo.add(cmbMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, -1, -1));

        cmbAnio.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        cmbAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930" }));
        fondo.add(cmbAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, -1));

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "No Especificado" }));
        fondo.add(cmbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 110, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoRegistro.png"))); // NOI18N
        fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtNacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNacionalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNacionalidadActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void lblFlechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFlechaMouseClicked
        this.setVisible(false);
        frmUsuario user = new frmUsuario();
        user.setVisible(true);
    }//GEN-LAST:event_lblFlechaMouseClicked

    private void lblRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblRegistrarseActionPerformed
        int conf = us.registro(txtNombre, txtApellido, txtTelefono, txtCedula, txtDireccion, txtNacionalidad);
        us.almacenarBase(conf, txtNombre, txtApellido, txtTelefono, txtCedula, txtDireccion, txtNacionalidad, cmbSexo, cmbEstado, cmbDia, cmbMes, cmbAnio);
        if (conf == 6) {
            this.setVisible(false);
            frmUsuario user = new frmUsuario();
            user.setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_lblRegistrarseActionPerformed

    private void cmbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEstadoActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
////        FlatLightLaf.setup();
////        UIManager.put("Button.arc", 999);
////        UIManager.put("Component.arc", 999);
////        UIManager.put("ProgressBar.arc", 999);
////        UIManager.put("TextComponent.arc", 999);
////        
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new frmRegistro().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbAnio;
    private javax.swing.JComboBox<String> cmbDia;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbMes;
    private javax.swing.JComboBox<String> cmbSexo;
    public static javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblAnio;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblFlecha;
    private javax.swing.JLabel lblMes;
    private javax.swing.JLabel lblPrimerApellido;
    private javax.swing.JLabel lblPrimerNombre;
    private javax.swing.JToggleButton lblRegistrarse;
    private javax.swing.JLabel lblRegistroUsuario;
    private javax.swing.JLabel lblSegundoApellido;
    private javax.swing.JLabel lblSegundoNombre;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
