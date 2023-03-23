class Valentin extends Karte {
  int kuesse;

  public Valentin(String e, int k, String a) {

    super(e, a);
    kuesse = k;
  }

  public void gruss() {

    System.out.println(anrede + " " + empfaenger + ",\n");
    System.out.println("herzliche Gruesse und Kuesse,\n");

    for (int j = 0; j < kuesse; j++) {
      System.out.print("X");
    }

  }
}
