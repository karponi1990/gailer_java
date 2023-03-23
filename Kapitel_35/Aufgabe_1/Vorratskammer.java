class Vorratskammer {

    // Instanzvariablen
    private Marmelade glas1;
    private Marmelade glas2;
    private Marmelade glas3;
    private Marmelade glasAusgewaehlt;

    // Konstruktor
    public Vorratskammer(Marmelade glas1, Marmelade glas2, Marmelade glas3) {
        this.glas1 = glas1;
        this.glas2 = glas2;
        this.glas3 = glas3;
        glasAusgewaehlt = null;
    }

    // Methoden
    public void ausgeben() {
        System.out.print("1: ");
        glas1.ausgeben();
        System.out.print("2: ");
        glas2.ausgeben();
        System.out.print("3: ");
        glas3.ausgeben();
    }

    public void auswaehlen(int glasNummer) {
        if (glasNummer == 1)
            glasAusgewaehlt = glas1;

        else if (glasNummer == 2)
            glasAusgewaehlt = glas2;

        else
            glasAusgewaehlt = glas3;
    }

    // Auftragen der ausgewählten Marmelade
    public void auftragen(int gramm) {
        glasAusgewaehlt.auftragen(gramm);
    }
}
