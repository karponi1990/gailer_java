// class StringDemo3 {
//     public static void main ( String[] args ){

//         String str = new String( "Alle in der ITT56 machen ihre Hausaufgaben" );
//         String sub = str.substring(8);
//         System.out.println(sub);
    
//         sub = str.substring(15);
//         System.out.println(sub);

//         sub = str.substring(24);
//         System.out.println(sub);
//     }  
// }

class StringDemo3 {
    public static void main ( String[] args ){

        String str = new String( "My little pen is broken" ); 

        System.out.println(str.length()); 

        String sub = str.substring(10, 16); 
        System.out.println(sub);

        //1.Wir geben beiden Parametern den gleichen Wert.
        sub = str.substring(10, 10); 
        System.out.println("1. : " + sub);

        //2.Wir geben dem ersten Parameter den Wert 0 und dem zweiten Parameter den Index des letzten Zeichens.
        sub = str.substring(0, 23); 
        System.out.println("2. : " + sub);

        //3.Anstatt wie oben das Literal 23 zu verwenden, verwenden wir str.length()-1
        sub = str.substring(0, str.length()-1); 
        System.out.println("3. : " + sub);

        //4.Was passiert, wenn wir str.length() als zweiten Parameter verwenden?
        sub = str.substring(0, str.length()); 
        System.out.println("4. : " + sub);

        //5.Was passiert, wenn wir einen größeren Wert als str.length() z.B. 29 als zweiten Parameter verwenden?
        // = Fehler
        // sub = str.substring(0, 29); 
        // System.out.println("5. : " + sub);

        //6.Wir geben dem ersten Parameter einen negativen Wert.
        //  = Fehler
        // sub = str.substring(-5, 23); 
        // System.out.println("6. : " + sub);

        //7.Wir geben dem zweiten Parameter einen Wert der größer ist als 23.
        //  = Fehler
        // sub = str.substring(0, 29); 
        // System.out.println("7. : " + sub);

        //8.Wir kehren die Reihenfolge der Parameter um.
        //  = Fehler
        // sub = str.substring(23, 0); 
        // System.out.println("8. : " + sub);
    }  
}