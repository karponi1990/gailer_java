import java.util.Scanner;

class BereicheAddieren {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bereiche addieren");

        System.out.print("Untergrenze des Bereiches: ");
        int uGrenze = scan.nextInt();

        System.out.print("Obergrenze des Bereiches: ");
        int oGrenze = scan.nextInt();

        int summeInGrenze = 0;
        int summeAusGrenze = 0;

        while (true) {

            System.out.print("Daten eingeben: ");
            int wert = scan.nextInt();

            if (wert == 0) {
                break;
            }

            if (wert > uGrenze && wert < oGrenze) {
                summeInGrenze = summeInGrenze + wert;
            } else {
                summeAusGrenze = summeAusGrenze + wert;
            }
        }

        System.out.println("Summe der Werte innerhalb des Bereiches: " + summeInGrenze);
        System.out.println("Summe der Werte außerhalb des Bereiches: " + summeAusGrenze);

        scan.close();
    }
}
