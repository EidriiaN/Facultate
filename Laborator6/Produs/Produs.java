package Laborator8.Produs;

import java.util.Scanner;

/**
 * 
 * Produs
 */

public class Produs {

    private String denumire, producator;
    private double pret;
    Scanner input = new Scanner(System.in);

    public Produs() {
        this.denumire = "";
        this.producator = "";
        this.pret = 0;
    }

    public Produs(String denumire, String producator, double pret) {
        this.denumire = denumire;
        this.producator = producator;
        this.pret = pret;
    }

    public String toString() {
        return "Denumire: " + this.denumire + "\nProducator: " + this.producator + "/nPret: " + this.pret;
    }

    public boolean depasestePret() {
        System.out.println("Pretul comparator:");
        return input.nextDouble() < this.pret;
    }

    public boolean verificaProduse() {
        return input.nextLine().equals(this.producator);
    }

    public double getPret() {
        return pret;
    }

    public String getProducator() {
        return producator;
    }

}