import java.util.Scanner;

class Discoutpreise {
    public static void main(String[] args) {

        int betrag;
        double preis;

        Scanner scan = new Scanner(System.in);

        System.out.print("Geben Sie den Gesamtbetrag ein: ");
        betrag = scan.nextInt();

        if (betrag >= 1000) {
            preis = betrag * 0.9;
        } else {
            preis = betrag;
        }

        System.out.print("Discountpreis: " + preis);

        scan.close();
    }
}
