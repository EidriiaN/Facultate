package ContEmail;

import java.util.Scanner;

public class ContEmailMain {
    /*
     * Aplicația 8 - clasa ContEmail
     * 8. Să se implementeze clasa ContEmail:
     * a. Date membru: user, parola, capacitate, tipEmail (ex. yahoo, gmail), membru
     * static nrConturi;
     * b. Metode:
     * i. Constructor implicit;
     * ii. Metodă statică ce returnează numărul de conturi create;
     * iii. Metodă ce afișează datele membru;
     * iv. Metodă care modifică parola;
     * v. Metodă de inițializare a datelor membru cu valori citite de la tastatură;
     * vi. Metodă care verifică dacă două conturi sunt identice (după user);
     * vii. Metodă care verifică dacă parola are 8 caractere minim.
     * viii. Metodă care va afișa un mesaj de atenționare dacă s-a depășit 2/3 din
     * capacitatea de stocare.
     * Observație. În metoda main() se va declara un tablou de n obiecte de tip
     * ContEmail
     * (valoarea lui n este citită de la tastatură). Acesta va fi inițializat cu
     * datele introduse de la
     * tastatură. Se vor afișa toate conturile email de tip Gmail. De asemenea se va
     * număra conturile
     * cu același user, dar de tipuri diferite. Este posibil să aveți nevoie de și
     * alte metode pentru a
     * rezolva cerințele.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Introdu numarul de conturi:");
        
        int n=input.nextInt();
        ContEmail [] C;
        C= new ContEmail[n];

        for(int i=0;i<C.length;i++){
            C[i]=new ContEmail();
            C[i].input();
        }

        System.out.println("\nConturile de tip Gmail sunt:");
        for(int i=0;i<C.length;i++){
            if(C[i].getTipEmail().equals("Gmail")){
                System.out.println(C[i].toString());
                System.out.println();
            }
        }

        int contor=0;
        for(int i=0;i<C.length-1;i++){
            if(C[i].verificaUserName(C[i+1]) && (C[i].verificaTipMail(C[i+1])))
                 contor++;
        }
        System.out.println("Conturile cu user asemanator si tip diferit sunt in numar de "+contor);
    }
}
