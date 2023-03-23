class VorratskammerTester3 {
    public static void main(String[] args) {

        Marmelade3 stachelbeer = new Marmelade3("Stachelbeer", "04.07.09", 12);
        Marmelade3 erdbeer = new Marmelade3("Erdbeer", "31.09.10", 8);
        Marmelade3 aprikosen = new Marmelade3("Aprikosen", "31.10.10", 16);

        Vorratskammer3 vorrat = new Vorratskammer3(stachelbeer, erdbeer, aprikosen);
        vorrat.ausgeben();

        Marmelade3 kirsch = new Marmelade3("Kirsch", "01.07.09", 11);

        vorrat.ersetzen(kirsch, 3);
        vorrat.ausgeben();

    }
}
