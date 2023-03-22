class Hund2 extends Haustiere2{
    
    String kategorie;

    Hund2(String name, double futtervorrat, int kategorie){

        super(name, futtervorrat);

        switch(kategorie){
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

    public void sprich(){

        System.out.println("Wuff!");
    }

    public void friss(){

        System.out.println(name + ": " + futtervorrat);
        futtervorrat -= 1.0;
    }

    public void anzeigen(){
        System.out.println("(Kategorie: " + this.kategorie + ") Der Vorrat fuer " + name + " reicht " + anzahlTage + " Tage.\n");
    }
}
