class TrigonometrieBogenm {
    public static void main(String[] args) {
        
        double grad = 30;

        double bogenmass = grad * Math.PI/180;

        double sinx = Math.sin(bogenmass);
        double cosx = Math.cos(bogenmass);
        double ergebnis = sinx*sinx + cosx*cosx;

        System.out.println("Sinus:\t\t" + sinx);
        System.out.println("Cosinus:\t" + cosx);
        System.out.println("Ergebnis:\t" + ergebnis);
    }
}
