package arrays;

import javax.swing.*;
import java.util.Arrays;

public class Oefening1 {

    private double[] a = {1, 45, 2, 9, 3};


    public void drukAf() {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public void drukOmgekeerd() {
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);

        }
    }

    public void berekenSum() {
        int som = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            som += a[i];
        }
        System.out.println("The sum is :" + som);

    }

   /* public void berekenGemmidelde() {
        double som = 0;
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
            som += b[i];
        }
        System.out.println("The Average  is :" + som / b.length);
    }

    public void drukGetallenGroterTien() {
        for (int i = 0; i < b.length; i++) {
            if (b[i] > 10) {
                System.out.println(b[i]);
            }

        }
    }*/

    /* public void vermenigvuldig() {
         int getal = Integer.parseInt(JOptionPane.showInputDialog("Geef een getatal"));
         for (int i = 0; i < a.length; i++) {
             if (getal != 0) {
                 System.out.println(a[i] * a[i]);
             }
         }
     }
 */
    // by teacher
    public double berekenSom() {
        int som = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            som += a[i];

        }
        return som;
    }

    public double berekengem() {
        return berekenSom() / a.length;
    }

    public void drukGetallenGroterTient() {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 10) {
                System.out.println(a[i]);
            }

        }
    }

    public double product() {
        double product = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0)
                product *= a[i];
        }
        return product;
    }

    public void vervang() {
        //we werken void ,want deze functie past de array aan en returnt niet 1 waarde
        double gem = berekengem();
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.abs(a[i] - gem);

        }
    }

    public int tellen() {
        int aantal = 0;
        int getal = Integer.parseInt(JOptionPane.showInputDialog("Geef een getal"));
        for (int i = 0; i < a.length; i++) {
            if (getal == a[i])
                aantal++;
        }

        return aantal;
    }

    public double grootste() {
        double voorlopig = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > voorlopig)
                voorlopig = a[i];
        }
        return voorlopig;

    }

    @Override
    public String toString() {
        return "Oefening1{" +
                "a=" + Arrays.toString(a) +
                '}';
    }
}
