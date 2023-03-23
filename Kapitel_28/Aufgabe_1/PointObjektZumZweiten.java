import java.awt.*;

class PointObjektZumZweiten {
    public static void main(String[] args) {

        Point pt1 = new Point(10, 10);
        Point pt2 = new Point(30, 30);

        int breite = Math.abs(pt2.x - pt1.x);
        int hoeche = Math.abs(pt2.y - pt1.y);

        int flaeche = breite * hoeche;

        System.out.println("Die Flaeche betraegt: " + flaeche);
    }
}
