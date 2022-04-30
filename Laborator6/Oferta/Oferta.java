package Oferta;
/*Aplicația 9 - clasa Oferta
9. Să se implementeze clasa Ofertă (prin Oferta se înțelege oferta unei agenții de turism):
a. Date membru: agenție, locație (mare/munte), tipCazare (hotel/pensiune),
tipMasa (MD, DP, Pensiune completa), nrZile, perioada;
b. Metode:
i. Constructor implicit;
ii. Metode setter și getter pentru datele membru;
iii. Metodă ce afișează datele membru;
iv. Metodă care prelungește numărul de zile de cazare, după solicitarea
unui client;
v. Metodă care verifică dacă există oferte cu MD pentru o perioadă mai
mare de 5 zile;
vi. Metodă care verifică dacă există oferte la mare cu pensiune completă și
număr zile mai mare de 10.
Observație. În metoda main() se va declara un tablou de n obiecte de tip Oferta (valoarea
lui n este citită de la tastatură). Acesta va fi inițializat cu datele introduse de la tastatură. Se vor
afișa toate biletele de avion care au ca destinație Paris. De asemenea se va afișa toate ofertele
unei anumite agenții (se va solicita printr-un mesaj introducerea numelui agenției).
*/

import java.util.Scanner;

public class Oferta {
    
    private String agentie, locatie, tipCazare, tipMasa;
    private int nrZile, perioada;
    
    public Oferta() {
        this.setAgentie("");
        this.setLocatie("");
        this.setTipCazare("");
        this.setTipMasa("");
        this.setNrZile(0);
        this.setPerioada(0);
    }

    public int getPerioada() {
        return perioada;
    }

    public void setPerioada(int perioada) {
        this.perioada = perioada;
    }

    public int getNrZile() {
        return nrZile;
    }

    public void setNrZile(int nrZile) {
        this.nrZile = nrZile;
    }

    public String getTipMasa() {
        return tipMasa;
    }

    public void setTipMasa(String tipMasa) {
        this.tipMasa = tipMasa;
    }

    public String getTipCazare() {
        return tipCazare;
    }

    public void setTipCazare(String tipCazare) {
        this.tipCazare = tipCazare;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public String getAgentie() {
        return agentie;
    }

    public void setAgentie(String agentie) {
        this.agentie = agentie;
    }

    public String toString(){
        return "Agentie:"+this.agentie+"\nLocatie:"+this.locatie+"\nTip cazare:"+this.tipCazare+"\nTip masa:"+this.tipMasa+"\nNumar de zile:"+this.nrZile
        +"\nPerioada:"+this.perioada;
    }
    public void prelungire(){
        System.out.println("Cu cate zile doriti sa prelungiti sederea?\nIntrodu numarul de zile:");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        this.nrZile+=n;
        System.out.println("Sederea a fost extinsa cu "+n+" zile, totalul sejurului este de "+this.nrZile+" zile");
    }
}
