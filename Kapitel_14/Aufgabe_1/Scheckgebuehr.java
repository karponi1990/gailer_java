import java.util.Scanner;

class Scheckgebuehr {
    public static void main(String[] args) {

        double girokonto, sparkonto;
        Scanner scan = new Scanner(System.in);

        System.out.print("Geben Sie den Kontostand für das Girokonto ein: ");
        girokonto = scan.nextDouble();

        System.out.print("Geben Sie den Kontostand für das Sparkonto ein: ");
        sparkonto = scan.nextDouble();

        if (girokonto > 1000 || sparkonto > 1500) {
            System.out.println("Es wird keine Scheckgebühr erhoben.");
        } else {
            System.out.println("Es wird eine Scheckgebühr von 0.15$ erhoben.");
        }

        scan.close();
    }
}
