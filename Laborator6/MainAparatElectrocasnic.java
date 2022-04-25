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
public class MainAparatElectrocasnic {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cate electrocasnice doriti sa introduceti?");
        int n;
        n = input.nextInt();
        AparatElectrocasnic[] A;
        A = new AparatElectrocasnic[n];
        for (int i = 0; i < A.length; i++) {
            A[i] = new AparatElectrocasnic();
            A[i].imput();
            System.out.println();
        }
        for (int i = 0; i < A.length; i++) {
            A[i].afisare();
            System.out.println();
        }
        double medie = 0;
        int nr = 0;
        for (int i = 0; i < A.length; i++) {
            if ("aspirator".equals(A[i].getDenumire()) || "Aspirator".equals(A[i].getDenumire())) {
                medie += A[i].getPret();
                nr++;
            }
        }
        System.out.println("Media preturilor produselor de tip Aspirator este: " + (double) medie / nr);

        //Sortare
        boolean sortat = false;
        while (sortat == false) {
            sortat = true;
            for (int i = 0; i < A.length-1; i++) {
                for (int j = 1; j < A.length; j++) {
                    if (A[i].getConsum() > A[j].getConsum()) {
                        AparatElectrocasnic[] aux;
                        aux = new AparatElectrocasnic[n];
                        aux[i] = A[i];
                        A[i] = A[j];
                        A[j] = aux[i];
                        sortat = false;

                    }
                }
            }
        }
        System.out.println("Primele 3 produse cu consum redus de energie sunt:");
        for (int i = 0; i < A.length; i++) {
            A[i].afisare();
            System.out.println();
        }
    }

}
