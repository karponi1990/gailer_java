import java.util.Scanner;

class OhmscheGesetz {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Geben Sie die Spannung in Volt ein: ");
        double spannung = scan.nextDouble();
      
        System.out.print("Geben Sie den Widerstand in Ohm ein: ");
        double widerstand = scan.nextDouble();
      
        scan.close();

        double stromstaerke = spannung / widerstand;
      
        System.out.println("Die Stromstärke beträgt " + stromstaerke + " Ampere.");
    }
}
