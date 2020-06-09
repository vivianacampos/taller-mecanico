/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.dvl.tallermecanico.modelo;

import cl.dvl.tallermecanico.interfaz.Usuario;
import cl.dvl.tallermecanico.utils.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {

    private Conexion conn = new Conexion();

    public Usuario getUsuarios(String usuario, String password) {
        
        Statement st;
        ResultSet rs;
        Usuario user = new Usuario();
        try {
            st = conn.getCon().createStatement();
            rs = st.executeQuery("Select * from usuario where usuario='" +usuario +"' and password='"+password+"'");
            //System.out.println("Select * from usuario where usuario='" + usuario + " and password="+password+"'");
            while (rs.next()) {
                
                user = new Usuario(rs.getInt("ID_USUARIO"), rs.getString("USUARIO"), rs.getString("PASSWORD"), rs.getString("PERFIL"));
                System.out.println(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.getCon().close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return user;
    }
}
