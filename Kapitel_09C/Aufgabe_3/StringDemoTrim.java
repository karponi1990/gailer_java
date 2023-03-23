class StringDemoTrim {
    public static void main(String[] args) {
        
        String erster = new String("    In einem Loch    in der Erde, da lebte ein Hobbit.   ");
        String zweiter;

        zweiter = erster.trim();
        System.out.println(erster);
        System.out.println(zweiter);

    }
}
