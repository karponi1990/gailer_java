class Waren {

    private String beschreibung;
    private double preis;
    private int anzahl;

    Waren(String beschreibung, double preis, int anzahl) {

        this.beschreibung = beschreibung;
        this.preis = preis;
        this.anzahl = anzahl;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    void anzeigen() {

        System.out.println("Artikel: " + beschreibung + " Preis: " + preis + " Anzahl: " + anzahl);
    }
}
