import java.util.Scanner;

class Mikrowellenherd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Anzahl der Posten: ");
        int posten = scan.nextInt();

        System.out.print("Erhitzungszeit für einen Posten (in Sekunden): ");
        int zeit = scan.nextInt();

        if (posten == 1) {
            System.out.println("Empfohlene Erhitzungszeit: " + zeit);
        } else if (posten == 2) {
            double empfohleneZeit = zeit * 1.5;
            System.out.println("Empfohlene Erhitzungszeit: " + empfohleneZeit);
        } else if (posten == 3) {
            double empfohleneZeit = zeit * 2;
            System.out.println("Empfohlene Erhitzungszeit: " + empfohleneZeit);
        } else {
            System.out.println("Das Erhitzen von mehr als drei Posten wird nicht empfohlen.");
        }

        scan.close();
    }
}
