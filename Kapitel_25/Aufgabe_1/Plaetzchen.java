class Plaetzchen {
    
    String sorte;
    String groesse;
    String form;

    public void ausgeben(){

        System.out.println("Sorte " + sorte + ", Groesse " + groesse + ", Form " + form);
    }

    public static void main(String[] args) {
        
        System.out.println("\n+++ Plaetzchenliste +++\n");

        Plaetzchen plaetzchen = new Plaetzchen();

        plaetzchen.sorte = "Kokos";
        plaetzchen.groesse = "mittel";
        plaetzchen.form = "rund";
        plaetzchen.ausgeben();

        plaetzchen.sorte = "Affennuss";
        plaetzchen.groesse = "klein";
        plaetzchen.form = "rund";
        plaetzchen.ausgeben();

        plaetzchen.sorte = "Honigkuchen";
        plaetzchen.groesse = "gross";
        plaetzchen.form = "rechteckig";
        plaetzchen.ausgeben();
    }
}
