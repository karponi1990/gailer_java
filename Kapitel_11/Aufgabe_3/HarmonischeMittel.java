import java.util.Scanner;

class HarmonischeMittel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie x ein: ");
        double x = scanner.nextDouble();

        System.out.print("Geben Sie y ein: ");
        double y = scanner.nextDouble();

        double arithmetischesMittel = (x + y) / 2.0;
        System.out.println("Arithmetisches Mittel: " + arithmetischesMittel);

        double harmonischesMittel = 2.0 / (1.0 / x + 1.0 / y);
        System.out.println("Harmonisches Mittel: " + harmonischesMittel);

        scanner.close();
    }
}
