class Feiertag extends Karte {

  public Feiertag(String e, String a) {
    super(e, a);
  }

  public void gruss() {
    System.out.println(anrede + " " + empfaenger + ",\n");
    System.out.println("frohe Feiertage!\n\n");
  }
}
