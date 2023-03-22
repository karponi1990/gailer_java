import java.util.Scanner;

class AnredeVergeben {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Geben Sie einen Namen ein:");
            String name = scan.nextLine().trim();

            if (name.isEmpty()) {
                break;
            }

            String anrede = null;
            if (name.startsWith("Amy") || name.startsWith("Buffy") || name.startsWith("Cathy")) {
                anrede = "Ms.";
            } else if (name.startsWith("Elroy") || name.startsWith("Fred") || name.startsWith("Graham")) {
                anrede = "Mr.";
            }

            if (anrede != null) {
                System.out.println(anrede + " " + name);
            } else {
                System.out.println(name);
            }
        }
        scan.close();
    }
}