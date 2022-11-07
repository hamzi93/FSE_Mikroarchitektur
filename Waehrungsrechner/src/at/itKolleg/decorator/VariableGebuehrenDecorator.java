package at.itKolleg.decorator;

import at.itKolleg.WR;

public class VariableGebuehrenDecorator extends UmrechnungsDecorator{

    final double variablenGebuehren;

    public VariableGebuehrenDecorator(WR naechsterWr) {
        super(naechsterWr);
        this.variablenGebuehren = 0.005;
    }

    @Override
    public double umrechnen(String variante, double betrag) {
        System.out.println("VARIABLEGEBÜHREN von: " + betrag * variablenGebuehren);
        betrag = betrag - (betrag * variablenGebuehren);
        return super.umrechnen(variante, betrag);
    }
}
