package at.itKolleg;

public abstract class WR implements IUmrechnen{

    private WR naechsterWr;

    public WR(WR naechsterWr){
        this.naechsterWr = naechsterWr;
    }

    public double umrechnen(String variante, double betrag){
        // template
        if(zustaendig(variante)){
            double result = betrag * getFaktor();
            return Math.round(result * 100.0)/100.0;
        }
        //chain
        if (naechsterWr != null) {
            return naechsterWr.umrechnen(variante, betrag);
        }

        return 0;
    }


}
