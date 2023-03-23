public class UnveraenderbareBox {

    private double _breite;
    private double _laenge;
    private double _hoehe;

    UnveraenderbareBox(double breite, double hoehe, double laenge) {
        this._breite = breite;
        this._hoehe = hoehe;
        this._laenge = laenge;
    }

    UnveraenderbareBox(double seite) {
        _breite = seite;
        _hoehe = seite;
        _laenge = seite;
    }

    public double berechneVolumen() {
        return _breite * _laenge * _hoehe;
    }

    public double berechneOberflaeche() {
        return 2 * (_breite * _breite + _hoehe * _hoehe + _laenge * _laenge);
    }

    public double getBreite() {
        return _breite;
    }

    public double getHoehe() {
        return _hoehe;
    }

    public double getLaenge() {
        return _laenge;
    }
}
