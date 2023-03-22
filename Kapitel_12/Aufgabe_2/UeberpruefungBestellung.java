import java.util.Scanner;

class UeberpruefungBestellung {
    public static void main(String[] args) {
        
        final int PREISSCHRAUBE = 5;
        final int PREISMUTTER = 3;
        final int PREISUNTERLEGS = 1;

        Scanner scan = new Scanner(System.in);

        System.out.print("Anzahl der Schrauben: ");
        int anzSchrauben = scan.nextInt();

        System.out.print("Anzahl der Muttern: ");
        int anzMuttern = scan.nextInt();

        System.out.print("Anzahl der Beilagscheiben: ");
        int anzBeilagS = scan.nextInt();


        if(anzSchrauben > anzMuttern){
            System.out.println("Kontrollieren Sie Ihre Bestellung!");
        }else{
            System.out.println("Die Bestellung ist okay");
            System.out.println("Gesamtbetrag: " + ((anzSchrauben * (PREISSCHRAUBE * 0.01)) + (anzMuttern * (PREISMUTTER * 0.01)) + (anzBeilagS * (PREISUNTERLEGS * 0.01))) + " Euro");
        }

        scan.close();
    }
}
