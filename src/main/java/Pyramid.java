/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eman
 */
public class Pyramid {
    
    private String pharaoh;
    private String modern_name;
    private String site;
    private Double height;
    
    public Pyramid() {
    }

    public Pyramid(String pharaoh, String modern_name, String site, Double height) {
        this.pharaoh = pharaoh;
        this.modern_name = modern_name;
        this.site = site;
        this.height = height;
    }

    public void setPharaoh(String pharaoh) {
        this.pharaoh = pharaoh;
    }

    public void setModern_name(String modern_name) {
        this.modern_name = modern_name;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void setHeight_in_m(Double height) {
        this.height = height;
    }

    public String getPharaoh() {
        return pharaoh;
    }

    public String getModern_name() {
        return modern_name;
    }

    public String getSite() {
        return site;
    }

    public Double getHeight() {
        return height;
    }
}
    
