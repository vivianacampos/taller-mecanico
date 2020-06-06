/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.dvl.tallermecanico.interfaz;

public class Region {
    private int idRegion;
    private String region;

    public Region() {
    }

    public Region(int idRegion, String region) {
        this.idRegion = idRegion;
        this.region = region;
    }

    public int getIdRegion() {
        return idRegion;
    }

    public String getRegion() {
        return region;
    }
    
    
    
}
