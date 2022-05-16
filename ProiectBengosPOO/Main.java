package ProiectBengosPOO;

import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        Masa mese []= new Masa[15];
        Rezervare rezervari []= new Rezervare[10];
        int nr=0;

        System.out.println("Salutari!\nBine ati venit la Impinge Tava!");
        mese[0]= new Masa(2,1,"interior", false);
        mese[1]= new Masa(4,2,"interior", true);
        mese[2]= new Masa(8, 3, "interior", false);
        while(true){
            System.out.println("Selectati optiunea dorita:");
            System.out.println("1. Rezervare\n2. Afiseaza rezervarile curente\n3. Iesire");
            int actiune;
            actiune=input.nextInt();
            switch (actiune) {
                case 1:
                    Rezervare A= new Rezervare();
                    if(!A.rezerva(mese)){
                        break;
                    }
                    rezervari[nr]=A;
                    nr++;

                    break;
            
                case 2:
                    for(int i=0;i<nr;i++){
                        rezervari[i].afisare();
                    }
                    break;
                
                case 3:
                    return;
                default:
                    System.out.println("Optiunea nu exista!");
                    break;
            }
        }
    }      
}    