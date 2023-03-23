class UnveraenderbareBoxTester {

    public static void main(String[] args) {

        UnveraenderbareBox box = new UnveraenderbareBox(2.5, 5.0, 6.0);

        System.out.println("Flaeche: " + box.berechneOberflaeche() + " Volumen: " + box.berechneVolumen());

        // System.out.println( "Laenge: " + box._laenge + " Hoehe: " + box._hoehe +
        // "Breite: " + box._breite ) ;
        System.out.println("Laenge: " + box.getLaenge() + " Hoehe: " + box.getHoehe() + " Breite: " + box.getBreite());

    }
}
