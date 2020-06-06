/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.dvl.tallermecanico.utils;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private Connection con;

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/tallermecanico","root","");
            if (con != null) {
                System.out.println("Conexión establecida");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar" + e);
        }
    } 

    public Connection getCon() {
        return con;
    }
    
}
