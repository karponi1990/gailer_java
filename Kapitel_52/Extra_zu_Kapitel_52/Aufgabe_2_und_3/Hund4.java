class Hund4 extends Haustiere4 {

    String kategorie;

    Hund4(String name, double futtervorrat, int kategorie, double gewicht) {

        super(name, futtervorrat, gewicht);

        switch (kategorie) {
            case 1:
                this.kategorie = "Kleinhunde";
                break;
            case 2:
                this.kategorie = "Mittelgrosse Hunde";
                break;
            case 3:
                this.kategorie = "Große Hunde";
                break;
        }
    }

    public void friss() {

        if (kategorie.equals("Kleinhunde")) {
            futtervorrat -= 1.0;
        } else if (kategorie.equals("Mittelgrosse Hunde")) {
            futtervorrat -= 1.5;
        } else {
            futtervorrat -= 2.0;
        }

    }
}
