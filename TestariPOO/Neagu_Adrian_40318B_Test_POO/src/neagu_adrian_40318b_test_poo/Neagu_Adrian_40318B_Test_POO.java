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
public class Neagu_Adrian_40318B_Test_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        ObiectDecorativ A= new ObiectDecorativ("Boschete", "Dedeman", 200);
        
        //Punctul 1:
        A.afisare();
        System.out.println("Introduceti noul tip:");
        A.setTip(input.nextLine());
        A.afisare();
        
        
        System.out.println();
        
        //Punctul 2:
        Arbust B= new Arbust("Boschete", "Dedeman", 300, "Arbust", "200 metri");
        B.afisare();
        
        System.out.println();
        
        System.out.println("Inaltimea este egala cu "+B.getInaltime());
        
        System.out.println();
        
        //Punctul 3:
        System.out.println("Introduceti numarul de Arbusti:");
        int nr=0, n=input.nextInt();
        
        Arbust[] arbust;
        arbust=new Arbust[n];
        
        for(int i=0;i<arbust.length;i++){
            arbust[i]=new Arbust();
            arbust[i].input();
            if(arbust[i].getInaltime().equals("30"))
                nr++;
        }
        System.out.println("Numarul de arbusti cu inaltimea de 30 cm este de "+nr);
        System.out.println("\nLista cu arbustii cu pretul mai mare de 200 de lei");
        
        for(int i=0;i<arbust.length;i++){
            if(arbust[i].getPret()>200){
                arbust[i].afisare();
                System.out.println();
            }
        }
    }
    
}
