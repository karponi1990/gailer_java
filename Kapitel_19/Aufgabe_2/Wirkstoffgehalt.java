class Wirkstoffgehalt {
    public static void main(String[] args) {
        
        double wirkstoffgehalt = 100.0;
        int monat = 0;

        final double WIRKSTOFFVERLUST = 4.0;


        while (wirkstoffgehalt > 50.0) {

            System.out.println("Monat: " + monat + "\tWirkstoffgehalt: " + wirkstoffgehalt);

            wirkstoffgehalt = wirkstoffgehalt - (wirkstoffgehalt / 100 * WIRKSTOFFVERLUST);
            monat++; 
        }

        System.out.println("Monat: " + monat + "\tWirkstoffgehalt: " + wirkstoffgehalt + "\tAbgelaufen!");
    }
}
