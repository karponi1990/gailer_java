class Hund3 extends Haustiere3{
    
    String kategorie;

    Hund3(String name, double futtervorrat, int kategorie){

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

        System.out.print(futtervorrat + " ");

        if(kategorie.equals("Kleinhunde")){
            futtervorrat -= 1.0;
        }else if(kategorie.equals("Mittelgrosse Hunde")){
            futtervorrat -= 1.5;
        }else{
            futtervorrat -= 2.0;
        }
        
    }

    public void anzeigen(){
        System.out.println("\n(Kategorie: " + this.kategorie + ") Der Vorrat fuer " + name + " reicht " + anzahlTage + " Tage.\n");
    }
}
