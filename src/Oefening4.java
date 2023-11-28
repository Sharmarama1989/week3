import javax.swing.*;

public class Oefening4 {
    public static void main(String[] args) {
        double som=0;
      for(int i=0;i<5;i++){
          double getal= Double.parseDouble(JOptionPane.showInputDialog("Geef een getal"));
          som+=getal;
      }

        System.out.println("Gemidelde is "+(som/5));
    }
}