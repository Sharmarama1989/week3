import javax.swing.*;

public class Oefening8 {
    public static void main(String[] args) {
        int aantal = Integer.parseInt(JOptionPane.showInputDialog("Geef een aantal"));
        // to print 0,1,1,2,3,5,8
        int  g1=0;
        int g2=1;
        System.out.println(g1);
        if(aantal>1)
        System.out.println(g2);
        for(int i=0;i<aantal-2;i++){
           int som= g1+g2;
            System.out.println(som);
            g1=g2;
            g2=som;

        }

    }
}
