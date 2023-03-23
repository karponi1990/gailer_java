class Vorratskammer2 {

    // Instanzvariablen
    private Marmelade2 glas1;
    private Marmelade2 glas2;
    private Marmelade2 glas3;
    private Marmelade2 glasAusgewaehlt;

    // Konstruktor
    public Vorratskammer2(Marmelade2 glas1) {
        this.glas1 = glas1;
        this.glas2 = null;
        this.glas3 = null;
        glasAusgewaehlt = null;
    }

    public Vorratskammer2(Marmelade2 glas1, Marmelade2 glas2) {
        this.glas1 = glas1;
        this.glas2 = glas2;
        this.glas3 = null;
        glasAusgewaehlt = null;
    }

    public Vorratskammer2(Marmelade2 glas1, Marmelade2 glas2, Marmelade2 glas3) {
        this.glas1 = glas1;
        this.glas2 = glas2;
        this.glas3 = glas3;
        glasAusgewaehlt = null;
    }

    // Methoden
    public void ausgeben() {

        if (glas1 != null) {
            System.out.print("1: ");
            glas1.ausgeben();
        }
        if (glas2 != null) {
            System.out.print("2: ");
            glas2.ausgeben();
        }
        if (glas3 != null) {
            System.out.print("3: ");
            glas3.ausgeben();
        }
    }

    // wir setzen voraus, dass der Anwender eine richtige Auswahl trifft, 1, 2, oder
    // 3
    public boolean auswaehlen(int glasNummer) {

        if (glasNummer == 1 && this.glas1 != null) {
            glasAusgewaehlt = glas1;
            return true;
        }
        if (glasNummer == 2 && this.glas2 != null) {
            glasAusgewaehlt = glas2;
            return true;
        }
        if (glasNummer == 3 && this.glas3 != null) {
            glasAusgewaehlt = glas3;
            return true;
        }
        return false;
    }

    // Auftragen der ausgewählten Marmelade
    public void auftragen(int gramm) {
        glasAusgewaehlt.auftragen(gramm);
    }
}
