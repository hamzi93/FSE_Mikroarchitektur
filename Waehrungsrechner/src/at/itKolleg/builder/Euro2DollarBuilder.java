package at.itKolleg.builder;

import at.itKolleg.WR;
import at.itKolleg.chainAndTemplate.Euro2DollarBearbeiter;

public class Euro2DollarBuilder implements WRBuilder{

    private WR wr;

    public Euro2DollarBuilder(){
        this.wr = new Euro2DollarBearbeiter();
    }


    @Override
    public void buildFaktor() {
        wr.setFaktor(1.01);
    }

    @Override
    public void buildNaechsterWr() {
        wr.setNaechsterWr(null);
    }

    @Override
    public WR getWR() {
        return this.wr;
    }
}
