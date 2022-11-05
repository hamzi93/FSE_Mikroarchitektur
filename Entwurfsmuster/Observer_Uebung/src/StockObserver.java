public class StockObserver implements Observer {

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    // static weil es ein counter ist
    private static int observerIDTracker = 0;

    // Um eine Kennzahl für jeden Observer zu bekommen
    private int observerID;
    //referenz zu stockgrabber, damit man seine methoden aufrufen kann
    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber){

        this.stockGrabber = stockGrabber;

        // jedes objekt bekommt eine eigene id

        this.observerID = ++observerIDTracker;

        System.out.println("New Observer " + this.observerID);

        // hinzufügen von observer in die subject arraylist

        stockGrabber.register(this);

    }


    public void update(double ibmPrice, double aaplPrice, double googPrice) {

        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;

        printThePrices();

    }

    public void printThePrices(){

        System.out.println(observerID + "\nIBM: " + ibmPrice + "\nAAPL: " +
                aaplPrice + "\nGOOG: " + googPrice + "\n");

    }

}
