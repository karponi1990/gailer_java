import java.util.Arrays;

class HaustierFuettern4{
    
    public static void main(String[] args) {
        
        Haustiere4[] haustier = new Haustiere4[5];

        haustier[0] = new Katze4("Minka", 1.0, 1, 3.5);
        haustier[1] = new Hund4("Rambo", 9.0, 3, 75.0);
        haustier[2] = new Hund4("Isi", 4.0, 2, 25.5);
        haustier[3] = new Katze4("Morle", 1.5, 2, 4.0);
        haustier[4] = new Hund4("Strolchie", 3.0, 1, 6.5);

        Arrays.sort(haustier);

        for(Haustiere4 tier : haustier){
        
            tier.fuettern();
        }    
    }
}
