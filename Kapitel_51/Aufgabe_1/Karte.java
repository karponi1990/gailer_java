abstract class Karte {

    String empfaenger;
    String anrede;

    Karte(String empfaenger, String anrede) {

        this.empfaenger = empfaenger;
        this.anrede = anrede;
    }

    public abstract void gruss();
}
