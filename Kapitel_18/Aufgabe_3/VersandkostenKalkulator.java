import java.util.Scanner;

class VersandkostenKalkulator {
    public static void main(String[] args) {

        final double VERSANDKOSTEN = 3.00;
        final int GEWICHTINK = 10;

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.print("Gewicht der Sendung: ");
            int gewicht = scan.nextInt();
            
            if (gewicht <= 0) {
                System.out.println("Bye");
                break;
            }

            if (gewicht > GEWICHTINK) {
                int diffGewicht = gewicht - GEWICHTINK;
                double aufpreis = diffGewicht * 0.25;

                System.out.println("Versandkosten: $" + (VERSANDKOSTEN + aufpreis));
            }else{
                System.out.println("Versandkosten: $" + VERSANDKOSTEN);
            }
        }
        scan.close();
    }
}
