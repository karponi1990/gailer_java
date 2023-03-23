import java.util.Scanner;

class WhileStingLengt {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Geben Sie ein Wort ein: ");
        String wort = scan.next();

        int wortlaenge = wort.length();
        int i = 1;

        while (i <= wortlaenge) {
            System.out.println(wort);
            i++;
        }

        scan.close();
    }
}
