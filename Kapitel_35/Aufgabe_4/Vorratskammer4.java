class Vorratskammer4 {
    
       // Instanzvariablen
       private Marmelade4  glas1;
       private Marmelade4  glas2;
       private Marmelade4  glas3;
       private Marmelade4  glasAusgewaehlt;
   
       // Konstruktor
       public Vorratskammer4( Marmelade4 glas1){
           this.glas1 = glas1;
           this.glas2 = null;
           this.glas3 = null;
           glasAusgewaehlt = null;
       }

       public Vorratskammer4( Marmelade4 glas1, Marmelade4 glas2){
           this.glas1 = glas1;
           this.glas2 = glas2;
           this.glas3 = null;
           glasAusgewaehlt = null;
       }

       public Vorratskammer4( Marmelade4 glas1, Marmelade4 glas2, Marmelade4 glas3 ){
           this.glas1 = glas1;
           this.glas2 = glas2;
           this.glas3 = glas3;
           glasAusgewaehlt = null;
       }


   
       // Methoden
       public void ausgeben(){

           if(glas1 != null){
               System.out.print("1: "); 
               glas1.ausgeben();
           }
           if(glas2 != null){
               System.out.print("2: "); 
               glas2.ausgeben();
           }
           if(glas3 != null){
               System.out.print("3: "); 
               glas3.ausgeben();
           }
       }

       public boolean auswaehlen( int glasNummer ){
           
           if (glasNummer == 1 && this.glas1 != null){
               glasAusgewaehlt = glas1; 
               return true;
           }
           if (glasNummer == 2 && this.glas2 != null){
               glasAusgewaehlt = glas2;
               return true;
           }
           if (glasNummer == 3 && this.glas3 != null){
               glasAusgewaehlt = glas3;
               return true;
           }
           return false;
       }
   
       public void ersetzen(Marmelade4 m, int slot){
        if (slot == 1){
            glas1 = m;
        }
        if (slot == 2){
            glas2 = m;
        }
        if (slot == 3){
            glas3 = m;
        }
       }

       public void gemischteFruechte(){
            if(glas1.istMenge() <= 2 && glas2.istMenge() <= 2 && glas3.istMenge() <= 2){
                int summeMenge = glas1.istMenge() + glas2.istMenge() + glas3.istMenge();
                Marmelade4 gemischteFruechteGlas = new Marmelade4( "Gemischte Fruechte", "19.01.11", summeMenge );
                ersetzen(gemischteFruechteGlas, 1);
                glas2 = null;
                glas3 = null;

                System.out.println("\nDie Vorratskammer enthaelt:\n");
                ausgeben();
                System.exit(0);
            }
       }


       // Auftragen der ausgewählten Marmelade
       public void auftragen(int gramm){
           glasAusgewaehlt.auftragen(gramm);
       }
}
