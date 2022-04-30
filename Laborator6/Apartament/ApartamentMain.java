package Apartament;

import java.util.Scanner;

public class ApartamentMain {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("Numarul de apartamente:");
        int n=input.nextInt(), camere=0;
        
        Apartament[] A;
        A=new Apartament[n];


        for(int i=0;i<A.length;i++){
            A[i]=new Apartament();
            A[i].input();
            if(A[i].getNrCamere()>3){
                camere++;
            }
        }


        Apartament Scump=new Apartament();
        int contor=0;
        
        for(int i=0;i<A.length;i++){
            if(A[i].pretTotal()>Scump.pretTotal()){
                Scump=A[i];
            }
            if(A[i].getNrCamere()>2 && A[i].getPretM2()>130){
                contor++;
            }
        }
        System.out.println("Sunt "+camere+" apartamente cu mai mult de 3 camere.\n");
        System.out.println("Sunt "+contor+" apartamente cu pretul/M2 mai mare decat 130E si mai mult de 2 camere.\n");
        System.out.println("Apartamentul cu pretul cel mai mare pe suprafata este:\n"+Scump.toString());
        
    }
}
