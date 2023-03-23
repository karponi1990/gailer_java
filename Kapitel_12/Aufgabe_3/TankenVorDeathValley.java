import java.util.Scanner;

class TankenVorDeathValley {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Tankkapazität in Liter: ");
        int tank = scan.nextInt();

        System.out.print("Benzinanzeige: ");
        int anzeige = scan.nextInt();

        System.out.print("Verbauch (l/100km): ");
        int verbrauch = scan.nextInt();

        int aktTank = tank * anzeige / 100;
        double restKM = aktTank / verbrauch * 100;

        if (restKM < 200) {
            System.out.println("Tanken!");
            System.out.println("Restreichweite: " + restKM);
        } else {
            System.out.println("Weiterfahren...");
            System.out.println("Restreichweite: " + restKM);
        }

        scan.close();
    }
}
