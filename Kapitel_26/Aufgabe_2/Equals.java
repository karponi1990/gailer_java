import java.util.Scanner;

class Equals {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int summe = 0;
        for (int i = 1; i <= 5; i++) {

            System.out.print("Geben Sie die " + i +". Zahl ein: ");
            int zahl = scan.nextInt();
            summe = summe + zahl;
        }

        scan.close();
        System.out.println("Gesamtsumme: " + summe);
    }
}
