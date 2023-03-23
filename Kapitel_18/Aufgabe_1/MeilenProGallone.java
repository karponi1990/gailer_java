import java.util.Scanner;

class MeilenProGallone {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Anfangsstand Meilen: ");
            int anfangsstand = scan.nextInt();

            if (anfangsstand < 0) {
                System.out.println("bye");
                break;
            }

            System.out.print("Endstand Meilen: ");
            int endstand = scan.nextInt();

            System.out.print("Gallonen: ");
            int gallonen = scan.nextInt();

            double mpg = (endstand - anfangsstand) / gallonen;
            System.out.println("Meilen pro Gallone: " + mpg);
        }

        scan.close();
    }
}
