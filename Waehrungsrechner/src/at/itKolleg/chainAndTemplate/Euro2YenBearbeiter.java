package at.itKolleg.chainAndTemplate;

import at.itKolleg.WR;

import java.util.Objects;

public class Euro2YenBearbeiter extends WR {

    private double faktor;

    public Euro2YenBearbeiter(WR umrechnungsBearbeiter) {
        super(umrechnungsBearbeiter);
        this.faktor = 148.86;
        this.ausgangsWaehrung = "EUR";
        this.zielWeahrung = "YEN";
    }

    public Euro2YenBearbeiter(){
        super();
        this.faktor = 148.86;
        this.ausgangsWaehrung = "EUR";
        this.zielWeahrung = "YEN";
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
        return Objects.equals(variante, "Euro2Yen");
    }

}


