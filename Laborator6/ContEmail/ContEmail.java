package ContEmail;

import java.util.Scanner;

/*Aplicația 8 - clasa ContEmail
8. Să se implementeze clasa ContEmail:
a. Date membru: user, parola, capacitate, tipEmail (ex. yahoo, gmail), membru
static nrConturi;
b. Metode:
i. Constructor implicit;
ii. Metodă statică ce returnează numărul de conturi create;
iii. Metodă ce afișează datele membru;
iv. Metodă care modifică parola;
v. Metodă de inițializare a datelor membru cu valori citite de la tastatură;
vi. Metodă care verifică dacă două conturi sunt identice (după user);
vii. Metodă care verifică dacă parola are 8 caractere minim.
viii. Metodă care va afișa un mesaj de atenționare dacă s-a depășit 2/3 din
capacitatea de stocare.
Observație. În metoda main() se va declara un tablou de n obiecte de tip ContEmail
(valoarea lui n este citită de la tastatură). Acesta va fi inițializat cu datele introduse de la
tastatură. Se vor afișa toate conturile email de tip Gmail. De asemenea se va număra conturile
cu același user, dar de tipuri diferite. Este posibil să aveți nevoie de și alte metode pentru a
rezolva cerințele.
*/
public class ContEmail {

    private String user, parola, tipEmail;
    private int capacitate;
    private static int nrConturi = 0;

    public ContEmail() {
        this.user = "";
        this.parola = "";
        this.tipEmail = "";
        this.capacitate = 0;
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("User:");
        this.user = input.nextLine();
        System.out.println("Parola:");
        this.parola = input.nextLine();
        System.out.println("Tip Email:");
        this.tipEmail = input.nextLine();
        System.out.println("Capacitate:");
        this.capacitate = input.nextInt();
    }

    public void nrConturi(){
        nrConturi++;
    }
    public String toString() {
        return this.user + "\n" + this.parola + "\n" + this.tipEmail + "\n" + this.capacitate + "\n";
    }

    public boolean verificaUserName(ContEmail A) {
        if (this.user.equals(A.getUser()))
            return true;
        return false;
    }
    public boolean verificaTipMail(ContEmail A){
        if (!this.tipEmail.equals(A.getTipEmail()))
            return true;
        return false;
    }

    public boolean nrChar() {
        if (this.parola.length() > 8)
            return true;
        return false;
    }

    public void spatiuOcupat(ContEmail A) {
        if (A.capacitate > 12 * 2 / 3)
            System.out.println("S-a depasit 2/3 din capacitatea toatala de 12");
    }

    public String getUser() {
        return user;
    }

    public static int getNrConturi() {
        return nrConturi;
    }

    public static void setNrConturi(int nrConturi) {
        ContEmail.nrConturi = nrConturi;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    public String getTipEmail() {
        return tipEmail;
    }

    public void setTipEmail(String tipEmail) {
        this.tipEmail = tipEmail;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
