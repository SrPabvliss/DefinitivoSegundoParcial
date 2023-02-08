/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;

import GUI.frmLogin;
import GUI.frmUsuario;
import GUI.mdiUsuario;
import java.awt.Color;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;

/**
 *
 * @author Det-Pc
 */
public class Usuario {

    Conexion conn = new Conexion();
    Connection con = conn.conection();

    Date date = new Date();
    Border border1 = BorderFactory.createLineBorder(Color.RED, 2);
    Border border2 = BorderFactory.createLineBorder(Color.BLACK, 1);

    public int validarAcceso(String usuario, String passwd) {

        int resultado = 0;
        try {
            String sql = "SELECT * FROM alquiler.cliente WHERE cliente.NOMBRE ='" + usuario + "' AND cliente.CI = " + passwd + ";";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                resultado = 1;
            }
        } catch (SQLException ex) {
            System.out.println("ex = " + ex);
        }
        return resultado;

    }

    public void completarTabla(JTable tbl, String filtro, String Similitud) {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tbl.setModel(modelo);
            tbl.setEnabled(false);

            tbl.setRowSelectionAllowed(true);
            PreparedStatement ps = null;
            ResultSet rs = null;

            String sql = "SELECT MARCA, MODELO, COLOR, MATRICULA, ANO, PRECIO, agencia.NOMBRE, garage.NOMBRE FROM alquiler.coche "
                    + "inner join garage ON coche.ID_GARAGE = garage.ID_GARAGE inner join agencia ON coche.ID_AGENCIA = agencia.ID_AGENCIA where " + filtro + " like '" + Similitud + "%' order by " + filtro + " asc;";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("Marca");
            modelo.addColumn("Modelo");
            modelo.addColumn("color");
            modelo.addColumn("Matricula");
            modelo.addColumn("Año");
            modelo.addColumn("Precio");
            modelo.addColumn("Agencia");
            modelo.addColumn("Garage");

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Invitado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Consultar(JTextField txtNombre, JTextField txtApellido, JTextField txtTelefono, JTextField txtDireccion, JTextField txtFechaNacimiento,
            JTextField txtCedula, JTextField txtEstado, JTextField txtNacionalidad, JTextField txtSexo, String cedula) {
        try {
            ResultSet rs;
            Statement leer = con.createStatement();
            String sql;

            sql = ("SELECT * FROM  cliente WHERE CI = " + cedula + " ;");
            System.out.println("Consulta SQL =" + sql);
            rs = leer.executeQuery(sql);
            rs.next();
            txtNombre.setText(rs.getString(2));
            txtApellido.setText(rs.getString(3));
            txtTelefono.setText(rs.getString(7));
            txtDireccion.setText(rs.getString(6));
            txtFechaNacimiento.setText(rs.getString(8));
            txtCedula.setText(rs.getString(1));
            txtEstado.setText(rs.getString(9));
            txtNacionalidad.setText(rs.getString(10));
            txtSexo.setText(rs.getString(5));
            System.out.println("Consulta exitosa");

        } catch (SQLException ex) {
            System.out.println("ex = " + ex);
        }

    }

    public int registro(JTextField nombre1, JTextField apellido1, JTextField numero, JTextField cedula, JTextField direccion, JTextField nacionalidad) {
        String comparacion = "^[a-zA-Z\u00E0-\u00FC ]+$";
        String cef = "^[0-9]{10}+$";
        int cont = 0;
        Pattern patron1 = Pattern.compile(comparacion);
        Matcher ma = patron1.matcher(nombre1.getText());
        if (!ma.find()) {
            nombre1.setBorder(border1);
        } else {
            cont++;
            nombre1.setBorder(border2);
        }

        Pattern patron2 = Pattern.compile(comparacion);
        Matcher ma2 = patron2.matcher(apellido1.getText());
        if (!ma2.find()) {
            apellido1.setBorder(border1);
        } else {
            cont++;
            apellido1.setBorder(border2);
        }

        Pattern patron3 = Pattern.compile(comparacion);
        Matcher ma3 = patron3.matcher(direccion.getText());
        if (!ma3.find()) {
            direccion.setBorder(border1);

        } else {
            cont++;
            apellido1.setBorder(border2);
        }

        Pattern patron4 = Pattern.compile(comparacion);
        Matcher ma4 = patron4.matcher(nacionalidad.getText());
        if (!ma4.find()) {
            nacionalidad.setBorder(border1);
        } else {
            cont++;
            nacionalidad.setBorder(border2);
        }

        Pattern patron5 = Pattern.compile(cef);
        Matcher ma5 = patron5.matcher(numero.getText());
        if (!ma5.find()) {
            numero.setBorder(border1);
        } else {
            cont++;
            numero.setBorder(border2);
        }

        Pattern patron6 = Pattern.compile(cef);
        Matcher ma6 = patron6.matcher(cedula.getText());
        if (!ma6.find()) {
            cedula.setBorder(border1);
        } else {
            cont++;
            cedula.setBorder(border2);
        }

        return cont;
    }

    public void almacenarBase(int contador, JTextField nombre1, JTextField apellido1, JTextField numero, JTextField cedula, JTextField direccion, JTextField nacionalidad,
            JComboBox<String> Sexo, JComboBox<String> Estado, JComboBox<String> dia, JComboBox<String> mes, JComboBox<String> anio) { //Metodo para agregar lo que se tiene del registro a la base de datos

        date.setYear(2023);
        int eda = date.getYear() - Integer.parseInt((String) anio.getSelectedItem());
        String fecha = (String) (anio.getSelectedItem() + "-" + mes.getSelectedItem() + "-" + dia.getSelectedItem());
        if (contador == 6) {
            PreparedStatement ps;
            String sql;

            try {
                sql = "INSERT INTO alquiler.cliente (CI, NOMBRE, APELLIDO, EDAD, SEXO, DIRECCION, TELEFONO, FECHA_NACIMIENTO, ESTADO_CIVIL, NACIONALIDAD) values (?,?,?,?,?,?,?,?,?,?)";
                ps = con.prepareStatement(sql);
                ps.setInt(1, Integer.parseInt(cedula.getText()));
                ps.setString(2, nombre1.getText());
                ps.setString(3, apellido1.getText());
                ps.setString(4, String.valueOf(eda));
                ps.setString(5, (String) Sexo.getSelectedItem());
                ps.setString(6, direccion.getText());
                ps.setString(7, numero.getText());
                ps.setString(8, fecha);
                ps.setString(9, (String) Estado.getSelectedItem());
                ps.setString(10, nacionalidad.getText());

                ps.executeUpdate();
                System.out.println("Se han ingresado los datos  :D");
            } catch (SQLException ex) {
                System.out.println("Error al insertar los datos :( ");
            }
            JOptionPane.showMessageDialog(null, "Ha sido registrado con exito");
            System.out.println("Se ha ingresado los datos en la base ");
        } else {
            System.out.println("No se han ingresado los datos en la base");
        }
    }

    public void completarInfoCarro(String matricula, JTextField marca, JTextField modelo, JTextField anio, JTextField color, JTextField precio, JTextField placa) {
        try {
            ResultSet rs;
            Statement leer = con.createStatement();
            String sql;

            sql = ("SELECT * FROM coche WHERE MATRICULA = '" + matricula + "' ;");
            System.out.println("Consulta SQL =" + sql);
            rs = leer.executeQuery(sql);
            rs.next();
            marca.setText(rs.getString(7));
            modelo.setText(rs.getString(4));
            anio.setText(rs.getString(6));
            color.setText(rs.getString(5));
            precio.setText(rs.getString(8));
            placa.setText(rs.getString(1));
            System.out.println("Consulta exitosa");

        } catch (SQLException ex) {
            System.out.println("Cagaste no se guarda la cedula");
            System.out.println("ex = " + ex);
        }
    }

    public void completarReservar(JTable tbl, String cedula) {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tbl.setModel(modelo);
            tbl.setEnabled(false);

            tbl.setRowSelectionAllowed(true);
            PreparedStatement ps = null;
            ResultSet rs = null;

            String sql = "SELECT reserva.ID, coche.MARCA, coche.MODELO, coche.COLOR, reserva.MATRICULA, reserva.FECHA_INICIO, reserva.FECHA_FINAL, coche.PRECIO FROM alquiler.reserva "
                    + "inner join alquiler.coche ON reserva.MATRICULA = coche.MATRICULA where reserva.CI =" + cedula + ";";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("Marca");
            modelo.addColumn("Modelo");
            modelo.addColumn("Color");
            modelo.addColumn("Matricula");
            modelo.addColumn("Fecha Inicio");
            modelo.addColumn("Fecha Final");
            modelo.addColumn("Precio por dia");

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Invitado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarReserva(String cedula, String Matricula, String ID) {
        try {
            ResultSet rs;
            PreparedStatement leer;
            String sql;
            sql = ("DELETE FROM alquiler.reserva WHERE reserva.CI = " + cedula + " AND reserva.MATRICULA ='" + Matricula + "' AND reserva.ID = " + ID + ";");
            leer = con.prepareStatement(sql);
            System.out.println("Consulta SQL =" + sql);
            leer.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cargarCMBid(JComboBox id, String cedula) {
        ResultSet rs;
        id.removeAllItems();

        try {

            Statement leer = con.createStatement();
            rs = leer.executeQuery("SELECT * FROM alquiler.reserva WHERE CI = " + cedula + ";");
            while (rs.next()) {
                id.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("ex = " + ex);

        }
    }

    public void almacenarReserva(String matricula, String cedula, String fechaInicio, String fechaFinal) { //Metodo para agregar lo que se tiene del registro a la base de datos

        PreparedStatement ps;
        String sql;

        try {
            sql = "INSERT INTO alquiler.reserva (MATRICULA, CI, FECHA_INICIO, FECHA_FINAL) values (?,?,?,?)";
            ps = con.prepareStatement(sql);

            ps.setString(1, matricula);
            ps.setString(2, cedula);
            ps.setString(3, fechaInicio);
            ps.setString(4, fechaFinal);

            ps.executeUpdate();
            System.out.println("Se han ingresado los datos  :D");
            JOptionPane.showMessageDialog(null, "Ha sido registrado con exito");
        } catch (SQLException ex) {
            System.out.println("ex = " + ex);
            System.out.println("Error al insertar los datos :( ");
        }
        
        
    
    }

}
