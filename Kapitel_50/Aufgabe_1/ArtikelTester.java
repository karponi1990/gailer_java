public class ArtikelTester{
  public static void main(String args[]){
    
    Artikel artikelA = new Artikel("SC123-F", "DUFFY MALT WHISKEY", 10.0, 3);
    Artikel artikelB = new Artikel("SC347-A", "GLEN MORANGIE MALT WHISKEY", 55.0, 15);
    artikelA.anzeigen();
    artikelB.anzeigen();
  }
}