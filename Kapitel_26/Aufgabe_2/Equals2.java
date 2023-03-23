import java.util.Scanner;

public class Equals2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean prompt;

        System.out.print("Eingabeaufforderung <ja> oder <nein>? ");
        String eingabe = scan.nextLine();

        String antwort = "ja";

        if (eingabe.equals(antwort)) {
            prompt = true;
        } else {
            prompt = false;
        }

        int summe = 0;
        for (int i = 1; i <= 5; i++) {
            if (prompt) {
                System.out.print("Geben Sie die " + i + ". Zahl ein: ");
            }
            int zahl = scan.nextInt();
            summe = summe + zahl;
        }

        scan.close();
        System.out.println("Gesamtsumme: " + summe);
    }
}
