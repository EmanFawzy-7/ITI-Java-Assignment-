public class Pyramid {
    private String pharaoh,modern_name,site;
    private double height;
    
    public Pyramid(String pharaoh, String modern_name, String site, String height) {
        this.pharaoh = pharaoh;
        this.modern_name = modern_name;
        this.site = site;
        this.height =Double.parseDouble(height);
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

    public double getHeight() {
        return height;
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

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
	public String toString() {
		return "Pyramid [pharaoh=" + pharaoh + ", modern_name=" + modern_name + ", site=" + site + ", height=" + height
				+ "]";
	}
    
    
}