package Prueba_01;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {

    Connection conexiones;
    private String host = "localhost";
    private String user = "root";
    private String password ="";
    private String db = "sistema2";
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://"+host+"/"+db;

    public Conexion() {
    }

    public Connection conectar()  {

       
        try {
            Class.forName(driver);
             this.conexiones = DriverManager.getConnection(this.url, this.user, this.password);
            System.out.println("Se conecto correctamente");
        } catch (ClassNotFoundException ex) {
            System.out.println("No se puedo conectar");
        } catch (SQLException ex) {
            System.out.println("No se pudo conectar " + ex.getMessage());
        }
           
       
        return conexiones;

    }

    public void cerrarCoenxion() {
        boolean cerrado = false;
        try {
            if (conexiones.isClosed() == false) {
                conexiones.close();
            } else {
                System.out.println("No se pudo cerrar la conexión");
            }
        } catch (SQLException ex) {

        }

    }
}
