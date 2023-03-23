import java.util.Scanner;

class WettbewerbTortenEssen {
    public static void main(String[] args) {

        double gewicht;
        Scanner scan = new Scanner(System.in);

        System.out.print("Geben Sie das Gewicht des Teinehemers an: ");
        gewicht = scan.nextDouble();

        if (gewicht > 235 && gewicht < 265) {
            System.out.println("Der Teilnehmer ist zugelassen.");
        } else {
            System.out.println("Der Teilnehmer ist NICHT zugelassen.");
        }

        scan.close();
    }
}
