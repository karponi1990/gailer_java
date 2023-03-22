class VorratskammerTester2 {
    
    public static void main ( String[] args ){

        Marmelade2 stachelbeer = new Marmelade2( "Stachelbeer", "04.07.09", 12 );
        Marmelade2 erdbeer     = new Marmelade2( "Erdbeer", "31.09.10", 8 );
    
        Vorratskammer2 vorrat = new Vorratskammer2( stachelbeer, erdbeer );
        vorrat.ausgeben();


        if (vorrat.auswaehlen(1)){
            vorrat.auftragen(2);
        }else{
            System.out.println("\nAuswahl nicht verfuegbar\n");
        }
          
        vorrat.ausgeben();
    
        if (vorrat.auswaehlen(3)){
            vorrat.auftragen(2);
        }else{
            System.out.println("\nAuswahl nicht verfuegbar\n");
        }

        vorrat.ausgeben();
    


        // int auswahl = 0;
        // int menge;
    
        // Scanner scan = new Scanner(System.in);
    
        // System.out.println("\n\nWillkommen zu Mutter Hubbard Vorratskammer!");
    
        // Marmelade2 stachelbeer = new Marmelade2( "Stachelbeer", "04.07.09", 12 );
        // Marmelade2 erdbeer     = new Marmelade2( "Erdbeer", "30.09.10", 8 );
        // Marmelade2 aprikosen   = new Marmelade2( "Aprikosen", "31.10.10", 16 );
    
        // Vorratskammer2 vorrat = new Vorratskammer2(stachelbeer, erdbeer, aprikosen);
    
        // while(true){
        //     System.out.println("\nDie Vorratskammer enthaelt:\n");
        //     vorrat.ausgeben();
    
        //     System.out.print("Treffen Sie Ihre Auswahl (1,2 oder 3). Exit -1: ");
        //     auswahl = scan.nextInt();
    
        //     while(auswahl != -1 && auswahl != 1 && auswahl != 2 && auswahl != 3){
        //         System.out.print("FALSCHE AUSWAHL. Treffen Sie Ihre Auswahl (1,2 oder 3). Exit -1: ");
        //         auswahl = scan.nextInt();
        //     }
    
        //     if(auswahl == -1){
        //         scan.close();
        //         System.out.print("Good-Bye");
        //         return;
        //     }
    
        //     System.out.print("Geben Sie die Menge ein, die aufgetragen werden soll: ");
        //     menge = scan.nextInt();
    
        //     vorrat.auswaehlen(auswahl);
        //     vorrat.auftragen(menge);
    
        // }
      }
}
