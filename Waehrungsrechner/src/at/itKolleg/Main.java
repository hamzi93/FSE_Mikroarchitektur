package at.itKolleg;

import at.itKolleg.chainAndTemplate.Euro2DollarBearbeiter;
import at.itKolleg.chainAndTemplate.Euro2YenBearbeiter;
import at.itKolleg.decorator.FixGebuehrenDecorator;
import at.itKolleg.decorator.VariableGebuehrenDecorator;

public class Main {

    public static void main(String[] args) {
        // Chain + Template
        WR kette = new Euro2YenBearbeiter(new Euro2DollarBearbeiter(null));
        double betrag = 33.21;

        double inDollar = kette.umrechnen("Euro2Dollar",betrag);
        System.out.println(betrag + " in Euro = " + inDollar + " in Dollar");
        double inYen = kette.umrechnen("Euro2Yen",betrag);
        System.out.println(betrag + " in Euro = " + inYen + " in Yen");
        System.out.println();

        //Decorator
        WR kette2 = new FixGebuehrenDecorator(new Euro2DollarBearbeiter(new Euro2YenBearbeiter(null)));

        double inDollar2 = kette2.umrechnen("Euro2Dollar",betrag);
        System.out.println(betrag + " in Euro = " + inDollar2 + " in Dollar inkl. Gebühren");
        double inYen2 = kette2.umrechnen("Euro2Yen",betrag);
        System.out.println(betrag + " in Euro = " + inYen2 + " in Yen inkl. Gebühren");
        System.out.println();

        WR kette3 = new VariableGebuehrenDecorator(new Euro2DollarBearbeiter(new Euro2YenBearbeiter(null)));

        double inDollar3 = kette3.umrechnen("Euro2Dollar",betrag);
        System.out.println(betrag + " in Euro = " + inDollar3 + " in Dollar inkl. Gebühren");
        double inYen3 = kette3.umrechnen("Euro2Yen",betrag);
        System.out.println(betrag + " in Euro = " + inYen3 + " in Yen inkl. Gebühren");

    }
}
