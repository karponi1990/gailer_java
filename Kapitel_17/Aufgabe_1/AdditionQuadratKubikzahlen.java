import java.util.Scanner;

class AdditionQuadratKubikzahlen {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Geben Sie n ein: ");
        int n = scan.nextInt();

        int sumQuadrat = 0;
        int sumKubik = 0;
        int i = 1;

        while (i <= n) {

            sumQuadrat = sumQuadrat + i * i;
            sumKubik = sumKubik + i * i * i;
            i++;
        }

        System.out.println("Die Quadratsumme ist: " + sumQuadrat);
        System.out.println("Die Kubiksumme ist: " + sumKubik);

        scan.close();
    }
}
