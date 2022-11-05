
// interface für hinzufügen, löschen und updaten aller observers

public interface Subject {

    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObserver();
}
