package at.itKolleg.chain;

public class Euro2DollarBearbeiter extends UmrechnungsBearbeiter {

    final double dollar;

    public Euro2DollarBearbeiter(UmrechnungsBearbeiter umrechnungsBearbeiter) {
        super(umrechnungsBearbeiter);
        this.dollar = 1.01;
    }

    public double umrechnen(String variante, double betrag) {
        if(variante.equals("Euro2Dollar")) {
            double result = betrag * dollar;
            return Math.round(result * 100.0)/100.0;
        }
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
}
