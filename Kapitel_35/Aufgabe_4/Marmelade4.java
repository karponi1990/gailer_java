class Marmelade4 {
    
    private String inhalt;   // Art der Frucht im Glas
    private String datum;   // Datum des Abfüllens
    private int menge;       // Menge der Marmelade im Glas
  
  
    // Konstruktor
    public Marmelade4( String inhalt, String datum, int menge ){
      this.inhalt = inhalt;
      this.datum  = datum;
      this.menge  = menge;
    }

    // Methoden
    public boolean istLeer(){
      return ( menge == 0 );
    }

    public int istMenge(){
        return menge;
    }
  
    public void ausgeben(){
      System.out.println ( inhalt + "   " +  datum + "   " +  menge + " Gramm." );
    }
  
    public void auftragen ( int gramm){
      if ( !istLeer() ){
        if ( gramm <= menge ){
          System.out.println("\nAuftragen von " + gramm + " Gramm " + inhalt + "\n");
          menge = menge - gramm;
        }
        else{
          System.out.println("\nAuftragen von  " + menge + " Gramm " + inhalt + "\n");
          menge =  0;
        }
       }
       else
         System.out.println("\nKeine Marmelade im Glas!");
    }
}
