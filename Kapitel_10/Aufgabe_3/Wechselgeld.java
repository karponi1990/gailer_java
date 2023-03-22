import java.util.Scanner;

class Wechselgeld {
    public static void main(String[] args) {

        int wechselgeld;

        System.out.print("Geben Sie das Wechselgeld in Cent ein: ");

        Scanner scan = new Scanner(System.in);

        wechselgeld = scan.nextInt();
        scan.close();

        int dollar = wechselgeld / 100;
        int rest1 = wechselgeld % 100;
        int quarter = rest1 / 25;
        int rest2 = rest1 % 25;
        int dime = rest2 / 10;
        int rest3 = rest2 % 10;
        int nickel = rest3 / 5;
        int cent = rest3 % 5;
        
        System.out.println("Das Wechselgeld ist " + dollar + " Dollar, " + quarter + " Quarter, " + dime + " Dime, " + nickel + " Nickel und " + cent + " Cent.");
    }
}
