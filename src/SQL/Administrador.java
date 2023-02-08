/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;
/**
 *
 * @author sebas
 */
public class Administrador {
    
    Conexion conn = new Conexion ();
    Connection con = conn.conection();
    
//AGREGAR  
public void agregarVehiculo (JTextField txtMatricula, JTextField txtIdAgencia, JTextField txtIdGarage, JTextField txtModelo, JTextField txtColor, JTextField txtAnio, JTextField txtMarca, JTextField txtPrecio){
PreparedStatement ps;
   String sql;
   
   
   try {
   sql = "INSERT INTO alquiler.coche ( MATRICULA, ID_AGENCIA, ID_GARAGE, MODELO, COLOR, ANO, MARCA, PRECIO) values (?,?,?,?,?,?,?,?)";
   ps = con.prepareStatement(sql);
   ps.setString(1, txtMatricula.getText());
   ps.setString(2, txtIdAgencia.getText());
   ps.setString(3, txtIdGarage.getText());
   ps.setString(4,txtModelo.getText());
   ps.setString(5, txtColor.getText());
   ps.setInt(6, Integer.parseInt(txtAnio.getText()));
   ps.setString(7, txtMarca.getText());
   ps.setDouble(8, Double.parseDouble(txtPrecio.getText()));
  
  
         ps.executeUpdate();   
       System.out.println("Se han ingresado los datos  :D");} catch (SQLException ex)
       {System.out.println("Error al insertar los datos : "+ ex);}


}
public void agregarCliente(JTextField txtCedula, JTextField txtNombre, JTextField txtApellido, JTextField txtEdad,JTextField txtSexo ,  JTextField txtDireccion, JTextField txtTelefono, JTextField txtFechaNacimiento, 
            JTextField txtEstado,JTextField txtNacionalidad){

PreparedStatement ps;
   String sql;
   
   try {
   sql = "INSERT INTO alquiler.cliente (CI, NOMBRE, APELLIDO, EDAD, SEXO, DIRECCION, TELEFONO, FECHA_NACIMIENTO, ESTADO_CIVIL, NACIONALIDAD) values (?,?,?,?,?,?,?,?,?,?)";
   ps = con.prepareStatement(sql);
   ps.setInt(1, Integer.parseInt(txtCedula.getText()));
   ps.setString(2, txtNombre.getText());
   ps.setString(3, txtApellido.getText());
   ps.setString(4,txtEdad.getText());
   ps.setString(5, txtSexo.getText());
   ps.setString(6, txtDireccion.getText());
   ps.setString(7, txtTelefono.getText());
   ps.setString(8, txtFechaNacimiento.getText());
   ps.setString(9, txtEstado.getText());
   ps.setString(10, txtNacionalidad.getText());
  
         ps.executeUpdate();   
       System.out.println("Se han ingresado los datos  :D");} catch (SQLException ex)
       {System.out.println("Error al insertar los datos :( ");}

}

//ACTUALIZAR

public void actualizarCliente(JTextField txtCedula, JTextField txtNombre, JTextField txtApellido, JTextField txtEdad,JTextField txtSexo ,  JTextField txtDireccion, JTextField txtTelefono, JTextField txtFechaNacimiento, 
            JTextField txtEstado,JTextField txtNacionalidad){
 PreparedStatement ps;
String sql = "UPDATE alquiler.cliente set CI = ? , NOMBRE = ?, APELLIDO = ?, EDAD = ?, SEXO = ?, DIRECCION = ?, TELEFONO = ?, FECHA_NACIMIENTO = ?, ESTADO_CIVIL = ?, NACIONALIDAD = ? where CI='"+txtCedula.getText()+"'";
    try {
        ps = con.prepareStatement(sql);
        ps.setInt(1, Integer.parseInt(txtCedula.getText()));
        ps.setString(2, txtNombre.getText());
        ps.setString(3, txtApellido.getText());
        ps.setString(4, txtEdad.getText());
        ps.setString(5, txtSexo.getText());
        ps.setString(6, txtDireccion.getText());
        ps.setString(7, txtTelefono.getText());
        ps.setString(8, txtFechaNacimiento.getText());
        ps.setString(9, txtEstado.getText());
        ps.setString(10, txtNacionalidad.getText());
        ps.executeUpdate();
        
        System.out.println("Se actualizo los datos");

    } catch (SQLException ex) {
        System.out.println("Error: "+ex);
    }

}

public void actualizarCoche(JTextField txtMatricula, JTextField txtIdAgencia, JTextField txtIdGarage, JTextField txtModelo, JTextField txtColor, JTextField txtAnio, JTextField txtMarca, JTextField txtPrecio){
PreparedStatement ps;
String sql = "UPDATE alquiler.cOCHE set MATRICULA = ? , ID_AGENCIA = ?, ID_GARAGE = ?, MODELO = ?, COLOR = ?, ANO = ?, MARCA = ?, PRECIO = ? where MATRICULA='"+txtMatricula.getText()+"'";
    try {
        ps = con.prepareStatement(sql);
        ps.setString(1, txtMatricula.getText());
        ps.setString(2, txtIdAgencia.getText());
        ps.setString(3, txtIdGarage.getText());
        ps.setString(4, txtModelo.getText());
        ps.setString(5, txtColor.getText());
        ps.setString(6, txtAnio.getText());
        ps.setString(7, txtMarca.getText());
        ps.setString(8, txtPrecio.getText());
        
        ps.executeUpdate();
        
        System.out.println("Se actualizo los datos");

    } catch (SQLException ex) {
        System.out.println("Error: "+ex);
    }



}

//CONSULTAR
 public void consultaCliente (JTextField txtNombre, JTextField txtApellido, JTextField txtTelefono, JTextField txtDireccion, JTextField txtFechaNacimiento, 
            JTextField txtCedula,JTextField txtEstado,JTextField txtNacionalidad,JTextField txtSexo, JTextField txtEdad) {
        try {
            ResultSet rs;
            Statement leer = con.createStatement();
            String sql;

            sql = ("SELECT * FROM  alquiler.cliente WHERE CI = " +txtCedula.getText()+" ;");
            System.out.println("Consulta SQL =" + sql);
            rs = leer.executeQuery(sql);
            rs.next();
            txtNombre.setText(rs.getString(2));
            txtApellido.setText(rs.getString(3));
            txtTelefono.setText(rs.getString(7));
            txtEdad.setText(rs.getString(4));
            txtDireccion.setText(rs.getString(6));
            txtFechaNacimiento.setText(rs.getString(8));
            txtEstado.setText(rs.getString(9));
            txtNacionalidad.setText(rs.getString(10));
            txtSexo.setText(rs.getString(5));
            System.out.println("Consulta exitosa");

        } catch (SQLException ex) {
            System.out.println("Cagaste no se guarda la cedula");
            System.out.println("ex = " + ex);
        }

    }
 public void consultarVehiculo(JTextField txtMatricula, JTextField txtIdAgencia, JTextField txtIdGarage, JTextField txtModelo, JTextField txtColor, JTextField txtAnio, JTextField txtMarca, JTextField txtPrecio){
 try {
            ResultSet rs;
            Statement leer = con.createStatement();
            String sql;

            sql = ("SELECT * FROM  alquiler.coche WHERE MATRICULA = '" +txtMatricula.getText()+"' ;");
            System.out.println("Consulta SQL =" + sql);
            rs = leer.executeQuery(sql);
            rs.next();
            txtIdAgencia.setText(rs.getString(2));
            txtIdGarage.setText(rs.getString(3));
            txtModelo.setText(rs.getString(4));
            txtColor.setText(rs.getString(5));
            txtAnio.setText(rs.getString(6));
            txtMarca.setText(rs.getString(7));
            txtPrecio.setText(rs.getString(8));
            
            System.out.println("Consulta exitosa");

        } catch (SQLException ex) {
            System.out.println("Cagaste no se guarda la cedula");
            System.out.println("ex = " + ex);
        }

     
 }
 
 
 //BORRAR
  public void borrarCliente (JTextField cedula){
     String [] eleccion = {"Si","No"};
     int numero = JOptionPane.showOptionDialog(null, "Esta seguro de eliminarlo?", null, 0, JOptionPane.QUESTION_MESSAGE, null, eleccion, "");
     
     if (numero == 0) {
        PreparedStatement ps;
    String sql = "DELETE FROM cliente where CI='"+ cedula.getText() +"'";
    try {
        ps = con.prepareStatement(sql);
        ps.executeUpdate();
        System.out.println("Se borro el registro del cliente");
    } catch (SQLException ex) {
        System.out.println("Error = "+ ex);    }
    
    
    }  
    } 
   
 public void borrarCoche(JTextField matricula){
     String [] eleccion = {"Si","No"};
     int numero = JOptionPane.showOptionDialog(null, "Esta seguro de eliminarlo?", null, 0, JOptionPane.QUESTION_MESSAGE, null, eleccion, "");
     
     if (numero == 0) {
        PreparedStatement ps;
    String sql = "DELETE FROM coche where MATRICULA ='"+ matricula.getText() +"'";
    try {
        ps = con.prepareStatement(sql);
        ps.executeUpdate();
        System.out.println("Se borro el registro del cliente");
    } catch (SQLException ex) {
        System.out.println("Error = "+ ex);    }
    
    
    }  
    } 
 
 //TABLAS
public void completarTabla(JTable tbl, String filtro, String Similitud) {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tbl.setModel(modelo);
            tbl.setEnabled(false);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection con = conn.conection();
            
            String sql = "SELECT MARCA, MODELO, COLOR, MATRICULA, ANO, PRECIO, agencia.NOMBRE, garage.NOMBRE FROM alquiler.coche "
                    + "inner join garage ON coche.ID_GARAGE = garage.ID_GARAGE inner join agencia ON coche.ID_AGENCIA = agencia.ID_AGENCIA where "+filtro+" like '" +Similitud+ "%' order by " +filtro+ " asc;";
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn("Marca");
            modelo.addColumn("Modelo");
            modelo.addColumn("Color");
            modelo.addColumn("Matricula");
            modelo.addColumn("Año");
            modelo.addColumn("Precio");
            modelo.addColumn("Agencia");
            modelo.addColumn("Garage");
            
            while (rs.next()) {
                Object [] filas = new Object [cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i+1);
                }
                modelo.addRow(filas);
            }
            
                  
        } catch (SQLException ex) {
            Logger.getLogger(Invitado.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }



public void completarCliente(JTable tbl, String filtro, String Similitud) {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tbl.setModel(modelo);
            tbl.setEnabled(false);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection con = conn.conection();
            
            String sql = "SELECT CI, NOMBRE, APELLIDO, EDAD, SEXO, DIRECCION, TELEFONO, FECHA_NACIMIENTO, ESTADO_CIVIL, NACIONALIDAD FROM alquiler.cliente "
                    + "where "+filtro+" like '" +Similitud+ "%' order by " +filtro+ " asc;";
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn("Cedula");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Edad");
            modelo.addColumn("Sexo");
            modelo.addColumn("Direccion");
            modelo.addColumn("Telefono");
            modelo.addColumn("Fecha de Nacimiento");
            modelo.addColumn("Estado civil");
            modelo.addColumn("Nacionalidad");
            
            while (rs.next()) {
                Object [] filas = new Object [cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i+1);
                }
                modelo.addRow(filas);
            }
            
                  
        } catch (SQLException ex) {
            Logger.getLogger(Invitado.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

}
