abstract class Haustiere4 implements Comparable<Haustiere4> {

    String name;
    double futtervorrat;
    int anzahlTage;
    private double gewicht;

    Haustiere4(String name, double futtervorrat, double gewicht) {

        this.name = name;
        this.futtervorrat = futtervorrat;
        this.gewicht = gewicht;
    }

    public void fuettern() {

        while (futtervorrat > 0.0) {

            friss();
            anzahlTage++;
        }

        anzeigen();
    }

    public int compareTo(Haustiere4 obj) {

        return Double.compare(this.gewicht, obj.gewicht);
        // return String.CASE_INSENSITIVE_ORDER.compare(this.name, obj.name);
    }

    public void anzeigen() {

        System.out.println("[Gewicht\t" + gewicht + "] Der Vorrat fuer " + name + " reicht " + anzahlTage + " Tage.");
    };

    public abstract void friss();

}
