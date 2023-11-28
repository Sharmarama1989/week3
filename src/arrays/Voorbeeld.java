package arrays;

public class Voorbeeld {
    public static void main(String[] args) {
        int[] a = new int[3];
        // elk element wordt op 0 gezet.
        a[0] = 1;
        a[2] = 2;


        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
