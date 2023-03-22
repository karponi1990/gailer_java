import java.util.Scanner;

class Stromkosten {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Geben Sie den Preis pro Kilowattstunde in Cent ein: ");
        double preis = scan.nextDouble();
      
        System.out.print("Geben Sie die Anzahl der Kilowattstunden pro Jahr ein: ");
        double kwh = scan.nextDouble();
      
        scan.close();

        double kosten = preis * kwh / 100;
      
        System.out.println("Jahreskosten: " + kosten);
    }
}
