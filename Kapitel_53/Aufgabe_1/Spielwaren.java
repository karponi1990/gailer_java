class Spielwaren extends Waren implements Besteuerbar{
    
    int mindestalter;

    Spielwaren(String beschreibung, double preis, int mindestalter, int anzahl){

        super(beschreibung, preis, anzahl);
        this.mindestalter = mindestalter;
    }

    void anzeigen(){

        super.anzeigen();
        System.out.println("Mindestalter: " + mindestalter);
    }

    public double berechneSteuer(){

        return getPreis() * STEUERSATZ;
    }
}
