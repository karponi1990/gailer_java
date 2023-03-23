class Katze4 extends Haustiere4 {

    String haltung;

    Katze4(String name, double futtervorrat, int haltung, double gewicht) {

        super(name, futtervorrat, gewicht);
        switch (haltung) {
            case 1:
                this.haltung = "Wohnungskatze";
                break;
            case 2:
                this.haltung = "Artgerecht";
                break;
        }
    }

    public void friss() {

        futtervorrat -= 0.5;
    }
}
