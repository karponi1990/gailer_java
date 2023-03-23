import java.util.Scanner;

class IntegerNAddieren {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Geben Sie n ein: ");
        int n = scan.nextInt();

        double summe = 0.0;
        int i = 1;

        while (i <= n) {
            summe = summe + 1.0 / i;
            i++;
        }
        System.out.println("Die Summe ist: " + summe);

        scan.close();
    }
}
