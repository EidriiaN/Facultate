package Laborator8.Cerc;

public class Cilindru extends Cerc{
    
    protected double inaltimeCilindru;

    public Cilindru(double inaltimeCilindru) {
        this.inaltimeCilindru = inaltimeCilindru;
    }

    public Cilindru(){
        super();
        this.inaltimeCilindru=0;
    }

    public Cilindru(double raza, String culoare, double inaltimeCilindru) {
        super(raza, culoare);
        this.inaltimeCilindru = inaltimeCilindru;
    }

    public double getInaltimeCilindru() {
        return inaltimeCilindru;
    }
    public void setInaltimeCilindru(double inaltimeCilindru) {
        this.inaltimeCilindru = inaltimeCilindru;
    }
    
    public double volumCilindru(){
        return Arie()*inaltimeCilindru;
    }

    public String toString(){
        return super.toString()+"\nInaltime cilindru: "+this.inaltimeCilindru;
    }
}
