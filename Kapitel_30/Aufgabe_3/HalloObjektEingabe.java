import java.util.Scanner;

//#region Eingabe Variante 1

class HalloObjektEingabe {

    String mitteilung;

    HalloObjektEingabe(String str) {
        mitteilung = str;
    }

    void sprich() {
        System.out.println(mitteilung);
    }
}

class HalloTester3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Geben Sie eine Mitteilung ein: ");
        String eingabe = scan.nextLine();

        HalloObjektEingabe einObjekt = new HalloObjektEingabe(eingabe);

        einObjekt.sprich();

        scan.close();
    }
}

// #endregion

// #region Eingabe Variante 2
// class HalloObjektEingabe {

// String mitteilung;

// HalloObjektEingabe(){

// Scanner scan = new Scanner(System.in);
// System.out.println("Geben Sie eine Mitteilung ein: ");
// String eingabe = scan.nextLine();

// mitteilung = eingabe;

// scan.close();
// }

// void sprich(){
// System.out.println( mitteilung );
// }
// }

// class HalloTester3{
// public static void main ( String[] args )
// {
// HalloObjektEingabe einObjekt = new HalloObjektEingabe();
// einObjekt.sprich();
// }
// }
// #endregion