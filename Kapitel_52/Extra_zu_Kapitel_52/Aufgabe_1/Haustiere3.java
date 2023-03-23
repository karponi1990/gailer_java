abstract class Haustiere3 {

    String name;
    double futtervorrat;
    int anzahlTage;

    Haustiere3(String name, double futtervorrat) {

        this.name = name;
        this.futtervorrat = futtervorrat;
    }

    public void fuettern() {

        sprich();

        while (futtervorrat > 0.0) {

            friss();
            anzahlTage++;
        }

        anzeigen();
    }

    abstract public void anzeigen();

    public abstract void sprich();

    public abstract void friss();
}
