class Trigonometrie {
    public static void main(String[] args) {
        
        double zahl = 0.5235;
        double sinx = Math.sin(zahl);
        double cosx = Math.cos(zahl);
        double ergebnis = sinx*sinx + cosx*cosx;

        System.out.println("Sinus:\t\t" + sinx);
        System.out.println("Cosinus:\t" + cosx);
        System.out.println("Ergebnis:\t" + ergebnis);
    }
}
