import java.util.Scanner;

class Y2KProblemDetektor {
    public static void main(String[] args) {
        
        int alter;

        Scanner scan = new Scanner(System.in);

        System.out.print("Geburtsjahr: ");
        int gebjahr = scan.nextInt();

        System.out.print("Aktuelles Jahr: ");
        int aktjahr = scan.nextInt();

        if(aktjahr < gebjahr){
            alter = (aktjahr + 100) - gebjahr;
        }else{
            alter = aktjahr - gebjahr;
        }

        System.out.print("Ihr alter ist: " + alter);

        scan.close();
    }
}
