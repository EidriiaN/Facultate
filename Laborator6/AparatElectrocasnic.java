/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laborator6.Student;

import java.util.Scanner;

/**
 * 4. Sa se implementeze clasa AparatElectrocasnic: a. Date membru: denumire,
 * producător, consum, pret; b. Metode: i. Constructor implicit; ii. Constructor
 * cu parametri; iii. Metodă ce afișează datele membru; iv. Metodă ce modifica
 * valoarea variabilei pret cu o valoare dată ca parametru; v. Metodă ce
 * returnează valoarea variabilei denumire; vi. Metodă de inițializare a datelor
 * membru cu valori citite de la tastatură; vii. Metodă ce calculează valoarea
 * TVA (19%*pret); Observație. În metoda main() se va declara un tablou de n
 * obiecte de tip AparatElectrocasnic (valoarea lui n este citita de la
 * tastatura). Acesta va fi inițializat cu datele introduse de la tastatură. Se
 * vor afișa apoi acele aparate ce au consumul cel mai mic și se va afișa prețul
 * mediu al produselor cu denumirea aspirator.
 *
 */
public class AparatElectrocasnic {

    private String denumire, producator;
    private double consum, pret;

    public AparatElectrocasnic() {
        this.denumire = null;
        this.producator = null;
        this.consum = 0;
        this.pret = 0;
    }

    public AparatElectrocasnic(String nume, String producator, double consum, double pret) {
        this.denumire = nume;
        this.producator = producator;
        this.consum = consum;
        this.pret = pret;
    }

    public void afisare() {
        System.out.println("Denumire:" + denumire
                + "\nProducator:" + producator
                + "\nConsum:" + consum
                + "W\nPret:" + pret + " lei");
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public double getPret(){
        return this.pret;
    }
    
    public String getDenumire() {
        return this.denumire;
    }
    public double getConsum(){
        return this.consum;
    }
    

    public void imput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Denumire:");
        this.denumire = input.nextLine();
        System.out.println("Producator:");
        this.producator = input.nextLine();
        System.out.println("Consum:");
        this.consum = input.nextDouble();
        System.out.println("Pret:");
        this.pret = input.nextDouble();
    }

    public double TVA() {
        return 100 / (this.pret * 19);
    }
}
