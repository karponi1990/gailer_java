class HalloObjekt {
  String mitteilung;

  HalloObjekt(String str) {
    mitteilung = str;
  }

  void sprich() {
    System.out.println(mitteilung);
  }
}

class HalloTester1 {
  public static void main(String[] args) {
    String text = "Hallo";

    HalloObjekt einObjekt = new HalloObjekt(text);

    for (int i = 0; i < text.length(); i++) {
      einObjekt.sprich();
    }
  }
}
