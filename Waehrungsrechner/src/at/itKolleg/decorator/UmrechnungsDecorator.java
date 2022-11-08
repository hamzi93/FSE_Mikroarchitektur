package at.itKolleg.decorator;

import at.itKolleg.WR;

public abstract class UmrechnungsDecorator extends WR {

    public UmrechnungsDecorator(WR naechsterWr) {
        super(naechsterWr);
    }

    @Override
    public double umrechnen(String variante, double betrag) {
        return super.umrechnen(variante, betrag);
    }

    @Override
    public double getFaktor() {
        return 0;
    }

    @Override
    public boolean zustaendig(String variante) {
        return false;
    }

    public void setFaktor(double faktor) {
    }
}
