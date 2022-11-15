package at.itKolleg;


import at.itKolleg.builder.WRPlan;
import at.itKolleg.observer.AObserver;
import at.itKolleg.observer.Subject;

import java.util.ArrayList;

public abstract class WR implements IUmrechnen, WRPlan, Subject {

    private WR naechsterWr;
    protected double ausgangsBetrag, zielBetrag;
    protected String ausgangsWaehrung, zielWeahrung;
    private ArrayList<AObserver> observers;


    public WR(WR naechsterWr) {
        this.naechsterWr = naechsterWr;
        this.observers = new ArrayList<>();
    }

    public WR() {
        this.naechsterWr = null;
        this.observers = new ArrayList<>();
    }


    public double umrechnen(String variante, double betrag) {
        // template
        this.ausgangsBetrag = betrag;
        if (zustaendig(variante)) {
            double result = betrag * getFaktor();
            result = Math.round(result * 100.0) / 100.0;
            this.zielBetrag = result;
            notifyObserver();
            return result;
        }
        this.zielBetrag = 0;
        //chain
        if (naechsterWr != null) {
            return naechsterWr.umrechnen(variante, betrag);
        }

        return 0;
    }


    public abstract void setFaktor(double faktor);

    public void setNaechsterWr(WR naechsterWr) {
        this.naechsterWr = naechsterWr;
    }

    public void register(AObserver newObserver) {
        observers.add(newObserver);
    }

    public void unregister(AObserver deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);

        System.out.println("Observer " + (observerIndex + 1) + " deleted");

        observers.remove(observerIndex);
    }

    public void notifyObserver() {
        for (AObserver observer : observers) {
            observer.update(ausgangsBetrag, zielBetrag, ausgangsWaehrung, zielWeahrung);
        }
    }
}
