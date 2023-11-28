package arrays;

import java.util.Arrays;

public class TestOefening1 {
    public static void main(String[] args) {
        Oefening1 oefening1 = new Oefening1();
        System.out.println(oefening1);
      /*  System.out.println(" omgekeerd ");
        oefening1.drukOmgekeerd();
        System.out.println(oefening1);

        System.out.println();
        oefening1.berekenSum();
        oefening1.berekenGemmidelde();
        System.out.println();
        System.out.println("The numbers bigger than ten are :");
        oefening1.drukGetallenGroterTien();*/
        //by teacher
        System.out.println("berekening som: " + oefening1.berekenSom());
        System.out.println("berekening avg: " + oefening1.berekengem());
        oefening1.drukGetallenGroterTient();
        System.out.println();
        // oefening1.vermenigvuldig();
        System.out.println("product = " + oefening1.product());
        // System.out.println(oefening1);
        oefening1.vervang();
        System.out.println(oefening1);
        // tellen 0
        System.out.println("Tellen " + oefening1.tellen());
        oefening1.grootste();
    }
}
