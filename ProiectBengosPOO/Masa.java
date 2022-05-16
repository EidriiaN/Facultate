package ProiectBengosPOO;

public class Masa {
    
    private int locuri, nrMasa;
    private String tipMasa;
    private boolean rezervat;

    public Masa(int locuri, int nrMasa, String tipMasa, boolean rezervat) {
        this.locuri = locuri;
        this.nrMasa = nrMasa;
        this.tipMasa= tipMasa;
        this.rezervat= rezervat;
        
    }

    public Masa() {
        this.locuri = 0;
        this.nrMasa = 0;
        this.tipMasa="";
        this.rezervat=false;
    }

    public void afisare(){
        System.out.println("Masa "+nrMasa+": "+this.locuri+" locuri, "+this.tipMasa);
    }

    public void setLocuri(int locuri) {
        this.locuri = locuri;
    }
    
    public int getLocuri() {
        return locuri;
    }

    public void setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public String getTipMasa() {
        return tipMasa;
    }
    public void setTipMasa(String tipMasa) {
        this.tipMasa = tipMasa;
    }

    public boolean getRezervat(){
        return this.rezervat;
    }

    public void setRezervat(boolean n){
        this.rezervat=n;
    }
}
