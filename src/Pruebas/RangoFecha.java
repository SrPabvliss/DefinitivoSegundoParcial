///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package Pruebas;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.Date;
//
///**
// *
// * @author Det-Pc
// */
//public class RangoFecha {
//
//    public static void main(String[] args) {
//        final String bd = "alquiler";
//        final String URL = "jdbc:mysql://localhost:3306/";
//        final String usuario = "root";
//        final String clave = "Villacres_04";
//        final String driver = "com.mysql.cj.jdbc.Driver";
//        Connection con = null;
//
//        try {
//            Class.forName(driver);
//            con = DriverManager.getConnection(URL + bd, usuario, clave);
//            System.out.println("Se ha conectado exitosamente");
//        } catch (ClassNotFoundException | SQLException ex) {
//
//            System.out.println("No se ha podido conectar");
//        }
//        //DESDE AQUI SERIA EL NUEVO METODO PARA USUARIO 
//        int resultado;
//        Date fecha = new Date();
//
//        fecha.setDate(16);
//        fecha.setYear(2023);
//        fecha.setMonth(02);
//
//        Date fecha2 = new Date();
//        Date fecha3 = new Date();
//
//        try {
//            String sql = "SELECT * FROM alquiler.reserva WHERE reserva.MATRICULA ='AXC123';";
//            Statement st = con.createStatement();
//            ResultSet rs = st.executeQuery(sql);
//            if (rs.next()) {
//                resultado = 1;
//                System.out.println("Se ha encontrado el vehiculo");
//                String AnioInicio = rs.getString(4).substring(0, 4);
//                System.out.println("AnioInicio = " + AnioInicio);
//                String MesInicio = rs.getString(4).substring(5, 7);
//                System.out.println("MesInicio = " + MesInicio);
//                String DiaInicio = rs.getString(4).substring(8, 10);
//                System.out.println("DiaInicio = " + DiaInicio);
//                fecha2.setYear(Integer.parseInt(AnioInicio));
//                fecha2.setMonth(Integer.parseInt(MesInicio));
//                fecha2.setDate(Integer.parseInt(DiaInicio));
//
//                String AnioFinal = rs.getString(5).substring(0, 4);
//                System.out.println("AnioFinal = " + AnioFinal);
//                String MesFinal = rs.getString(5).substring(5, 7);
//                System.out.println("MesFinal = " + MesFinal);
//                String DiaFinal = rs.getString(5).substring(8, 10);
//                System.out.println("DiaFinal = " + DiaFinal);
//                fecha3.setYear(Integer.parseInt(AnioFinal));
//                fecha3.setMonth(Integer.parseInt(MesFinal));
//                fecha3.setDate(Integer.parseInt(DiaFinal));
//
//                //Este solo verifica la fecha de inicio de la reserva
//                if (fecha.getYear() >= fecha3.getYear() && fecha.getYear() >= 2023) {
//                    System.out.println("Elegible");
//                    if (fecha.getMonth() >= fecha2.getMonth() && fecha.getMonth() <= fecha3.getMonth()) {
//                        System.out.println("El mes esta dentro del rango del anterior alquiler, verificando dia");
//                        if (!(fecha.getDate() >= fecha2.getDate() && fecha.getDate() <= fecha3.getDate())) {
//                            System.out.println("Se puede proceder, el dia esta disponible");
//                        } else {
//                            System.out.println("El coche ya ha sido alquilado en esa fecha, no se puede alquilar");
//                        }
//                    } else {
//                        System.out.println("Se puede proceder al alquiler");
//                    }
//                } else {
//                    System.out.println("Creo que lo resolvi");
//                }
//                
//                //Segundo menu para escoger la fecha final, los for serian para llenar los combo box
//                for (int i = fecha2.getMonth(); i <= 12; i++) {
//                    if (!(i > fecha2.getMonth() && i <= fecha3.getMonth())) {
//
//                    }
//                }
//                System.out.println("XXXXXXXXXXXXXXXXXXX");
//                if (fecha.getMonth() == fecha2.getMonth()) {
//                    if (fecha.getDate() < fecha2.getDate()) {
//                        for (int i = fecha.getDate(); i <= fecha2.getDate(); i++) {
//
//                            if (!(i >= fecha2.getDate() && i <= fecha3.getDate())) {
//                                System.out.println("i = " + i);
//                            }
//                        }
//                    } else if (fecha.getDate() > fecha3.getDate()) {
//                        for (int i = fecha.getDate(); i <= 31; i++) {
//
//                            if (!(i >= fecha2.getDate() && i <= fecha3.getDate())) {
//                                System.out.println("i = " + i);
//                            }
//                        }
//                    }
//                } else {
//                    for (int i = 1; i <= fecha2.getDate(); i++) {
//
//                        if (!(i >= fecha2.getDate() && i <= fecha3.getDate())) {
//                            System.out.println("i = " + i);
//                        }
//                    }
//                }
//
//                //Verificar si se puede llenar los combo box de esta manera para facilitar la validacion del registro
//                String envioAbase = fecha.getYear() + "-" + fecha.getMonth() + "-" + fecha.getDate();
//                System.out.println("envioAbase = " + envioAbase);
//            }
//        } catch (SQLException ex) {
//            System.out.println("ex = " + ex);
//        }
//
//    }
//}
