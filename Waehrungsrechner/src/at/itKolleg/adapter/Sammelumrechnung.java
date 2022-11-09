package at.itKolleg.adapter;

import at.itKolleg.ISammelumrechnung;

public class Sammelumrechnung implements ISammelumrechnung {


    @Override
    public double sammelumrechnen(double[] betraege, String variante) {
        double betrag = 0;
        for (double b: betraege) {
            betrag = betrag + b;
        }
        return betrag;
    }
}
