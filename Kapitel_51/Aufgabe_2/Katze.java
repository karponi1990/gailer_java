class Katze extends Haustiere{
    
    Katze(String name, double futtervorrat){

        super(name, futtervorrat);
    }

    public void sprich(){

        System.out.println("Miau!");
    }

    public void friss(){

        System.out.println(name + ": " + futtervorrat);
        futtervorrat -= 0.5;
    }
}
