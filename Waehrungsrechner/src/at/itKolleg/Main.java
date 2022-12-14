package at.itKolleg;

import at.itKolleg.adapter.SammelumrechnungAdapter;
import at.itKolleg.builder.Euro2DollarBuilder;
import at.itKolleg.builder.WRBuilder;
import at.itKolleg.builder.WRDirector;
import at.itKolleg.chainAndTemplate.Euro2DollarBearbeiter;
import at.itKolleg.chainAndTemplate.Euro2YenBearbeiter;
import at.itKolleg.decorator.FixGebuehrenDecorator;
import at.itKolleg.decorator.VariableGebuehrenDecorator;
import at.itKolleg.observer.AObserver;
import at.itKolleg.observer.LogObserver;

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
        System.out.println();

        //Builer
        WRBuilder wrBuilder = new Euro2DollarBuilder();
        WRDirector director = new WRDirector(wrBuilder);
        director.makeWR();
        WR wr = director.getWR();

        double inDollar4 = wr.umrechnen("Euro2Dollar",betrag);
        System.out.println(betrag + " in Euro = " + inDollar4 + " in Dollar");

        double inYen4 = wr.umrechnen("Euro2Yen",betrag);
        System.out.println(betrag + " in Euro = " + inYen4 + " in Yen");

        wr.setNaechsterWr(new Euro2YenBearbeiter()); //hinzufügen von nächster WR
        double inYen5 = wr.umrechnen("Euro2Yen",betrag);
        System.out.println(betrag + " in Euro = " + inYen5 + " in Yen");

        wr.setFaktor(1.10); //Faktor ändern
        inDollar4 = wr.umrechnen("Euro2Dollar",betrag);
        System.out.println(betrag + " in Euro = " + inDollar4 + " in Dollar");

        //Adapter
        double [] betreage = {50.3,50,100,200};
        SammelumrechnungAdapter sammelumrechnung = new SammelumrechnungAdapter(new Euro2DollarBearbeiter(new Euro2YenBearbeiter()));
        System.out.println(sammelumrechnung.sammelumrechnen(betreage,"Euro2Yen"));


        //Observer
        WR tYen = new Euro2YenBearbeiter();
        WR tDollar = new Euro2DollarBearbeiter();
        AObserver observer1 = new LogObserver();
        tYen.register(observer1);
        tDollar.register(observer1);
        tYen.umrechnen("Euro2Yen", 123.20);

        tYen.setNaechsterWr(tDollar);
        tYen.umrechnen("Euro2Dollar", 123.30);
    }
}
