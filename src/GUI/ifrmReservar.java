/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import SQL.Conexion;
import SQL.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Det-Pc
 */
public class ifrmReservar extends javax.swing.JInternalFrame {

    Date fechaIncioAlquiler = new Date();
    Date fechaFinAlquiler = new Date();
    Date fechaInicioBD = new Date();
    Date fechaFinalBD = new Date();
    Usuario user = new Usuario();
    Conexion conn = new Conexion();
    Connection con = conn.conection();
    int resultado;

    public ifrmReservar() {
        initComponents();
        user.completarInfoCarro(UsuarioDatos.matricula, txtMarca, txtModelo, txtAnio, txtColor, txtPrecio, txtMatricula);
        for (int i = 1; i <= 12; i++) {
            cmbMesInicio.addItem(String.valueOf(i));
        }
        for (int i = 1; i <= 31; i++) {
            cmbDiaInicio.addItem(String.valueOf(i));
        }

    }

    public void comprobarReserva() {
        //DESDE AQUI SERIA EL NUEVO METODO PARA USUARIO 
        

        fechaIncioAlquiler.setDate(Integer.parseInt(String.valueOf(cmbDiaInicio.getSelectedItem())));
        fechaIncioAlquiler.setYear(2023);
        fechaIncioAlquiler.setMonth(Integer.parseInt(String.valueOf(cmbMesInicio.getSelectedItem())));

        try {
            String sql = "SELECT * FROM alquiler.reserva WHERE reserva.MATRICULA = '" + UsuarioDatos.matricula + "'order by FECHA_FINAL desc;";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                resultado = 1;
                System.out.println("Se ha encontrado el vehiculo");
                String AnioInicio = rs.getString(4).substring(0, 4);
                System.out.println("AnioInicio = " + AnioInicio);
                String MesInicio = rs.getString(4).substring(5, 7);
                System.out.println("MesInicio = " + MesInicio);
                String DiaInicio = rs.getString(4).substring(8, 10);
                System.out.println("DiaInicio = " + DiaInicio);
                fechaInicioBD.setYear(Integer.parseInt(AnioInicio));
                fechaInicioBD.setMonth(Integer.parseInt(MesInicio));
                fechaInicioBD.setDate(Integer.parseInt(DiaInicio));

                String AnioFinal = rs.getString(5).substring(0, 4);
                System.out.println("AnioFinal = " + AnioFinal);
                String MesFinal = rs.getString(5).substring(5, 7);
                System.out.println("MesFinal = " + MesFinal);
                String DiaFinal = rs.getString(5).substring(8, 10);
                System.out.println("DiaFinal = " + DiaFinal);
                fechaFinalBD.setYear(Integer.parseInt(AnioFinal));
                fechaFinalBD.setMonth(Integer.parseInt(MesFinal));
                fechaFinalBD.setDate(Integer.parseInt(DiaFinal));

                lblIndicacion2.setText("Ultima reserva: Desde  " + fechaInicioBD.getYear() + "-" + fechaInicioBD.getMonth() + "-" + fechaInicioBD.getDate() + " hasta " + fechaFinalBD.getYear() + "-" + fechaFinalBD.getMonth() + "-" + fechaFinalBD.getDate());
                completarFechaFinal();
                //Este solo verifica la fecha de inicio de la reserva
                if (fechaIncioAlquiler.getYear() >= fechaFinalBD.getYear() && fechaIncioAlquiler.getYear() >= 2023) {
                    System.out.println("Elegible");
                    completarFechaFinal();
                    if (fechaIncioAlquiler.getMonth() >= fechaInicioBD.getMonth() && fechaIncioAlquiler.getMonth() <= fechaFinalBD.getMonth()) {
                        System.out.println("El mes esta dentro del rango del anterior alquiler, verificando dia");
                        if (!(fechaIncioAlquiler.getDate() >= fechaInicioBD.getDate() && fechaIncioAlquiler.getDate() <= fechaFinalBD.getDate())) {
                            System.out.println("Se puede proceder, el dia esta disponible");
                            
                            completarFechaFinal();
                        } else {
                            
                            JOptionPane.showMessageDialog(null, "El coche ya ha sido alquilado en esa fecha, no se puede alquilar");
                            System.out.println("El coche ya ha sido alquilado en esa fecha, no se puede alquilar");
                        }
                    } else {
                       
                        System.out.println("Se puede proceder al alquiler");
                        completarFechaFinal();
                    }
                } else {
                    System.out.println("Creo que lo resolvi");
                }
            } else {
                resultado = 0;
                System.out.println("Comprobar en tabla vehiculos y agregar");
                revisarEnCoche();
                completarFinal();
            }

            //Verificar si se puede llenar los combo box de esta manera para facilitar la validacion del registro
//            String envioAbase = fechaIncioAlquiler.getYear() + "-" + fechaIncioAlquiler.getMonth() + "-" + fechaIncioAlquiler.getDate();
//            System.out.println("envioAbase = " + envioAbase);

        } catch (SQLException ex) {
            System.out.println("ex = " + ex);
        }

    }

    private void completarFechaFinal() {
        //Segundo menu para escoger la fecha final, los for serian para llenar los combo box
        for (int i = fechaIncioAlquiler.getMonth(); i <= 12; i++) {
            cmbMesFinal.addItem(String.valueOf(i));
        }
        if (Integer.parseInt(String.valueOf(cmbMesFinal.getSelectedItem())) != fechaIncioAlquiler.getMonth()) {

            for (int i = fechaIncioAlquiler.getDate(); i <= 31; i++) {
                cmbDiaFInal.addItem(String.valueOf(i));
            }

        } else if (fechaIncioAlquiler.getMonth() == fechaInicioBD.getMonth()) {
            if (fechaIncioAlquiler.getDate() < fechaInicioBD.getDate()) {
                for (int i = fechaIncioAlquiler.getDate(); i <= fechaInicioBD.getDate(); i++) {

                    if (!(i >= fechaInicioBD.getDate() && i <= fechaFinalBD.getDate())) {
                        cmbDiaFInal.addItem(String.valueOf(i));
                    }
                }
            } else if (fechaIncioAlquiler.getDate() > fechaFinalBD.getDate()) {
                for (int i = fechaIncioAlquiler.getDate(); i <= 31; i++) {

                    if (!(i >= fechaInicioBD.getDate() && i <= fechaFinalBD.getDate())) {
                        cmbDiaFInal.addItem(String.valueOf(i));
                    }
                }
            }
        } else if (fechaIncioAlquiler.getMonth() != fechaInicioBD.getMonth()) {
            for (int i = 1; i <= 31; i++) {
                cmbDiaFInal.addItem(String.valueOf(i));
            }
        }
    }

    private void completarFinal() {
        for (int i = 1; i <= 12; i++) {
            cmbMesFinal.addItem(String.valueOf(i));
        }
        for (int i = 1; i <= 31; i++) {
            cmbDiaFInal.addItem(String.valueOf(i));
        }
    }

    private void comprobarFechaFinal() {
        fechaFinAlquiler.setDate(Integer.parseInt(String.valueOf(cmbDiaFInal.getSelectedItem())));
        fechaFinAlquiler.setYear(2023);
        fechaFinAlquiler.setMonth(Integer.parseInt(String.valueOf(cmbMesFinal.getSelectedItem())));

        if (fechaFinAlquiler.getMonth() == fechaInicioBD.getMonth()) {
            System.out.println("Verificar");
            if (fechaFinAlquiler.getDate() >= fechaInicioBD.getDate() && fechaFinAlquiler.getDate() <= fechaFinalBD.getDate()) {
                JOptionPane.showMessageDialog(null, "Tu reserva esta interfiriendo con una ya existente");
            } else {
                System.out.println("Se puede proceder al alquiler");
            }
        }
    }

    private void revisarEnCoche() {
        try {
            String sql = "SELECT * FROM alquiler.coche WHERE coche.MATRICULA = '" + UsuarioDatos.matricula + "';";
            System.out.println(sql);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                Habilitar(true);
                System.out.println("Se ha encontrado el vehiculo");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ifrmReservar.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void Habilitar(boolean Habilitado) {
        lblDiaFinal.setEnabled(true);
        lblMesFinal.setEnabled(true);
        lblFechaFinal.setEnabled(true);
        lblIndicacion2.setEnabled(true);
        cmbDiaFInal.setEnabled(true);
        cmbMesFinal.setEnabled(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtAnio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cmbDiaInicio = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmbMesInicio = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        lblFechaFinal = new javax.swing.JLabel();
        lblMesFinal = new javax.swing.JLabel();
        cmbMesFinal = new javax.swing.JComboBox<>();
        cmbDiaFInal = new javax.swing.JComboBox<>();
        lblDiaFinal = new javax.swing.JLabel();
        lblIndicacion2 = new javax.swing.JLabel();
        btnFinalizarReserva = new javax.swing.JButton();
        btnVerificar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setBorder(null);
        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Reservar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Fecha de inicio reserva:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 730, 10));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Año:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Marca:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Precio:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Modelo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        txtColor.setEditable(false);
        txtColor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 280, -1));

        txtMarca.setEditable(false);
        txtMarca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMarca.setToolTipText("");
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });
        getContentPane().add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 280, -1));

        txtModelo.setEditable(false);
        txtModelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 280, -1));

        txtAnio.setEditable(false);
        txtAnio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 280, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Color:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        txtPrecio.setEditable(false);
        txtPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 280, -1));

        jLabel9.setText("Matricula:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        txtMatricula.setEditable(false);
        txtMatricula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 280, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Información del vehículo:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        cmbDiaInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbDiaInicioMouseClicked(evt);
            }
        });
        getContentPane().add(cmbDiaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 90, -1));

        jLabel11.setText("Mes:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, 20));

        jLabel12.setText("Día:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 40, 20));

        cmbMesInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbMesInicioMouseClicked(evt);
            }
        });
        getContentPane().add(cmbMesInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 90, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Los cohes solo pueden ser reservados en el año actual*");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, -1));

        lblFechaFinal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFechaFinal.setText("Fecha para finalizar la reserva:");
        lblFechaFinal.setEnabled(false);
        getContentPane().add(lblFechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));

        lblMesFinal.setText("Mes:");
        lblMesFinal.setEnabled(false);
        getContentPane().add(lblMesFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, 20));

        cmbMesFinal.setEnabled(false);
        cmbMesFinal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMesFinalItemStateChanged(evt);
            }
        });
        getContentPane().add(cmbMesFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 90, -1));

        cmbDiaFInal.setEnabled(false);
        getContentPane().add(cmbDiaFInal, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, 90, -1));

        lblDiaFinal.setText("Día:");
        lblDiaFinal.setEnabled(false);
        getContentPane().add(lblDiaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 40, 20));

        lblIndicacion2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblIndicacion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIndicacion2.setText("Se presentan las fechas disponibles *");
        lblIndicacion2.setEnabled(false);
        getContentPane().add(lblIndicacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, -1, -1));

        btnFinalizarReserva.setText("Finalizar reserva");
        btnFinalizarReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizarReserva.setEnabled(false);
        btnFinalizarReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFinalizarReservaMouseClicked(evt);
            }
        });
        getContentPane().add(btnFinalizarReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 190, -1));

        btnVerificar.setText("Verificar disponibilidad");
        btnVerificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerificarMouseClicked(evt);
            }
        });
        getContentPane().add(btnVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 190, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-izquierda-círculo-60.png"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        setBounds(100, 100, 796, 427);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void btnVerificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerificarMouseClicked
        comprobarReserva();
        cmbDiaFInal.removeAllItems();
        cmbMesFinal.removeAllItems();
        if (resultado == 1) {
            completarFechaFinal();
        } else if (resultado == 0) {
            completarFinal();
        }
        btnFinalizarReserva.setEnabled(true);
        Habilitar(true);

    }//GEN-LAST:event_btnVerificarMouseClicked

    private void cmbMesInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbMesInicioMouseClicked


    }//GEN-LAST:event_cmbMesInicioMouseClicked

    private void cmbDiaInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbDiaInicioMouseClicked

    }//GEN-LAST:event_cmbDiaInicioMouseClicked

    private void btnFinalizarReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinalizarReservaMouseClicked
        comprobarFechaFinal();
        String fechaInicio = fechaIncioAlquiler.getYear() + "-" + fechaIncioAlquiler.getMonth() + "-" + fechaIncioAlquiler.getDate();
        String fechaFin = fechaFinAlquiler.getYear() + "-" + fechaFinAlquiler.getMonth() + "-" + fechaFinAlquiler.getDate();
        System.out.println("fechaInicio = " + fechaInicio);
        System.out.println("fechaFin = " + fechaFin);
        System.out.println(UsuarioDatos.matricula);
        System.out.println(UsuarioDatos.cedula);
        
        user.almacenarReserva(UsuarioDatos.matricula, UsuarioDatos.cedula, fechaInicio, fechaFin);
    }//GEN-LAST:event_btnFinalizarReservaMouseClicked

    private void cmbMesFinalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMesFinalItemStateChanged

    }//GEN-LAST:event_cmbMesFinalItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizarReserva;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JComboBox<String> cmbDiaFInal;
    private javax.swing.JComboBox<String> cmbDiaInicio;
    private javax.swing.JComboBox<String> cmbMesFinal;
    private javax.swing.JComboBox<String> cmbMesInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDiaFinal;
    private javax.swing.JLabel lblFechaFinal;
    private javax.swing.JLabel lblIndicacion2;
    private javax.swing.JLabel lblMesFinal;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
