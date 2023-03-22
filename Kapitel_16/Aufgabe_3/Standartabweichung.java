import java.util.Scanner;

class Standartabweichung {
    public static void main(String[] args) {

        //Erstellt von ChatGPT und angepasst;

        Scanner scan = new Scanner(System.in);

        System.out.print("Anzahl der Zahlen: ");
        int n = scan.nextInt();
    
        double sum = 0.0;
        double sumOfSquares = 0.0;

        int i = 1;

        while (i <= n) {
            System.out.print("Gleitpunktzahl " + i + ": ");
            double x = scan.nextDouble();
            sum = sum + x;
            sumOfSquares = sumOfSquares + x * x;

            i++;
        }
    
        double average = sum / n;
        double averageSquared = average * average;
        double averageOfSquares = sumOfSquares / n;
    
        double standardDeviation = Math.sqrt(averageOfSquares - averageSquared);
    
        System.out.println("Standardabweichung: " + standardDeviation);

        scan.close();
    }
}
