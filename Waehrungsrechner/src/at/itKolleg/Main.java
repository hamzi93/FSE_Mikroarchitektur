package at.itKolleg;

import at.itKolleg.chain.Euro2DollarBearbeiter;
import at.itKolleg.chain.Euro2YenBearbeiter;
import at.itKolleg.chain.UmrechnungsBearbeiter;

public class Main {

    public static void main(String[] args) {
        // Chain
        UmrechnungsBearbeiter kette = new Euro2YenBearbeiter(new Euro2DollarBearbeiter(null));
        double betrag = 30.21;

        double inDollar = kette.umrechnen("Euro2Dollar",betrag);
        System.out.println(betrag + " in Euro = " + inDollar + " in Dollar");

        double inYen = kette.umrechnen("Euro2Yen",betrag);
        System.out.println(betrag + " in Euro = " + inYen + " in Yen");
    }
}
