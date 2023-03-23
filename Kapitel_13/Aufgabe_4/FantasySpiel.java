import java.util.Scanner;

class FantasySpiel {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Willkommen zu Yertel's Schatzsuche");
        System.out.print("Geben Sie den Namen der Spielfigur ein: ");
        String name = scan.nextLine();

        System.out.print("Staerke eingeben (1-10): ");
        int staerke = scan.nextInt();

        System.out.print("Gesundheit eingeben (1-10): ");
        int gesundheit = scan.nextInt();

        System.out.print("Glueck eingeben (1-10): ");
        int glueck = scan.nextInt();

        if ((staerke + gesundheit + glueck) > 15) {
            System.out.println("Sie haben Ihrer Spielfigur zu viele Punkte gegeben!");
            staerke = 5;
            gesundheit = 5;
            glueck = 5;
            System.out.println(name + ", Staerke: " + staerke + ", Gesundheit: " + gesundheit + ", Glueck: " + glueck);
        } else {
            System.out.println(name + ", Staerke: " + staerke + ", Gesundheit: " + gesundheit + ", Glueck: " + glueck);
        }

        scan.close();
    }
}
