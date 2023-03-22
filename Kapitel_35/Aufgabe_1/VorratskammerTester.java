import java.util.Scanner;

class VorratskammerTester{
  public static void main ( String[] args ){

    int auswahl = 0;
    int menge;

    Scanner scan = new Scanner(System.in);

    System.out.println("\n\nWillkommen zu Mutter Hubbard Vorratskammer!");

    Marmelade stachelbeer = new Marmelade( "Stachelbeer", "04.07.09", 12 );
    Marmelade erdbeer     = new Marmelade( "Erdbeer", "30.09.10", 8 );
    Marmelade aprikosen   = new Marmelade( "Aprikosen", "31.10.10", 16 );

    Vorratskammer vorrat = new Vorratskammer(stachelbeer, erdbeer, aprikosen);

    while(true){
        System.out.println("\nDie Vorratskammer enthaelt:\n");
        vorrat.ausgeben();

        System.out.print("Treffen Sie Ihre Auswahl (1,2 oder 3). Exit -1: ");
        auswahl = scan.nextInt();

        while(auswahl != -1 && auswahl != 1 && auswahl != 2 && auswahl != 3){
            System.out.print("FALSCHE AUSWAHL. Treffen Sie Ihre Auswahl (1,2 oder 3). Exit -1: ");
            auswahl = scan.nextInt();
        }

        if(auswahl == -1){
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
