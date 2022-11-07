package at.itKolleg.decorator;

import at.itKolleg.WR;

public class FixGebuehrenDecorator extends UmrechnungsDecorator{

    final double fixgebuehren;

    public FixGebuehrenDecorator(WR naechsterWr) {
        super(naechsterWr);
        this.fixgebuehren = 5;
    }

    @Override
    public double umrechnen(String variante, double betrag) {
        System.out.println("FIXGEBÜHREN von: " + fixgebuehren);
        betrag = betrag - 5;
        return super.umrechnen(variante, betrag);
    }

}
