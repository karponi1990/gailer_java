import java.util.Scanner;

class VorratskammerTester4 {
    public static void main(String[] args) {

        int auswahl = 0;
        int menge;

        Scanner scan = new Scanner(System.in);

        System.out.println("\n\nWillkommen zu Mutter Hubbard Vorratskammer!");

        Marmelade4 stachelbeer = new Marmelade4("Stachelbeer", "04.07.09", 4);
        Marmelade4 erdbeer = new Marmelade4("Erdbeer", "30.09.10", 1);
        Marmelade4 aprikosen = new Marmelade4("Aprikosen", "31.10.10", 2);

        Vorratskammer4 vorrat = new Vorratskammer4(stachelbeer, erdbeer, aprikosen);

        while (true) {
            System.out.println("\nDie Vorratskammer enthaelt:\n");
            vorrat.ausgeben();

            vorrat.gemischteFruechte();

            System.out.print("Treffen Sie Ihre Auswahl (1,2 oder 3). Exit -1: ");
            auswahl = scan.nextInt();

            while (auswahl != -1 && auswahl != 1 && auswahl != 2 && auswahl != 3) {
                System.out.print("FALSCHE AUSWAHL. Treffen Sie Ihre Auswahl (1,2 oder 3). Exit -1: ");
                auswahl = scan.nextInt();
            }

            if (auswahl == -1) {
                scan.close();
                System.out.print("Good-Bye");
                return;
            }

            System.out.print("Geben Sie die Menge ein, die aufgetragen werden soll: ");
            menge = scan.nextInt();

            vorrat.auswaehlen(auswahl);
            vorrat.auftragen(menge);

        }
    }
}
