package Laborator8.Cerc;

public class Cerc {
    protected double raza;
    protected String culoare;

    public Cerc() {
        this.raza = 0;
        this.culoare = "";
    }


    public Cerc(double raza, String culoare) {
        this.raza = raza;
        this.culoare = culoare;
    }


    public void setRaza(double raza) {
        this.raza = raza;
    }
    public double getRaza() {
        return raza;
    }
    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
    public String getCuloare() {
        return culoare;
    }
    
    public double Arie(){
        return 3.14*raza*raza;
    }

    public String toString(){
        return "Raza: "+this.raza+"\nCuloare: "+this.culoare;
    }
}
