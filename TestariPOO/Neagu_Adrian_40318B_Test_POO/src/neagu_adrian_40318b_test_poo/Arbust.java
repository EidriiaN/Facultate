/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neagu_adrian_40318b_test_poo;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Arbust extends ObiectDecorativ {
    
    private String denumire, inaltimeMax;
    Scanner input= new Scanner(System.in);
    
    public Arbust(){
        super();
        this.denumire=" ";
        this.inaltimeMax=" ";
    }
    
    public Arbust(String tip, String firma, double pret, String denumire, String inaltimeMax){
        super(tip, firma, pret);
        this.denumire=denumire;
        this.inaltimeMax=inaltimeMax;
    }
    
    @Override
    public void afisare(){
        super.afisare();
        System.out.println("Denumire: "+this.denumire+"\nInaltime maxima: "+this.inaltimeMax);
    }
  
    public String getInaltime(){
        return this.inaltimeMax;
    }
    
    public void input(){
        System.out.println("Introduceti urmatoarele date.");
        System.out.println("Denumire: ");
        this.denumire=input.nextLine();
        System.out.println("Inaltime maxima: ");
        this.inaltimeMax=input.nextLine();
        System.out.println("Tip(interior/exterior): ");
        this.setTip(input.nextLine());
        System.out.println("Firma: ");
        firma=input.nextLine();
        System.out.println("Pret: ");
        this.setPret(input.nextDouble());
    }
}
