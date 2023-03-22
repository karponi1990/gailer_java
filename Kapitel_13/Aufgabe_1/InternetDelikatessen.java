import java.util.Scanner;

class InternetDelikatessen {
    public static void main(String[] args) {
        
        double versand = 0.0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Geben Sie den Artikel ein: ");
        String artikel = scan.nextLine();

        System.out.print("Geben Sie den Preis ein: ");
        double preis = scan.nextDouble();

        System.out.print("Expressversand (0==nein, 1==ja): ");
        int express = scan.nextInt();

        scan.close();

        if(express == 1){
            versand = 5.0;
        }

        if(preis < 10.0){
            versand = versand + 2.0;
        }else{
            versand = versand + 3.0;
        }

        System.out.println("Rechnung:");
        System.out.println("\t" + artikel + ": " + preis);
        System.out.println("\tVersand: " + versand);
        System.out.println("\tGesamt:  " + (versand + preis));
    }
}
