package Apartament;

import java.util.Scanner;

/*Aplicația 10 - clasa Apartament
10. Să se implementeze clasa Apartament:
a. Date membru: nrCamere, localizare (centru, sud, vest etc.), nrEtaj, suprafata,
strada, pretM2 (preț pe metru pătrat), adresa;
b. Metode:
i. Constructor implicit;
ii. Constructor cu parametri;
iii. Metodă ce afișează datele membru;
iv. Metodă de inițializare a datelor membru cu valori citite de la tastatură;
v. Metodă care calculează prețul apartamentului (în funcție de suprafață și
preț de vânzare pe metru pătrat)
vi. Metode setter și getter pentru fiecare membru instanță.
Observație. În metoda main() se va declara un tablou de n obiecte de tip Apartament
(valoarea lui n este citită de la tastatură). Acesta va fi inițializat cu datele introduse de la
tastatură. Câte apartamente au 3 camere? Care este cel mai mare pret de vânzare și unde se află
acest apartament? Câte apartamente cu mai mult de 2 camere au prețul pe metru pătrat mai mare
de 130EUR?
*/
public class Apartament {
    private int nrCamere, nrEtaj, suprafata;
    private String localizare, strada, adresa;
    private double pretM2;

    public Apartament(int nrCamere, int nrEtaj, int suprafata, String localizare, String strada, String adresa,
            double pretM2) {
        this.nrCamere = nrCamere;
        this.nrEtaj = nrEtaj;
        this.suprafata = suprafata;
        this.localizare = localizare;
        this.strada = strada;
        this.adresa = adresa;
        this.pretM2 = pretM2;
    }

    public Apartament() {
        this.nrCamere = 0;
        this.nrEtaj = 0;
        this.suprafata = 0;
        this.localizare = "";
        this.strada = "";
        this.adresa = "";
        this.pretM2 = 0;
    }
    public String toString(){
        return "Numar camere:"+this.nrCamere+"\nNumar etaj:"+this.nrEtaj+"\nSuprafata:"+this.suprafata+"M2\nLocalizarea:"+this.localizare
        +"\nStrada:"+this.strada+"\nAdresa:"+this.adresa+"\nPret:"+this.pretM2+"/M2";
    }
    public void input(){
        Scanner input= new Scanner(System.in);
        System.out.println("Numar camere:");
        this.nrCamere=input.nextInt();
        System.out.println("Numar etaj:");
        this.nrEtaj=input.nextInt();
        System.out.println("Suprafata:");
        this.suprafata=input.nextInt();
        System.out.println("Localizarea:");
        input.nextLine();
        this.localizare=input.nextLine();
        System.out.println("Strada:");
        this.strada=input.nextLine();
        System.out.println("Adresa:");
        this.adresa=input.nextLine();
        System.out.println("Pret/M2:");
        this.pretM2=input.nextDouble();
    }

    public double pretTotal(){
        return this.suprafata*this.pretM2;
    }

    public void vanzare(){
        System.out.println("Pretul de vanzare este "+this.suprafata*this.pretM2);
    }

    public int getNrCamere(){
        return this.nrCamere;
    }
    public int getSuprafata(){
        return this.suprafata;
    }
    public double getPretM2(){
        return this.pretM2;
    }

}
