class HalloObjektGrussWort {

    String morgenGruss, abendGruss;

    HalloObjektGrussWort( String morgenGruss, String  abendGruss){
      this.morgenGruss = morgenGruss;
      this.abendGruss = abendGruss;
    }
  
    void grussMorgens(){
      System.out.println( morgenGruss );
    }

    void grussAbends(){
        System.out.println( abendGruss );
      }
}

class HalloTester2{
    public static void main ( String[] args )
    {
        HalloObjektGrussWort Gruss = new HalloObjektGrussWort("Guten Morgen Welt!", "Guten Abend Welt!");

        Gruss.grussMorgens();
        Gruss.grussAbends();
    }
}
