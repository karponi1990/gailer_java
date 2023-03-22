// class StringDemo1 {
//     public static void main(String[] args) {
        
//         String str1 = "Hello World"; 

//         System.out.println(str1);
//     }
// }

class StringDemo1 {
    public static void main(String[] args) {
        
        String str1 = "OK. Cool!"; 
        String str2;

        System.out.println("str1: \t\t" + str1); 

        str2 = str1; 
        System.out.println("str2 = str1: \t" +str2); 
        
        str1 = "OK. Ciao!"; 
        System.out.println("str1 neu: \t" +str1); 
        System.out.println("str2 = str1: \t" +str2); 
    }
}