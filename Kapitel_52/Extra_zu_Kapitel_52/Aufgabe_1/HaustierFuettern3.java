class HaustierFuettern3 {

    public static void main(String[] args) {

        Haustiere3[] haustier = new Haustiere3[5];

        haustier[0] = new Katze3("Minka", 1.0, 1);
        haustier[1] = new Hund3("Rambo", 9.0, 3);
        haustier[2] = new Hund3("Isi", 4.0, 2);
        haustier[3] = new Katze3("Morle", 1.5, 2);
        haustier[4] = new Hund3("Strolchie", 3.0, 1);

        for (Haustiere3 tier : haustier) {
            tier.fuettern();
        }
    }
}
