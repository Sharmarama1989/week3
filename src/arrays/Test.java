package arrays;

import javax.swing.*;

public class Test {
    private int[] lijstGetallen = new int[5];

    public Test() {
        for (int i = 0; i < 5; i++) {
            String invoer = JOptionPane.showInputDialog("Geef getal");
            int getal = Integer.parseInt(invoer);
            this.lijstGetallen[i] = getal;
        }
    }

    public void drukAf() {
        for (int i = 0; i < 5; i++) {
            System.out.println(lijstGetallen[i]);
        }
    }

    public void drukOmgekeerd() {
        for (int i = lijstGetallen.length - 1; i >= 0; i--) {
            System.out.println(lijstGetallen[i]);
        }
    }

}


