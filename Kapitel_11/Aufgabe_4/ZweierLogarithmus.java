import java.util.Scanner;

class ZweierLogarithmus {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Geben Sie ein double ein: ");
        double x = scan.nextDouble();

        double log2x = Math.log(x) / Math.log(2.0);

        System.out.println("Der Zweierlogarithmus von " + x + " ist " + log2x);

        scan.close();
    }
}
