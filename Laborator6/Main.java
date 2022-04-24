/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laborator6;

import java.util.Scanner;

/**
 * 3. Sa se implementeze clasa Student: a. Date membru: nume, prenume,
 * specializare, an, medie, valoareBursa; b. Metode: i. Constructor implicit;
 * ii. Constructor cu parametri; iii. Metodă ce afișează datele membru; iv.
 * Metodă ce modifica valoarea variabilei specializare cu o valoare dată ca
 * parametru; v. Metodă ce returnează valoarea variabilei an; vi. Metodă de
 * inițializare a datelor membru cu valori citite de la tastatură; vii. Metodă
 * ce returnează valoarea mediei.
 *
 */
public class Main {

    public static void main(String[] args) {
        Student[] s;
        s= new Student[3];
        Scanner input= new Scanner(System.in);
        for (int i = 0; i < s.length; i++) {
            s[i]= new Student();
            s[i].input();
            System.out.println();
        }
        for (int i = 0; i < s.length; i++)
        {
            s[i].afisare();
            System.out.println();
        }
        int nr=0;
        System.out.println("Elevii care au media peste 9 sunt:");
        for(int i=0;i<s.length;i++)
        {
            if(s[i].getMedie()>=9)
            {
                s[i].afisare();
                System.out.println();
            }
            if(s[i].getBursa()>=400)
                nr++;
        }
        System.out.println("Un numar de "+nr+" elevi au burse mai mari sau egale cu 400 de lei!");
    }
}
