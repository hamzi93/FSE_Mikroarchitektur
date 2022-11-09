package at.itKolleg.observer;

public abstract class AObserver {

    protected Subject subject;

    public AObserver(Subject subject) {
        this.subject = subject;
    }

    public abstract void update(double ausgangsBetrag, double zielBetrag, String ausgangsWaehrung, String zielWaehrung);

}

