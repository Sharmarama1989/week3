import javax.swing.*;

public class Oefen7 {
    public static void main(String[] args) {
        int getal = Integer.parseInt(JOptionPane.showInputDialog("Geef een getal"));
        for (int i = 1; i < 10; i++) {
            System.out.println(i+ " * "+getal+" = "+(i*getal));

        }
    }
}