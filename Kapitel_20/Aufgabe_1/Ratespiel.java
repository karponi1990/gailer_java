import java.util.*;

public class Ratespiel {
    public static void main(String[] args) {
        
        Random random = new Random();
        int zahl = random.nextInt(10) + 1; 
        int versuch = 1;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ich denke an eine Zahl von 1 bis 10.");
        System.out.println("Sie haben 3 Versuche diese Zahl zu erraten.");
        System.out.println("Raten Sie!");
        
        while (versuch <= 3) { 
            System.out.println("Versuch: " + versuch);
            int eingabe = scan.nextInt();
            if (eingabe == zahl) { 
                System.out.println("RICHTIG!");
                System.out.println("Sie haben das Spiel gewonnen.");
                scan.close();
                return; 
            } else {
                System.out.println("Falsch");
                versuch++;
            }
        }
        
        System.out.println("Die richtige Zahl war " + zahl + ".");
        System.out.println("Sie haben das Spiel verloren.");

        scan.close();
    }
}

