class Kaufhaus {
    public static void main(String[] args) {

        Waren waren = new Waren("Tube", 1.40, 5);
        Lebensmittel lebensmittel = new Lebensmittel("Milch", 0.95, 690, 10);
        Spielwaren spiel = new Spielwaren("Lego", 24.45, 8, 8);
        Buecher buech = new Buecher("Emma", 14.95, "Austin", 9);

        waren.anzeigen();
        lebensmittel.anzeigen();

        spiel.anzeigen();
        System.out.println("Die Steuer betraegt: " + spiel.berechneSteuer());

        buech.anzeigen();
        System.out.println("Die Steuer betraegt: " + buech.berechneSteuer());

        spiel.setPreis(19.99);
        spiel.setAnzahl(2);
        buech.setPreis(9.99);
        buech.setAnzahl(2);

        spiel.anzeigen();
        buech.anzeigen();



    }
}
