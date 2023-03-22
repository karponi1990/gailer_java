import java.util.Scanner;

class KreisFlaeche {
    public static void main(String[] args) {
        
        int radius;
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Geben Sie einen Radius ein: ");

        radius = scan.nextInt();
        scan.close();

        System.out.println("Der Radius ist: \t" + radius );
        System.out.println("Die Flaeche betraegt: \t" + (radius * radius * Math.PI));

        
    }
}
