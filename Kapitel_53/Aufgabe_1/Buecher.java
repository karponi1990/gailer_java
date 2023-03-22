class Buecher extends Waren implements Besteuerbar{

    String autor;

    Buecher(String beschreibung, double preis, String autor, int anzahl){

        super(beschreibung, preis, anzahl);
        this.autor = autor;
    }

    void anzeigen(){

        super.anzeigen();
        System.out.println("Autor: " + autor);
    }

    public double berechneSteuer(){

        return getPreis() * STEUERSATZ;
    }
}
