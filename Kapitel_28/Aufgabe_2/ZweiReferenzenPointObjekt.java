import java.awt.*;

class ZweiReferenzenPointObjekt {
    public static void main(String[] args) {

        Point pt1 = new Point(10, 10);
        Point ptAlias = pt1;

        if (pt1 == ptAlias) {
            System.out.println("pt1 und ptAlias verweisen auf das selbe Objekt!\n");
        }

        System.out.println("Point pt1 vorher: \t" + pt1.toString());
        System.out.println("Point ptAlias vorher: \t" + ptAlias.toString());

        ptAlias.x = ptAlias.x * 2;
        ptAlias.y = ptAlias.y * 2;

        System.out.println("\nNur von ptAlias wurden die x- und y-Werte verdoppelt\n");

        System.out.println("Point pt1 vorher: \t" + pt1.toString());
        System.out.println("Point ptAlias vorher: \t" + ptAlias.toString());
    }
}
