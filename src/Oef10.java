import javax.swing.*;

public class Oef10 {
    public static void main(String[] args) {
        double getal = Double.parseDouble(JOptionPane.showInputDialog("Geef getal"));
        for (double i = 1; i <= 10; i++) {
            double result = Math.pow(getal, i);

            System.out.println(getal + " ^ " + i + " = " + result);
        }
        System.out.println();
       /* int getal = Integer.parseInt(JOptionPane.showInputDialog("Geef getal"));
        for (int macht = 0; macht<=10; macht++) {
            Math.pow(getal,2);
            System.out.println(Math.pow(getal,macht));
        }*/
    }
}
