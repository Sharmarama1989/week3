import javax.swing.*;

public class Oef5 {
    public static void main(String[] args) {
        // je lijjst alvast je eerste getal in en maakt dit kleinste en grootste
        double getal = Double.parseDouble(JOptionPane.showInputDialog("Geef een getal"));
        double voorlopigGkleinste= getal;
        double voorlopigGrootste = getal;
        // nu nog 9 inlezen ipv 10
        for (int i = 0; i < 9; i++) {
            getal = Double.parseDouble(JOptionPane.showInputDialog("Geef een getal"));
            System.out.println(" getal :"+getal);
            if(getal > voorlopigGrootste)
            voorlopigGrootste=getal;
             else if(getal<voorlopigGkleinste)
             voorlopigGkleinste=getal;


            System.out.println("De "+getal+ " is kleinste "+voorlopigGkleinste);
            System.out.println("De "+getal+ " is grotste "+voorlopigGrootste);
        }
    }
}