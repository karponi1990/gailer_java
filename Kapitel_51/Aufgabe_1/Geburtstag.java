class Geburtstag extends Karte{
    
    int alter;

    public Geburtstag(String e, int jahre, String a){

        super(e, a);

        alter = jahre;
    }

    public void gruss(){

        System.out.println(anrede + " " + empfaenger + ",\n");
        System.out.println("alles Gute zum " + alter + ". Geburtstag.\n\n");
    }
}
