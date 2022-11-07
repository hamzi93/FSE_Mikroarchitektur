package at.itKolleg.chainAndTemplate;

import at.itKolleg.WR;

import java.util.Objects;

public class Euro2DollarBearbeiter extends WR {



    public Euro2DollarBearbeiter(WR umrechnungsBearbeiter) {
        super(umrechnungsBearbeiter);
    }

    @Override
    public double getFaktor() {
        return 1.01;
    }

    @Override
    public boolean zustaendig(String variante) {
        return Objects.equals(variante, "Euro2Dollar");
    }
}
