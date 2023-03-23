class Sonderposten extends Artikel2 {

    private double rabatt;

    public Sonderposten(String artikelNr, String bezeichnung, double einkaufspreis, int lagerzeit) {

        super(artikelNr, bezeichnung, einkaufspreis, lagerzeit);

        if (lagerzeit > 12) {
            this.rabatt = 0.3;
        } else {
            this.rabatt = 0.1;
        }
    }

    public void anzeigen() {

        super.anzeigen();
        System.out.printf("(VK <alt>: " + berechneVerkaufspreis() + " Euro Rabatt: " + rabatt * 100 + ")\n");

    }

    public double berechneVerkaufspreis() {

        double preis = super.berechneVerkaufspreis();
        double rabattBetrag = preis * rabatt;
        double neuerPreis = preis - rabattBetrag;

        return neuerPreis;
    }
}
