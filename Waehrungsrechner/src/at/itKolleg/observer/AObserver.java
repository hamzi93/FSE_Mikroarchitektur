package at.itKolleg.observer;

public abstract class AObserver {



    public AObserver() {
    }

    public abstract void update(double ausgangsBetrag, double zielBetrag, String ausgangsWaehrung, String zielWaehrung);

}

