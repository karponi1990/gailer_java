import java.util.Scanner;

class CharAt {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Geben Sie einen String ein: ");
        String eingabe = scan.nextLine();

        int strLaenge = eingabe.length();

        for(int i = 0; i < strLaenge; i++){

            System.out.println(eingabe.charAt(i));
        }
        
        scan.close();
    }
}
