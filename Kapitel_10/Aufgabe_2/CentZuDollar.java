import java.util.Scanner;

class CentZuDollar {
    public static void main(String[] args) {
        
        int cent;
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Geben Sie einen Cent Betrag ein: ");

        cent = scan.nextInt();
        scan.close();

        int dollars = cent / 100;
        int cents = cent % 100;
        System.out.println("Das ergibt " + dollars + " Dollar und " + cents + " Cent.");
    }
}
