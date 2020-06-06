/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.dvl.tallermecanico.interfaz;

/**
 *
 * @author Vivita
 */
public class Cliente {
    private String nombre;
    private String apellidoM;
    private String apellidoP;
    private String rut;
    private String direccion;
    private int telefono;
    private int celular;
    private String correo;
    private String comuna;
    private String region;

    public Cliente() {
    }

    public Cliente(String nombre, String apellidoM, String apellidoP, String rut, String direccion, int telefono, int celular, String correo, String comuna, String region) {
        this.nombre = nombre;
        this.apellidoM = apellidoM;
        this.apellidoP = apellidoP;
        this.rut = rut;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
        this.correo = correo;
        this.comuna = comuna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    
    
    
    
}
