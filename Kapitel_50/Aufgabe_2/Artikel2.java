class Artikel2 {

    final double HANDELSSPANNE = 0.6;
    final double MWST = 0.19;

    private String artikelNr;
    private String bezeichnung;
    private double einkaufspreis;
    private int lagerzeit;


    public Artikel2(String artikelNr, String bezeichnung, double einkaufspreis, int lagerzeit) {

        this.artikelNr = artikelNr;
        this.bezeichnung = bezeichnung;
        this.einkaufspreis = einkaufspreis;
        this.lagerzeit = lagerzeit;
    }

    public double berechneVerkaufspreis() {

        double verkaufspreis = einkaufspreis * (1 + HANDELSSPANNE) * (1 + MWST);
        return verkaufspreis;
    }

    public void anzeigen(){

        System.out.println(artikelNr + " '" + bezeichnung + "' EK: " + einkaufspreis + " VK: " + berechneVerkaufspreis() + " EURO Lagerzeit: " + lagerzeit);
    }
}
