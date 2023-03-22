import java.util.Scanner;

class WhileStringLengthDots {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Geben Sie das erste Wort ein: ");
        String wortEins = scan.next();

        System.out.print("Geben Sie das zweite Wort ein: ");
        String wortZwei = scan.next();

        int punkteZahl = 30 - wortEins.length() - wortZwei.length();

        System.out.print(wortEins);

        int i = 1;

        while(i <= punkteZahl){
            System.out.print(".");
            i++;
        }

        System.out.println(wortZwei);
        scan.close();
    }
}
