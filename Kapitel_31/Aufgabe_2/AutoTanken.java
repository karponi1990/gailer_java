import java.util.Scanner;

class AutoTanken {

  double startMeilen;
  double endMeilen;
  double gallonen;

  boolean benzinschwein() {
    return berechneMPG() < 15.0;
  }

  boolean sparauto() {
    return berechneMPG() > 30.0;
  }

  AutoTanken(double startTacho) {
    startMeilen = startTacho;
  }

  double berechneMPG() {
    return (endMeilen - startMeilen) / gallonen;
  }

  void auftanken(double aktTacho, double gallonen) {
    startMeilen = endMeilen;
    endMeilen = aktTacho;
    this.gallonen = gallonen;
  }
}

class MeilenProGalloneTester2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double startTacho = 0.0;

    AutoTanken auto = new AutoTanken(startTacho);

    do {
      System.out.println("\n+++ Besuch der Tankstelle +++\n");

      System.out.println("alter Tachometerstand: " + auto.endMeilen + "\n");

      System.out.print("Aktuellen Tachometerstand eingeben: ");
      double aktTacho = scan.nextDouble();

      System.out.print("Anzahl der Gallonen fuer die Tankfuellung: ");
      double galls = scan.nextDouble();

      auto.auftanken(aktTacho, galls);

      System.out.println("\nMeilen pro Gallonen: " + auto.berechneMPG());

      if (auto.benzinschwein()) {
        System.out.println("Autotyp: Benzinschwein!");
      } else if (auto.sparauto()) {
        System.out.println("Autotyp: Sparauto");
      } else {
        System.out.println("Autotyp: Durchschnittsauto");
      }

      System.out.println("\nProgramm beenden <j>a <n>ein?");

    } while (!scan.next().equals("j"));

    scan.close();
  }
}
