import java.util.Scanner;

class FlaecheVonRechtecken {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int x1, y1, x2, y2;
        while (true) {

            System.out.println("Erster Eckpunkt X-Koordinate:");
            x1 = scan.nextInt();
            System.out.println("Erster Eckpunkt Y-Koordinate:");
            y1 = scan.nextInt();

            System.out.println("Zweiter Eckpunkt X-Koordinate:");
            x2 = scan.nextInt();
            System.out.println("Zweiter Eckpunkt Y-Koordinate:");
            y2 = scan.nextInt();

            if (x1 == x2 || y1 == y2) {
                System.out.println("Ungültige Eingabe!");
                break;
            }

            int breite = Math.abs(x2 - x1);
            int hoehe = Math.abs(y2 - y1);
            int flaeche = breite * hoehe;

            System.out.println("Breite:  " + breite + "  Höhe: " + hoehe + "   Fläche: " + flaeche);
        }
        System.out.println("Fertig!");

        scan.close();
    }
}
