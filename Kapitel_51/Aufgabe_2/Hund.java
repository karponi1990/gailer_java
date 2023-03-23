class Hund extends Haustiere {

    Hund(String name, double futtervorrat) {

        super(name, futtervorrat);
    }

    public void sprich() {

        System.out.println("Wuff!");
    }

    public void friss() {

        System.out.println(name + ": " + futtervorrat);
        futtervorrat -= 1.0;
    }
}
