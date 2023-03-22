import java.util.Scanner;

class IntegerAddieren {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Wie viele Integer sollen addiert werden: ");
        int count = scan.nextInt();

        int sum = 0;
        int i = 0;

        while (i < count) {
            System.out.print("Geben Sie einen Integer ein: ");
            int number = scan.nextInt();
            sum = sum + number;
            i++;
        }

        System.out.println("Die Summe ist " + sum);

        scan.close();
    }
}
