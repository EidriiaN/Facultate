package Laborator8.Produs;

import java.util.Scanner;

/**
 * ProdusMain
 */
public class ProdusMain {

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Produs P1 = new Produs("Telefon", "Samsung", 600);
        P1.toString();
        System.out.println("\nIntroduceti producatorul ce trebuie verificat:");
        System.out.println(P1.verificaProduse());

        System.out.println("\nIntroduceti pragul ce trebuie verificat");
        System.out.println(P1.depasestePret());
    }
}