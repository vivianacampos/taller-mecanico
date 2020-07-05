
package cl.dvl.tallermecanico.modelo;

import cl.dvl.tallermecanico.interfaz.Comuna;
import cl.dvl.tallermecanico.interfaz.Region;
import cl.dvl.tallermecanico.utils.Conexion;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.IO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
//Aqui van todas las querys para obtener datos de comunas y regiones.

public class LocacionDAO {

    private Conexion conn = new Conexion();

    /**
     * Este método obtiene las regiones desde la BD y las guarda en una lista
     *
     * @return List<Region>
     */
    public List<Region> getRegion() {
        List listaRegiones = new LinkedList();
        ResultSet rs = null;
        PreparedStatement ps = null;
        Connection con = conn.getCon();

        Region reg = new Region();
        String query = "SELECT * FROM region";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                reg = new Region(rs.getInt("ID_REGION"), rs.getString("REGION"));
                listaRegiones.add(reg);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LocacionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaRegiones;
    }

    public List<Comuna> getComunaByIdRegion(int id) {
        List<Comuna> listaComunas = new LinkedList<>();
        ResultSet rs = null;
        PreparedStatement ps = null;
        Connection con = conn.getCon();
        Comuna com = new Comuna();
        String query = "Select "
                + "co.ID_COMUNA, "
                + "co.COMUNA "
                + "From Region r "
                + "join provincia p on p.ID_REGION = r.ID_REGION "
                + "join ciudad c on c.ID_PROVINCIA = p.ID_PROVINCIA "
                + "join comuna co on co.ID_CIUDAD = c.ID_CIUDAD "
                + "where r.id_region = ?";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) { //salta a la siguiente linea de resultado
                com = new Comuna(rs.getInt("ID_COMUNA"), rs.getString("COMUNA"));
                listaComunas.add(com);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LocacionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
        return listaComunas;
    }
    
    public List<Comuna> getComuna(){
        List<Comuna> listaCom = new LinkedList<>();
        ResultSet rs = null;
        PreparedStatement ps = null;
        
        Connection con = conn.getCon();
        Comuna com = new Comuna();
         String query = "Select COMUNA, ID_COMUNA from comuna;";
         try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                com = new Comuna(rs.getInt("ID_COMUNA"), rs.getString("COMUNA"));
                listaCom.add(com);
            }
        } catch (Exception e) {
             Logger.getLogger(LocacionDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         return listaCom;
    }
}
