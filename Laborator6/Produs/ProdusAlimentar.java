package Laborator8.Produs;

/**
 * ProdusAlimentar
 */
public class ProdusAlimentar extends Produs{

    private String dataValabilitate, conditiiPastrare;
    private double greutate;

    public ProdusAlimentar(){
        super();
        this.dataValabilitate="";
        this.conditiiPastrare="";
        this.greutate=0;
    }

    public ProdusAlimentar(String denumire, String producator, double pret, String dataValabilitate, String conditiiPastrare, double greutate){
        super(denumire, producator, pret);
        this.dataValabilitate=dataValabilitate;
        this.conditiiPastrare=conditiiPastrare;
        this.greutate=greutate;
    }

    public String toString(){
        return "Data valabilitate: "+this.dataValabilitate+"\nConditii pastrare: "+this.conditiiPastrare+"\nGreutate: "+this.greutate+" grame";
    }
    public boolean depasesteGreutate(){
        return this.greutate>1000;
    }

    public double TVA(){
        return getPret()*9/100;
    }

    public void setGreutate(){
       this.greutate=input.nextDouble();
    }

    public String getProducator(){
        
        return getProducator();
    }
}