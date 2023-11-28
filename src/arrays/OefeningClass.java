package arrays;

import java.util.Scanner;

public class OefeningClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int beginWaarde;
        int eindWaarde;

        // Vraag om de beginwaarde
        System.out.print("Voer de beginwaarde in: ");
        beginWaarde = scanner.nextInt();

        // Vraag om de eindwaarde, zorg ervoor dat deze minstens 50 hoger is dan de beginwaarde
        do {
            System.out.print("Voer de eindwaarde in (minstens 50 hoger dan de beginwaarde): ");
            eindWaarde = scanner.nextInt();

            if (eindWaarde <= beginWaarde + 50) {
                System.out.println("De eindwaarde moet minstens 50 hoger zijn dan de beginwaarde. Probeer opnieuw.");
            }
        } while (eindWaarde <= beginWaarde + 50);

        // Afdrukken van veelvouden tussen begin- en eindwaarde
        System.out.println("Veelvouden tussen " + beginWaarde + " en " + eindWaarde + ":");

        for (int i = beginWaarde; i <= eindWaarde; i++) {
            if (i % 5 == 0) { // Afdrukken van veelvouden van 5 (je kunt dit aanpassen aan andere veelvouden)
                System.out.println(i);
            }
        }

        scanner.close();
    }
}



