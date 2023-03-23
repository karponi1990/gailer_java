class Katze3 extends Haustiere3 {

    String haltung;

    Katze3(String name, double futtervorrat, int haltung) {

        super(name, futtervorrat);

        switch (haltung) {
            case 1:
                this.haltung = "Wohnungskatze";
                break;
            case 2:
                this.haltung = "Artgerecht";
                break;
        }
    }

    public void sprich() {

        System.out.println("Miau!");
    }

    public void friss() {

        System.out.print(futtervorrat + " ");
        futtervorrat -= 0.5;
    }

    public void anzeigen() {
        System.out
                .println("\n(Haltung: " + haltung + ") Der Vorrat fuer " + name + " reicht " + anzahlTage + " Tage.\n");
    }
}
