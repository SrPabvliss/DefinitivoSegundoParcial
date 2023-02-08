package SQL;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class Invitado {
   
    Conexion conn = new Conexion();

    public void completarTabla(JTable tbl, String filtro, String Similitud) {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tbl.setModel(modelo);
            tbl.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
            modelo.addColumn("color");
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
}
