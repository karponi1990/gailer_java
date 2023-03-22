import java.util.Scanner;

class Fallgeschwindigkeit {
    public static void main(String[] args) {
        
        double g = 9.81;
        double meter;

        Scanner scan = new Scanner(System.in);

        System.out.print("Geben Sie die Anzahl der Sekunden ein: ");
        double sec = scan.nextDouble();
        scan.close();
        meter = 0.5 * g * sec * sec;

        System.out.print("Die Entfernung e betraegt: " + meter + " Meter");
    }
}
