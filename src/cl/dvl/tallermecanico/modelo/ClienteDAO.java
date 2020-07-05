/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.dvl.tallermecanico.modelo;

import cl.dvl.tallermecanico.interfaz.Cliente;
import cl.dvl.tallermecanico.utils.Conexion;
import com.mysql.fabric.xmlrpc.Client;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vivita
 */
public class ClienteDAO {

    private Conexion conn = new Conexion();

    public boolean insertCliente(int idComuna, String nombre, String apellidoP, String apellidoM, String rut, String direccion, Integer telefono, String correo) {
        Connection con = conn.getCon();
        PreparedStatement ps = null;
        boolean executed = false;

        String query = "INSERT INTO CLIENTE("
                + "ID_COMUNA, "
                + "NOMBRE, "
                + "APELLIDO_PATERNO, "
                + "APELLIDO_MATERNO, "
                + "RUT, "
                + "DIRECCION, "
                + "CORREO, "
                + "TELEFONO) "
                + "VALUES (?,?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idComuna);
            ps.setString(2, nombre);
            ps.setString(3, apellidoP);
            ps.setString(4, apellidoM);
            ps.setString(5, rut);
            ps.setString(6, direccion);
            ps.setString(7, correo);
            ps.setInt(8, telefono);
            executed = ps.execute();

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {

                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return executed;
    }

//    public Cliente modificarCliente(int idComuna, String nombre, String apellidoP, String apellidoM, String rut, String direccion, int telefono, String correo) {
//        PreparedStatement ps;
//        boolean executed = false;
//        String query = ("UPDATE `tallermecanico`.`cliente` SET `APELLIDO_PATERNO` = '?' WHERE (`ID_CLIENTE` = '?');");
//        return null;
//    }
    public boolean eliminarCliente() {
        PreparedStatement ps;
        boolean executed = false;
        String query = ("DELETE FROM `tallermecanico`.`cliente` WHERE (`ID_CLIENTE` = '?');");
        return true;
    }

    public Cliente buscarCliente(String rut) {
        Connection con = conn.getCon();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Cliente cli = new Cliente();
        String query = ("SELECT c.NOMBRE as NOMBRE, c.APELLIDO_PATERNO as APELLIDO_PATERNO, c.APELLIDO_MATERNO as APELLIDO_MATERNO, c.DIRECCION as DIRECCION, c.CORREO as CORREO, c.TELEFONO as TELEFONO, co.COMUNA as COMUNA, r.REGION as REGION"
                + " from cliente c "
                + " join comuna co ON c.ID_COMUNA = co.ID_COMUNA "
                + " join ciudad ci ON co.ID_CIUDAD = ci.ID_CIUDAD "
                + " join provincia p ON ci.ID_PROVINCIA = p.ID_PROVINCIA "
                + " join region r ON p.ID_REGION = r.ID_REGION "
                + " where c.RUT = ?;");
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, rut);
            rs = ps.executeQuery();
            while (rs.next()) {
                cli = new Cliente();
                cli.setNombre(rs.getString("NOMBRE"));
                cli.setApellidoP(rs.getString("APELLIDO_PATERNO"));
                cli.setApellidoM(rs.getString("APELLIDO_MATERNO"));
                cli.setDireccion(rs.getString("DIRECCION"));
                cli.setCorreo(rs.getString("CORREO"));
                cli.setTelefono(rs.getInt("TELEFONO"));
                cli.setComuna(rs.getString("COMUNA"));
                cli.setRegion(rs.getString("REGION"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, "Error en SQL.", ex);
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return cli;
    }

    public ArrayList<Cliente> getClientesByComuna(int idcomuna) {
        ArrayList<Cliente> listaClientesCom = new ArrayList();
                Cliente cliente = new Cliente();
        Connection con = conn.getCon();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query = "SELECT c.NOMBRE as NOMBRE, c.APELLIDO_PATERNO as APELLIDO_PATERNO, c.APELLIDO_MATERNO as APELLIDO_MATERNO, c.DIRECCION as DIRECCION, c.CORREO as CORREO, c.TELEFONO as TELEFONO, co.COMUNA as COMUNA, r.REGION as REGION\n"
                + "from cliente c "
                + "join comuna co ON c.ID_COMUNA = co.ID_COMUNA "
                + "join ciudad ci ON co.ID_CIUDAD = ci.ID_CIUDAD "
                + "join provincia p ON ci.ID_PROVINCIA = p.ID_PROVINCIA "
                + "join region r ON p.ID_REGION = r.ID_REGION "
                + "where c.ID_COMUNA = ?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idcomuna);
            rs = ps.executeQuery();
            while (rs.next()) {
                cliente.setNombre(rs.getString("NOMBRE"));
                cliente.setApellidoP(rs.getString("APELLIDO_PATERNO"));
                cliente.setApellidoM(rs.getString("APELLIDO_MATERNO"));
                cliente.setDireccion(rs.getString("DIRECCION"));
                cliente.setCorreo(rs.getString("CORREO"));
                cliente.setTelefono(rs.getInt("TELEFONO"));
                cliente.setComuna(rs.getString("COMUNA"));
                cliente.setRegion(rs.getString("REGION"));
                listaClientesCom.add(cliente);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listaClientesCom;
    }
    
    public ArrayList<Cliente> getTodosClientes(){
        ArrayList listadoClientes = new ArrayList();
        Cliente cliente = new Cliente();
        Connection con = conn.getCon();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query = "Select * From Cliente";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                cliente.setNombre(rs.getString("NOMBRE"));
                cliente.setApellidoP(rs.getString("APELLIDO_PATERNO"));
                cliente.setApellidoM(rs.getString("APELLIDO_MATERNO"));
                cliente.setDireccion(rs.getString("DIRECCION"));
                cliente.setCorreo(rs.getString("CORREO"));
                cliente.setTelefono(rs.getInt("TELEFONO"));
                cliente.setComuna(rs.getString("COMUNA"));
                cliente.setRegion(rs.getString("REGION"));
                listadoClientes.add(cliente);
            }
        } catch (Exception e) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listadoClientes;
    }

    public Cliente guardarCliente() {
        Connection con = conn.getCon();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Cliente cliente = new Cliente();
        String query = "UPDATE cliente SET "
                + "ID_COMUNA = ?,"
                + "NOMBRE = ?, "
                + "APELLIDO_PATERNO = ?,"
                + " APELLIDO_MATERNO = ?,"
                + " DIRECCION = ?,"
                + " CORREO = ?,"
                + " TELEFONO = ?"
                + " WHERE ID_CLIENTE = ?;";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return cliente;
    }

}
