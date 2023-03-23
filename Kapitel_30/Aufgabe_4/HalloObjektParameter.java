import java.util.Scanner;

class HalloObjektParameter {

    String mitteilung;

    HalloObjektParameter(String str) {
        mitteilung = str;
    }

    HalloObjektParameter(HalloObjektParameter einHalloObjekt) {
        mitteilung = new String(einHalloObjekt.mitteilung);
    }

    void sprich() {
        System.out.println(mitteilung);
    }
}

class HalloTester4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Geben Sie eine Mitteilung ein: ");
        String eingabe = scan.nextLine();

        HalloObjektParameter einObjekt = new HalloObjektParameter(eingabe);

        HalloObjektParameter obj = new HalloObjektParameter(einObjekt);

        System.out.println("(einObjekt.mitteilung == obj.mitteilung) = " + (einObjekt.mitteilung == obj.mitteilung));

        obj.sprich();
        einObjekt.sprich();

        scan.close();
    }
}
