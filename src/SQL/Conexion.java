package SQL;

import java.sql.*;
import GUI.UsuarioDatos;

public class Conexion {

    private final String bd = "alquiler";
    private final String URL = "jdbc:mysql://localhost:3306/";
    private final String usuario = UsuarioDatos.UsuarioSQL;
    private final String clave = UsuarioDatos.pswdSQL;
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private Connection con = null;

    public Connection conection() {

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(URL + bd, usuario, clave);
            System.out.println("Se ha conectado exitosamente");
        } catch (ClassNotFoundException | SQLException ex) {

            System.out.println("No se ha podido conectar");
        }
        
        return con;
    }

}
