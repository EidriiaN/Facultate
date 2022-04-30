package BiletAvion;
import java.util.Scanner;

public class BiletAvionMain {
    /*
     * Aplicația 7 - clasa BiletAvion
     * 7. Să se implementeze clasa BiletAvion:
     * a. Date membru: rutaZbor, nrBilet, preț, oraDecolare, oraAterizare,
     * durataZbor;
     * b. Metode:
     * i. Constructor implicit;
     * ii. Constructor cu parametri;
     * iii. Constructor de copiere;
     * iv. Metodă ce afișează datele membru;
     * v. Metodă care setează prețul biletului;
     * vi. Metodă de inițializare a datelor membru cu valori citite de la tastatură;
     * vii. Metodă care verifică dacă a existat întârziere a zborului;
     * viii. Metodă care va returna ruta de zbor.
     * Observație. În metoda main() se va declara un tablou de n obiecte de tip
     * BiletAvion
     * (valoarea lui n este citită de la tastatură). Acesta va fi inițializat cu
     * datele introduse de la
     * tastatură. Se vor afișa toate biletele de avion care au ca destinație Paris.
     * De asemenea se va afișa
     * rutele unde s-au înregistrat întârzieri ale zborurilor.
     * Să se indice zborul cel mai scump, respectiv zborul cel mai ieftin.
     * Câte zboruri au ca durată de zbor peste 3 ore?
     */
    public static void main(String[] args) {

        System.out.println("Introdu numarul de zboruri:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        BiletAvion[] Bilet;
        Bilet = new BiletAvion[n];

        // Introducere date
        for (int i = 0; i < Bilet.length; i++) {
            Bilet[i] = new BiletAvion();
            Bilet[i].input();
            System.out.println();
        }

        // Cate zboruri au destinatia Paris
        System.out.println("Zborurile cu destinatia Paris sunt:");
        for (int i = 0; i < Bilet.length; i++) {
            if (Bilet[i].getRutaZbor().equals("Paris")) {
                Bilet[i].afisare();
            }
        }

        // Zborurul cel mai scump, cel mai ieftin
        BiletAvion max = Bilet[0];
        BiletAvion min = Bilet[0];
        int contor=0;

        for (int i = 0; i < Bilet.length; i++) {
            if (Bilet[i].getPret() > max.getPret())
                max = Bilet[i];
            if (Bilet[i].getPret() < min.getPret())
                min = Bilet[i];
            if(Bilet[i].getDurataZbor()>3)
                contor++;
        }

        System.out.println("Biletul cel mai scump este:\n");
        max.afisare();
        System.out.println("Biletul cel mai ieftin este:\n");
        min.afisare();
        System.out.println("Numarul de zboruri cu durata mai mare e 3 ore este:"+contor);
    }
}
