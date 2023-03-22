import java.util.Scanner;

class NonFettKalkulator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Preis pro Pfund Packung A: ");
        double preisPackA = scan.nextDouble();

        System.out.print("Prozent mageres Fleisch Packung A: ");
        int prozentFettA = scan.nextInt();

        System.out.print("Preis pro Pfund Packung B: ");
        double preisPackB = scan.nextDouble();

        System.out.print("Prozent mageres Fleisch Packung B: ");
        int prozentFettB = scan.nextInt();

        double preisMagerA = preisPackA / (prozentFettA / 100.0);
        double preisMagerB = preisPackB / (prozentFettB / 100.0);

        System.out.println("Packung A kostet pro Pfund mageres Fleisch: " + preisMagerA);
        System.out.println("Packung B kostet pro Pfund mageres Fleisch: " + preisMagerB);

        if (preisMagerA < preisMagerB) {
            System.out.println("Packung A ist preiswerter");
        } else {
            System.out.println("Packung B ist preiswerter");
        }
        
        scan.close();
    }
}
