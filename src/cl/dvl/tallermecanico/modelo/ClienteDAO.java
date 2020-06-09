/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.dvl.tallermecanico.modelo;

import cl.dvl.tallermecanico.interfaz.Cliente;
import cl.dvl.tallermecanico.utils.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Vivita
 */
public class ClienteDAO {
    private Conexion conn = new Conexion();

    public boolean insertCliente(int idComuna, String nombre, String apellidoP, String apellidoM, String rut, String direccion, int telefono, int celular, String correo) {
        PreparedStatement ps;
        boolean executed = false;

        String query = "INSERT INTO CLIENTE("
                + "ID_COMUNA, "
                + "NOMBRE, "
                + "APELLIDO_PATERNO, "
                + "APELLIDO_MATERNO, "
                + "RUT, "
                + "DIRECCION, "
                + "TELEFONO, "
                + "CELULAR, "
                + "CORREO) "
                + "VALUES (?,?,?,?,?,?,?,?,?)";
                System.out.println(query);
        try {
            ps = conn.getCon().prepareStatement(query);
            ps.setInt(1, idComuna);
            ps.setString(2, nombre);
            ps.setString(3, apellidoP);
            ps.setString(4, apellidoM);
            ps.setString(5, rut);
            ps.setString(6, direccion);
            ps.setInt(7, telefono);
            ps.setInt(8, celular);
            ps.setString(9, correo);
            executed = ps.execute();
                        
        } catch (Exception e) {
            System.out.println(e);
        }
        return executed;
    }
    public Cliente modificarCliente(int idComuna, String nombre, String apellidoP, String apellidoM, String rut, String direccion, int telefono, int celular, String correo){
        PreparedStatement ps;
        boolean executed = false;
        String query = ("UPDATE `tallermecanico`.`cliente` SET `APELLIDO_PATERNO` = '?' WHERE (`ID_CLIENTE` = '?');");
       return null; 
    }
    public boolean EliminarCliente(){
        PreparedStatement ps;
        boolean executed = false;
        String query = ("DELETE FROM `tallermecanico`.`cliente` WHERE (`ID_CLIENTE` = '?');");
        return true;
    }
}
