
// Die Chain hält eine Gruppe von Objekten
// die in der Lage sind ein Problem zu lösen.
// Wenn das erste keine Lösung bietet
// gibt es die Aufgabe an das nächste Objekt in der Chaain weiter.

public interface Chain {

    // Weitergabe der Daten wenn keine Lösung kommt

    public void setNextChain(Chain nextChain);

    public void calculate(Numbers request);

}
