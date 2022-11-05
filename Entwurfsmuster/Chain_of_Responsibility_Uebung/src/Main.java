public class Main {

    public static void main(String[] args) {
        // Alle Objekte der Chain werden erstellt

        Chain chainCalc1 = new AddNumbers();
        Chain chainCalc2 = new SubtractNumbers();
        Chain chainCalc3 = new MultNumbers();
        Chain chainCalc4 = new DivideNumbers();

        // Hier wird den Objekten gesagt wo Sie die Aufgabe
        // bei keiner Lösung weitergeben sollen

        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);

        // Numbers wird definiert und in das erste Objekt der Chain gepackt.

        Numbers request = new Numbers(4,2,"add");

        chainCalc1.calculate(request);
    }
}
