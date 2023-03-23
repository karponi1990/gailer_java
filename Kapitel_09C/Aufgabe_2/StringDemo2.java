class StringDemo2 {
    public static void main ( String[] args ){

      String str;
      int    len;
  
      str = new String( "Felix mag Bier" );
      len = str.length();
      System.out.println("Die Laenge ist: " + len );
  
      str = new String( "Felix mag Bier sehr gerne!!!!" );
      len = str.length();
      System.out.println("Die Laenge ist: " + len );

      str = new String( "Felix mag Bier     " );
      len = str.length();
      System.out.println("Die Laenge ist: " + len );

      str = new String( "Felix mag Bier              " );
      len = str.length();
      System.out.println("Die Laenge ist: " + len );

      str = new String( "Felix mag Bier!§$%%&//(()=" );
      len = str.length();
      System.out.println("Die Laenge ist: " + len );
    }
}
