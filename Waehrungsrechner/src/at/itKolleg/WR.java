package at.itKolleg;


import at.itKolleg.builder.WRPlan;

public abstract class WR implements IUmrechnen, WRPlan {

    private WR naechsterWr;

    public WR(WR naechsterWr){
        this.naechsterWr = naechsterWr;
    }

    public WR(){
        this.naechsterWr = null;
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



    public abstract void setFaktor(double faktor);

    public void setNaechsterWr(WR naechsterWr){
        this.naechsterWr = naechsterWr;
    }
}
