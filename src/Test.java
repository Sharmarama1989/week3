import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double num= scan.nextDouble();
int min=0;
int max=0;
        for(int i=1;i<=num;i++){
            System.out.println(i);
     if(i>max)
         max=i;

            if(i<min)
                min=i;


        }
        System.out.println("MAX "+ max);
        System.out.println("Min "+ min);
    }
}
