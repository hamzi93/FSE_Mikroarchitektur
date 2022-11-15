package at.itKolleg.adapter;

import at.itKolleg.ISammelumrechnung;
import at.itKolleg.IUmrechnen;

public class SammelumrechnungAdapter implements ISammelumrechnung {

    Sammelumrechnung sammelumrechnung;
    IUmrechnen umrechner;


    public SammelumrechnungAdapter(IUmrechnen umrechner){
        this.sammelumrechnung = new Sammelumrechnung();
        this.umrechner = umrechner;
    }


    @Override
    public double sammelumrechnen(double[] betraege, String variante) {
        double betrag = this.sammelumrechnung.sammelumrechnen(betraege, variante);
        return this.umrechner.umrechnen(variante, betrag);
    }
}
