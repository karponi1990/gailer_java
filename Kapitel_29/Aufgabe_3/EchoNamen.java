import java.util.Scanner;

class EchoNamen {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Geben Sie einen Namen ein:");
        String name = scan.nextLine().trim();

        int index = name.indexOf(" ");
        String vorname = name.substring(0, index);
        String nachname = name.substring(index + 1);

        System.out.println(vorname + " " + nachname.toUpperCase());

        scan.close();
    }
}
