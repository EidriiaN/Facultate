package ProiectBengosPOO;

import java.util.Scanner;

public class Rezervare {
    

    private Persoana persoana;
    private int nrPersoane;
    private String ora, data;
    private Masa masa;
    private PreComanda preComanda;
    Scanner input=new Scanner(System.in);

    public Rezervare(){
        this.persoana=new Persoana();
        this.nrPersoane=0;
        this.data="";
        this.ora="";
        this.masa=new Masa();
        this.preComanda=new PreComanda();
    }
    
    public Rezervare(Persoana persoana, int nrPersoane, String data, String ora, Masa masa, PreComanda preComanda) {
        this.persoana = persoana;
        this.nrPersoane = nrPersoane;
        this.data=data;
        this.ora = ora;
        this.masa = masa;
        this.preComanda = preComanda;
    }

    public boolean rezerva(Masa mese[]){
        persoana.introducere();
        System.out.println("Introduceti:\nNumarul de persoane:");
        this.nrPersoane=input.nextInt();
        System.out.println("Data (zz.ll.aaaa):");
        this.data=input.next();
        System.out.println("Ora (hh.mm):");
        this.ora=input.next();
        System.out.println("Mese valabile:");
        int valabile=0;
        for(int i=0;i<3;i++){
            if(mese[i].getRezervat()==true)
                continue;
            if(mese[i].getLocuri()<this.nrPersoane)
                continue;
            mese[i].afisare();
            valabile++;
        }
        if(valabile==0){
            System.out.println("Niciuna.");
            return false;
        }
        System.out.println("Introduceti numarul mesei dorite: ");
        int m=input.nextInt() - 1;
        if(m>=3){
            System.out.println("Masa inexistenta.");
            return false;
        }
        if(mese[m].getRezervat()){
            System.out.println("Masa deja rezervata!");
            return false;
        }
        this.masa=mese[m];
        this.masa.setRezervat(true);
        System.out.println("Rezervare completa!\n");
        return true;

    }

    
    public void afisare(){
        System.out.println();
        persoana.afisare();
        System.out.println("Numarul de persoane: "+this.nrPersoane+"\nData: "+this.data+"\nOra: "+this.ora);
        masa.afisare();
    }
    
    public void setPersoana(Persoana persoana) {
        this.persoana = persoana;
    }
    public Persoana getPersoana() {
        return persoana;
    }

    public void setnrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }
    public int getnrPersoane() {
        return nrPersoane;
    }

    public void setData(String data) {
        this.data = data;
    }
    public String getData() {
        return data;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }
    public String getOra() {
        return ora;
    }

    public void setMasa(Masa masa) {
        this.masa = masa;
    }
    public Masa getMasa() {
        return masa;
    }

    public void setPreComanda(PreComanda preComanda) {
        this.preComanda = preComanda;
    }
    public PreComanda getPreComanda() {
        return preComanda;
    }

    
}
