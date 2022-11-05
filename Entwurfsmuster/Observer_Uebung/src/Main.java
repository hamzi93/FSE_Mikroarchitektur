public class Main {

    public static void main(String[] args) {

        // erstellen von subject objekt
        // damit man alle observers updaten kann
        // und neue hinzufügen oder löschen kann
        StockGrabber stockGrabber = new StockGrabber();

        // erstellung von observer
        StockObserver observer1 = new StockObserver(stockGrabber);

        // diese drei aktien wurden von einem beobachter ausgewählt
        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(677.60);
        stockGrabber.setGOOGPrice(676.40);

        StockObserver observer2 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(677.60);
        stockGrabber.setGOOGPrice(676.40);

        // löschung eines observers
        stockGrabber.unregister(observer2);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(677.60);
        stockGrabber.setGOOGPrice(676.40);
    }
}
