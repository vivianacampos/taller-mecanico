/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.dvl.tallermecanico.modelo;

import cl.dvl.tallermecanico.interfaz.Taller;
import cl.dvl.tallermecanico.utils.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Artsk
 */
public class TallerDAO {

    private Conexion conn = new Conexion();

    public ArrayList<Taller> getTaller() {
        ArrayList<Taller> listaTalleres = new ArrayList<>();
        Connection con = conn.getCon();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Taller taller = new Taller();
        String query = "Select t.taller as TALLER, t.correo as CORREO, t.direccion as DIRECCION, c.comuna "
                + "FROM taller t "
                + "JOIN comuna c ON t.ID_COMUNA = c.ID_COMUNA;";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                taller = new Taller();
                taller.setTaller(rs.getString("TALLER"));
                taller.setDireccion(rs.getString("DIRECCION"));
                taller.setComuna(rs.getString("COMUNA"));
                taller.setCorreo(rs.getString("CORREO"));
                listaTalleres.add(taller);
            }
        } catch (Exception e) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, "Error en SQL.", e);
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        return listaTalleres;
        
    }

}
}
