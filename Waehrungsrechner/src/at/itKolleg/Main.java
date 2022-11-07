package at.itKolleg;

import at.itKolleg.chainAndTemplate.Euro2DollarBearbeiter;
import at.itKolleg.chainAndTemplate.Euro2YenBearbeiter;

public class Main {

    public static void main(String[] args) {
        // Chain
        WR kette = new Euro2YenBearbeiter(new Euro2DollarBearbeiter(null));
        double betrag = 33.21;

        double inDollar = kette.umrechnen("Euro2Dollar",betrag);
        System.out.println(betrag + " in Euro = " + inDollar + " in Dollar");

        double inYen = kette.umrechnen("Euro2Yen",betrag);
        System.out.println(betrag + " in Euro = " + inYen + " in Yen");
    }
}
