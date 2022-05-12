/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpoo;

/**
 *
 * @author User
 */
public class TestPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Cerc A = new Cerc(4, 5, 4);
        Cerc B = new Cerc(3, 2, 4);
        //AFISARE
        A.afisare();
        B.afisare();
        //ARIE
        double arieA = A.aria(), arieB = B.aria();
        if (arieA > arieB) {
            System.out.println("Aria cercului A este mai mare!");
        } else if (arieA < arieB) {
            System.out.println("Aria cercului B este mai mare!");
        } else {
            System.out.println("Ariile sunt egale!");
        }
        //NATURA CERCULUI
        if (A.concentrice(B)) {
            System.out.println("Cercurile sunt concentrice!");
        }
        if (A.exterioare(B)) {
            System.out.println("Cercurile sunt exterioare");
        }
    }
}
