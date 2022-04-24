/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laborator6;
import java.util.Locale;
import java.util.Scanner;

/**
 *3. Sa se implementeze clasa Student:
a. Date membru: nume, prenume, specializare, an, medie, valoareBursa;
b. Metode:
i. Constructor implicit;
ii. Constructor cu parametri;
iii. Metodă ce afișează datele membru;
iv. Metodă ce modifica valoarea variabilei specializare cu o valoare dată
ca parametru;
v. Metodă ce returnează valoarea variabilei an;
vi. Metodă de inițializare a datelor membru cu valori citite de la tastatură;
vii. Metodă ce returnează valoarea mediei.
 * 
 */
public class Student {
 
    private String nume, prenume, specializare;
    private int an;
    private float medie, valoareaBursa;
    
    public Student(){
        this.nume="";
        this.prenume="";
        this.specializare="";
        this.an=0;
        this.medie=0;
        this.valoareaBursa=0;
    }
    public Student(String nume, String prenume, String specializare, int an, float medie, float valoareaBursa){
        this.nume=nume;
        this.prenume=prenume;
        this.specializare=specializare;
        this.an=an;
        this.medie=medie;
        this.valoareaBursa=valoareaBursa;
    }
    public void afisare(){
        System.out.println("Nume:"+nume+"\nPrenume:"+prenume+"\nSpecializare:"+specializare+"\nAn:"+an+"\nMedie:"+medie+"\nValoare bursa:"+valoareaBursa);
    }
    public void setSpecializare(String specializare){
        this.specializare=specializare;
    }
    public int getAn(){
        return this.an;
    }
    public void input(){
        Scanner input=new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("Introduceti:\nNumele:");
        this.nume=input.nextLine();
        System.out.println("Prenumele:");
        this.prenume=input.nextLine();
        System.out.println("Specializarea:");
        this.specializare=input.nextLine();
        System.out.println("Anul:");
        this.an=input.nextInt();
        System.out.println("Medie:");
        this.medie=input.nextFloat();
        System.out.println("Valoarea bursei:");
        this.valoareaBursa=input.nextFloat();
    }
    public float getMedie(){
        return this.medie;
    }
    public float getBursa(){
        return this.valoareaBursa;
    }
}
