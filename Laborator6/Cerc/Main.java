package Laborator8.Cerc;

public class Main {
    
    public static void main(String[] args) {
        
        Cilindru c1= new Cilindru();

        System.out.println(c1.toString());
        System.out.println();

        Cilindru c2= new Cilindru(10.0);

        System.out.println(c2.toString());
        System.out.println();

        Cilindru c3= new Cilindru(10,"rosu",5);

        System.out.println(c3);
    }
    
}
