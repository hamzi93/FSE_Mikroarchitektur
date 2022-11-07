package at.itKolleg.chain;

import at.itKolleg.WR;

public abstract class UmrechnungsBearbeiter extends WR {

    private UmrechnungsBearbeiter naechsterUmrechnungsBearbeiter;

    public UmrechnungsBearbeiter(UmrechnungsBearbeiter umrechnungsBearbeiter){
        this.naechsterUmrechnungsBearbeiter = umrechnungsBearbeiter;
    }

    @Override
    public double umrechnen(String variante, double betrag) {
        if (naechsterUmrechnungsBearbeiter != null) {
            return naechsterUmrechnungsBearbeiter.umrechnen(variante, betrag);
        }
        return 0;
    }
}
