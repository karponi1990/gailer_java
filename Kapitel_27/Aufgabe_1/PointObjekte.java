import java.util.Scanner;
import java.awt.*;

class PointObjekte {
    public static void main(String[] args) {
        
        int x1, x2, y1, y2;
        Point aPoint, bPoint;

        Scanner scan = new Scanner(System.in);

        System.out.print("Wert x1: ");
        x1 = scan.nextInt();
        System.out.print("Wert x2: ");
        x2 = scan.nextInt();
        System.out.print("Wert y1: ");
        y1 = scan.nextInt();
        System.out.print("Wert y2: ");
        y2 = scan.nextInt();

        aPoint = new Point(x1,y1);
        bPoint = new Point(x2,y2);

        String aP = aPoint.toString();
        String bP = bPoint.toString();

        System.out.println(aP);
        System.out.println(bP);

        scan.close();
    }
}
