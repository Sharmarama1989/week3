import javax.swing.*;

public class Oefening6 {
    public static void main(String[] args) {
        int getal = Integer.parseInt(JOptionPane.showInputDialog("Geef een getal"));
        int product=1;
        for (int i = 1; i < getal; i++) {
           product=product*i;
        }
        //faculteit uitprinten
        System.out.println("faculteit= "+product );
    }
}