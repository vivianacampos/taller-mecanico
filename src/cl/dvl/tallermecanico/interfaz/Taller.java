/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.dvl.tallermecanico.interfaz;

/**
 *
 * @author Artsk
 */
public class Taller {
       private int idTaller;
    private int idComuna;
    private String Comuna;
    private String Taller;
    private String direccion;
    private String correo;

    public Taller() {
    }

    public Taller(int idTaller, String Comuna, String Taller, String direccion, String correo) {
        this.idTaller = idTaller;
        this.Comuna = Comuna;
        this.Taller = Taller;
        this.direccion = direccion;
        this.correo = correo;
    }



    public int getIdTaller() {
        return idTaller;
    }

        public int getIdComuna() {
        return idComuna;
    }

    public void setIdComuna(int idComuna) {
        this.idComuna = idComuna;
    }

    public String getTaller() {
        return Taller;
    }

    public void setTaller(String Taller) {
        this.Taller = Taller;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getComuna() {
        return Comuna;
    }

    public void setComuna(String Comuna) {
        this.Comuna = Comuna;
    }
      
    
    
    
    
}
