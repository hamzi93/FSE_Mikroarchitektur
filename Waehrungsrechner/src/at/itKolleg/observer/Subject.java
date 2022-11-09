package at.itKolleg.observer;

public interface Subject {

    public void register(AObserver o);
    public void unregister(AObserver o);
    public void notifyObserver();

    /*
    public void addObserver(AObserver observer) {
        this.observers.add(observer);
    }

    public void notifyAllObservers() {
        for (AObserver observer : observers) {
            observer.update(wr);
        }
    }
   */

}

