abstract class Haustiere {
    
    String name;
    double futtervorrat;
    int anzahlTage;

    Haustiere(String name, double futtervorrat){

        this.name = name;
        this.futtervorrat = futtervorrat;
    }

    public void fuettern(){

        sprich();

        while(futtervorrat > 0.0){

            friss();
            anzahlTage++;
        }

        anzeigen();
    }

    public void anzeigen(){

        System.out.println("Der Vorrat fuer " + name + " reicht " + anzahlTage + " Tage.\n");
    }

    public abstract void sprich();
    public abstract void friss();
}
