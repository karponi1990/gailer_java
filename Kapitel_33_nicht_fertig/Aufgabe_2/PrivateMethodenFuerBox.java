public class PrivateMethodenFuerBox {

    private double _breite;
    private double _laenge;
    private double _hoehe;

    PrivateMethodenFuerBox(double breite, double hoehe, double laenge) {
        this._breite = breite;
        this._hoehe = hoehe;
        this._laenge = laenge;
    }

    PrivateMethodenFuerBox(double seite) {
        _breite = seite;
        _hoehe = seite;
        _laenge = seite;
    }

    public double berechneVolumen() {
        return _breite * _laenge * _hoehe;
    }

    public double berechneOberflaeche() {
        return 2 * berechneOberflaecheVorn() + 2 * berechneOberflaecheOben() + 2 * berechneOberflaecheSeitlich();
    }

    private double berechneOberflaecheVorn() {
        return _breite * _breite;
    }

    private double berechneOberflaecheOben() {
        return _laenge * _laenge;
    }

    private double berechneOberflaecheSeitlich() {
        return _hoehe * _hoehe;
    }
}
