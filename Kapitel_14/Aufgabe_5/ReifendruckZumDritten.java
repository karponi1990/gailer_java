import java.util.Scanner;

class ReifendruckZumDritten {
    public static void main(String[] args) {

        boolean druckOK = true;

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Reifendruck rechter Vorderreifen: ");
        double druckVorneRechts = scan.nextDouble();

        if(druckVorneRechts < 35 || druckVorneRechts > 45){
            System.out.println("Warnung! Der Reifendruck ist außerhalb des erlaubten Bereichs");
            druckOK = false;
        }
        
        System.out.print("Reifendruck linker Vorderreifen: ");
        double druckVorneLinks = scan.nextDouble();
        
        if(druckVorneLinks < 35 || druckVorneLinks > 45){
            System.out.println("Warnung! Der Reifendruck ist außerhalb des erlaubten Bereichs");
            druckOK = false;
        }

        System.out.print("Reifendruck rechter Hinterreifen: ");
        double druckHintenRechts = scan.nextDouble();
        
        if(druckHintenRechts < 35 || druckHintenRechts > 45){
            System.out.println("Warnung! Der Reifendruck ist außerhalb des erlaubten Bereichs");
            druckOK = false;
        }

        System.out.print("Reifendruck linker Hinterreifen: ");
        double druckHintenLinks = scan.nextDouble();
        
        if(druckHintenLinks < 35 || druckHintenLinks > 45){
            System.out.println("Warnung! Der Reifendruck ist außerhalb des erlaubten Bereichs");
            druckOK = false;
        }

        double druckUnterschiedVorne = Math.abs(druckVorneRechts - druckVorneLinks);
        double druckUnterschiedHinten = Math.abs(druckHintenRechts - druckHintenLinks);
        
        if (druckUnterschiedVorne > 3) {
            System.out.println("Warnung: Der Reifendruck der Vorderreifen unterscheidet sich um mehr als 3 psi");
            druckOK = false;
        }
        
        if (druckUnterschiedHinten > 3) {
            System.out.println("Warnung: Der Reifendruck der Hinterräder unterscheidet sich um mehr als 3 psi");
            druckOK = false;
        }


        if (druckOK) {
            System.out.print("Reifendruck ist OK");
        } else {
            System.out.print("Reifendruck ist nicht OK");
        }

        scan.close();
    }
}
