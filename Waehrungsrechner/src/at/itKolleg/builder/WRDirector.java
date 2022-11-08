package at.itKolleg.builder;

import at.itKolleg.WR;

public class WRDirector {

    private WRBuilder wrBuilder;

    public WRDirector(WRBuilder wrBuilder){
        this.wrBuilder = wrBuilder;
    }

    public WR getWR(){
        return this.wrBuilder.getWR();
    }

    public void makeWR(){
        wrBuilder.buildFaktor();
        wrBuilder.buildNaechsterWr();
    }

}
