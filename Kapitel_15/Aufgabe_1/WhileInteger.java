import java.util.Scanner;

class WhileInteger {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Startwert: ");
        int startwert = scan.nextInt();

        System.out.print("Endwert: ");
        int endwert = scan.nextInt();

        while (startwert <= endwert) {
            System.out.println(startwert);
            startwert++;
        }

        scan.close();
    }
}
