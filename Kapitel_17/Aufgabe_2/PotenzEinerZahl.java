import java.util.Scanner;

class PotenzEinerZahl {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Geben Sie x ein: ");
        double x = scan.nextDouble();
        System.out.print("Geben Sie n ein: ");
        int n = scan.nextInt();

        scan.close();

        if (n < 0) {
            System.out.println("n muss ein positiver Integer sein.");
            return;
        }

        double result = 1.0;
        int i = 0;

        while (i < n) {
            result = result * x;

            i++;
        }
        System.out.println(x + " hoch " + n + " ergibt: " + result);
    }
}
