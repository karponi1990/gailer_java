import java.util.Scanner;

class Ratenzahlung2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Geben Sie den Anfangssaldo ein: ");
        double saldo = scan.nextDouble();

        System.out.print("Geben Sie den monatlichen Zinssatz ein (in Prozent): ");
        double zinssatz = scan.nextDouble() / 100.0;

        System.out.print("Geben Sie den monatlichen Rückzahlungsbetrag ein: ");
        double rate = scan.nextDouble();

        double gesamtbetrag = 0.0;
        int monat = 0;

        while (saldo > 0.0) {

            double zinsen = saldo * zinssatz;
            saldo = saldo + zinsen;

            if (saldo < rate) {
                rate = saldo;
                saldo = saldo - rate;
                gesamtbetrag = gesamtbetrag + rate;
            } else {
                saldo = saldo - rate;
                gesamtbetrag = gesamtbetrag + rate;
            }

            monat++;

            System.out.println("Monat: " + monat + "\tSaldo: " + saldo + " \tGesamtbetrag: " + gesamtbetrag);
        }

        scan.close();
    }
}