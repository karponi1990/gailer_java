import java.util.Scanner;

class Auto {
  double startMeilen;
  double endMeilen;
  double gallonen;

  boolean benzinschwein() {
    return berechneMPG() < 15.0;
  }

  boolean sparauto() {
    return berechneMPG() > 30.0;
  }

  Auto(double startTacho, double endTacho, double galls) {
    startMeilen = startTacho;
    endMeilen = endTacho;
    gallonen = galls;
  }

  double berechneMPG() {
    return (endMeilen - startMeilen) / gallonen;
  }

}

class MeilenProGalloneTester1 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Geben Sie den Anfangsmeilenstand ein:");
    double startTacho = scan.nextDouble();

    System.out.println("Geben Sie den Endmeilenstand ein:");
    double endTacho = scan.nextDouble();

    System.out.println("Geben Sie die Gallonen ein:");
    double galls = scan.nextDouble();

    Auto auto = new Auto(startTacho, endTacho, galls);

    System.out.println("Meilen pro Gallonen: " + auto.berechneMPG());

    if (auto.benzinschwein()) {
      System.out.println("Benzinschwein!");
    } else if (auto.sparauto()) {
      System.out.println("Sparauto!");
    } else {
      System.out.println("Durchschnittsauto!");
    }

    scan.close();
  }
}
