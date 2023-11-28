import javax.swing.*;

public class Oef9 {
    public static void main(String[] args) {
        //1+2+3+4=10;
      /*  int getal=Integer.parseInt(JOptionPane.showInputDialog("Geef getal"));
        int som=0;
        for(int i=0;i<getal;i++){
            som+=i;

        }
        System.out.println(som);
*/
        int getal2 = Integer.parseInt(JOptionPane.showInputDialog("Geef getal"));
        int total = 0;
        String s = " ";
        for (int i = 1; i < getal2; i++) {

            if (i == getal2 - 1)
                total += i;
            else
                s += i + " ";

        }
        s += " = " + total;
        System.out.println(s);


    }
}
