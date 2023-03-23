public class PlaetchenVerzierung {

    String sorte;
    String groesse;
    String form;
    boolean verzierung = false;

    public void ausgeben() {

        String istVerziert = new String();

        if (verzierung) {
            istVerziert = "ja";
        } else {
            istVerziert = "nein";
        }

        System.out
                .println("Sorte " + sorte + ", Groesse " + groesse + ", Form " + form + ", Verzierung " + istVerziert);
    }

    public static void main(String[] args) {

        System.out.println("\n+++ Plaetzchenliste +++\n");

        PlaetchenVerzierung plaetzchen1 = new PlaetchenVerzierung();
        PlaetchenVerzierung plaetzchen2 = new PlaetchenVerzierung();
        PlaetchenVerzierung plaetzchen3 = new PlaetchenVerzierung();

        plaetzchen1.sorte = "Kokos";
        plaetzchen1.groesse = "mittel";
        plaetzchen1.form = "rund";

        plaetzchen2.sorte = "Affennuss";
        plaetzchen2.groesse = "klein";
        plaetzchen2.form = "rund";

        plaetzchen3.sorte = "Honigkuchen";
        plaetzchen3.groesse = "gross";
        plaetzchen3.form = "rechteckig";
        plaetzchen3.verzierung = true;

        plaetzchen1.ausgeben();
        plaetzchen2.ausgeben();
        plaetzchen3.ausgeben();
    }
}
