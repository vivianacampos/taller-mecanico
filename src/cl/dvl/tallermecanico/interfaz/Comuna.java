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
public class Comuna {
    private int idComuna;
    private String comuna;
    private int idRegion;

    public Comuna() {
    }

    public Comuna(int idComuna, String comuna) {
        this.idComuna = idComuna;
        this.comuna = comuna;
    }

    public int getIdComuna() {
        return idComuna;
    }

     public String getComuna() {
        return comuna;
    }

    public int getIdRegion(){
    return idRegion;
}
    
    
    
}
