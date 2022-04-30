package BiletAvion;
import java.util.Scanner;

public class BiletAvion {
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
     * rutele unde s-au înregistrat întârzieri ale zborurilor. Să se indice zborul
     * cel mai scump, respectiv
     * zborul cel mai ieftin. Câte zboruri au ca durată de zbor peste 3 ore?
     */
    private String rutaZbor;
    private int nrBilet, oraDecolare, oraAterizare, durataZbor;
    private double pret;

    public BiletAvion() {
        this.rutaZbor = "";
        this.nrBilet = 0;
        this.oraDecolare = 0;
        this.oraAterizare = 0;
        this.durataZbor = 0;
        this.pret = 0;
    }

    public BiletAvion(String rutaZbor, int nrBilet, int oraDecolare, int oraAterizare, int durataZbor, double pret) {
        this.rutaZbor = rutaZbor;
        this.nrBilet = nrBilet;
        this.oraDecolare = oraDecolare;
        this.oraAterizare = oraAterizare;
        this.durataZbor = durataZbor;
        this.pret = pret;
    }

    public BiletAvion(BiletAvion A) {
        this.rutaZbor = A.rutaZbor;
        this.nrBilet = A.durataZbor;
        this.oraDecolare = A.oraDecolare;
        this.oraAterizare = A.durataZbor;
        this.durataZbor = A.durataZbor;
        this.pret = A.pret;
    }

    public String getRutaZbor() {
        return rutaZbor;
    }

    public void setRutaZbor(String rutaZbor) {
        this.rutaZbor = rutaZbor;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public int getDurataZbor(){
        return this.durataZbor;
    }
    public void afisare() {
        System.out.println("Ruta Zbor:" + rutaZbor +
                "\nNumar bilet:" + nrBilet +
                "\nOra decolare:" + oraDecolare +
                "\nOra aterizare:" + oraAterizare +
                "\nDurata zbor:" + durataZbor +
                "\nPret:" + pret);
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ruta zbor:");
        this.rutaZbor = input.nextLine();
        System.out.println("Numar bilet:");
        this.nrBilet = input.nextInt();
        System.out.println("Ora decolare:");
        this.oraDecolare = input.nextInt();
        System.out.println("Ora aterizare:");
        this.oraAterizare = input.nextInt();
        System.out.println("Durata zbor:");
        this.durataZbor = input.nextInt();
        System.out.println("Pret:");
        this.pret = input.nextDouble();
    }
}