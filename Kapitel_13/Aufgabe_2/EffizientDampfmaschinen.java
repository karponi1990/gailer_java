import java.util.Scanner;

class EffizientDampfmaschinen {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Geben Sie die Lufttemperatur ein: ");
        double lufttemp = scan.nextDouble();

        System.out.print("Geben Sie die Lufttemperatur ein: ");
        double dampftemp = scan.nextDouble();

        scan.close();

        double effizienz;

        if(dampftemp < 373.0){
            effizienz = 0;
        }else{
            effizienz = 1 - lufttemp / dampftemp;
        }

        System.out.print("Die Effizienz betraegt: " + effizienz);
    }
}
