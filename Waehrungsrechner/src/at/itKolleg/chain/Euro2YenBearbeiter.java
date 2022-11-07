package at.itKolleg.chain;

public class Euro2YenBearbeiter extends UmrechnungsBearbeiter{

    final double yen;

    public Euro2YenBearbeiter(UmrechnungsBearbeiter umrechnungsBearbeiter) {
        super(umrechnungsBearbeiter);
        this.yen = 148.86;
    }

    @Override
    public double umrechnen(String variante, double betrag) {
        if(variante.equals("Euro2Yen")) {
            double result = betrag * yen;
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
