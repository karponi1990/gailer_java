public class KarteTester {
    public static void main(String[] args) {
        Karte feiern = new Feiertag("Ann", "Liebe");
        feiern.gruss();

        Karte geb = new Geburtstag("Bob", 55, "Lieber");
        geb.gruss();

        Karte val = new Valentin("Joan", 20, "Liebe");
        val.gruss();
    }
}
