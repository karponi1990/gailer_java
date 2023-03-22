import java.util.Scanner;

class KeilVonSternen {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Anfangszahl der Sterne: ");
        int n = scan.nextInt();

        int i = 1;

        while (i <= n) {
            int j = i;
            while (j <= n) {

                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        scan.close();
    }
}
