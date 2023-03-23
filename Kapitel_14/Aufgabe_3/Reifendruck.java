import java.util.Scanner;

class Reifendruck {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Reifendruck rechter Vorderreifen: ");
        double druckVorneRechts = scan.nextDouble();

        System.out.print("Reifendruck linker Vorderreifen: ");
        double druckVorneLinks = scan.nextDouble();

        System.out.print("Reifendruck rechter Hinterreifen: ");
        double druckHintenRechts = scan.nextDouble();

        System.out.print("Reifendruck linker Hinterreifen: ");
        double druckHintenLinks = scan.nextDouble();

        if (druckVorneRechts == druckVorneLinks && druckHintenRechts == druckHintenLinks) {
            System.out.print("Reifendruck ist OK");
        } else {
            System.out.print("Reifendruck ist nicht OK");
        }

        scan.close();
    }
}
