public class ArtikelTester2 {
  public static void main(String args[]) {

    Artikel2 artikelA = new Artikel2("SC123-F", "DUFFY MALT WHISKEY", 10.0, 3);
    Sonderposten artikelB = new Sonderposten("SC347-A", "GLEN MORANGIE MALT WHISKEY", 55.0, 15);
    artikelA.anzeigen();
    artikelB.anzeigen();
  }
}
