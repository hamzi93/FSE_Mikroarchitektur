package at.itKolleg.chainAndTemplate;

import at.itKolleg.WR;

import java.util.Objects;

public class Euro2DollarBearbeiter extends WR {

    private double faktor;


    public Euro2DollarBearbeiter(WR umrechnungsBearbeiter) {
        super(umrechnungsBearbeiter);
        this.faktor = 1.01;
        this.ausgangsWaehrung = "EUR";
        this.zielWeahrung = "USD";
    }

    public Euro2DollarBearbeiter(){
        super();
        this.faktor = 1.01;
        this.ausgangsWaehrung = "EUR";
        this.zielWeahrung = "USD";
    }

    @Override
    public void setFaktor(double faktor) {
        this.faktor = faktor;
    }

    @Override
    public double getFaktor() {
        return this.faktor;
    }

    @Override
    public boolean zustaendig(String variante) {
        return Objects.equals(variante, "Euro2Dollar");
    }

}
