import java.util.Scanner;

class Ratenzahlung {
    public static void main(String[] args) {

        double saldo = 1000.0;
        double zinssatz = 0.015;
        double gesamtbetrag = 0.0;
        int monat = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Geben Sie den monatlichen Betrag ein: ");
        double rate = scan.nextDouble();

        while (saldo > 0.0) {
            monat++;
            double zinsen = saldo * zinssatz;
            saldo = saldo + zinsen - rate;
            gesamtbetrag = gesamtbetrag + rate;
            System.out.println("Monat: " + monat + "\tSaldo: " + saldo + " \tGesamtbetrag: " + gesamtbetrag);
        }

        scan.close();
    }
}
