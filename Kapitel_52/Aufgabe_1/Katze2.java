class Katze2 extends Haustiere2{
    
    String haltung;

    Katze2(String name, double futtervorrat, int haltung){

        super(name, futtervorrat);

        switch(haltung){
            case 1:
                this.haltung = "Wohnung";
                break;
            case 2:
                this.haltung = "Artgerecht";
                break;
        }
    }

    public void sprich(){

        System.out.println("Miau!");
    }

    public void friss(){

        System.out.println(name + ": " + futtervorrat);
        futtervorrat -= 0.5;
    }

    public void anzeigen(){
        System.out.println("(Haltung: " + haltung + ") Der Vorrat fuer " + name + " reicht " + anzahlTage + " Tage.\n");
    }
}
