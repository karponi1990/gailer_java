class Lebensmittel extends Waren{

    double kalorienen;

    Lebensmittel(String beschreibung, double preis, double kalorienen, int anzahl){

        super(beschreibung, preis, anzahl);
        this.kalorienen = kalorienen;
    }

    void anzeigen(){

        super.anzeigen();
        System.out.println("Kalorien: " + kalorienen);
    }
}
