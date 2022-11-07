package at.itKolleg.chainAndTemplate;

import at.itKolleg.WR;

import java.util.Objects;

public class Euro2YenBearbeiter extends WR {

    public Euro2YenBearbeiter(WR umrechnungsBearbeiter) {
        super(umrechnungsBearbeiter);
    }

    @Override
    public double getFaktor() {
        return 148.86;
    }

    @Override
    public boolean zustaendig(String variante) {
        return Objects.equals(variante, "Euro2Yen");
    }
}
