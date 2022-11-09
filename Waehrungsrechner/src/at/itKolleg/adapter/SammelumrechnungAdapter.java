package at.itKolleg.adapter;

import at.itKolleg.IUmrechnen;

public class SammelumrechnungAdapter implements IUmrechnen {

    Sammelumrechnung sammelumrechnung;
    double betrag;
    double result;


    SammelumrechnungAdapter(double [] betreage, String variante){
        this.sammelumrechnung = new Sammelumrechnung();
        this.betrag = this.sammelumrechnung.sammelumrechnen(betreage, variante);
        this.result = umrechnen(variante, this.betrag);
    }


    @Override
    public double umrechnen(String variante, double betrag) {
        return 0;
    }

    @Override
    public double getFaktor() {
        return 0;
    }

    @Override
    public boolean zustaendig(String variante) {
        return false;
    }
}
