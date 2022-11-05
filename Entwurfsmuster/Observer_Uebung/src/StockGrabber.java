import java.util.ArrayList;

// verwendet subject interface um upzudaten

public class StockGrabber implements Subject{

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber(){

        // arraylist enthält alle observer

        observers = new ArrayList<Observer>();
    }

    public void register(Observer newObserver) {

        // neuer observer hinzufügen in die liste

        observers.add(newObserver);

    }

    public void unregister(Observer deleteObserver) {

        // löschung des observers durch index

        int observerIndex = observers.indexOf(deleteObserver);

        System.out.println("Observer " + (observerIndex+1) + " deleted");

        observers.remove(observerIndex);

    }

    public void notifyObserver() {

        // preis änderung -> alle observers werden informiert

        for(Observer observer : observers){

            observer.update(ibmPrice, aaplPrice, googPrice);

        }
    }


    public void setIBMPrice(double newIBMPrice){

        this.ibmPrice = newIBMPrice;

        notifyObserver();

    }

    public void setAAPLPrice(double newAAPLPrice){

        this.aaplPrice = newAAPLPrice;

        notifyObserver();

    }

    public void setGOOGPrice(double newGOOGPrice){

        this.googPrice = newGOOGPrice;

        notifyObserver();

    }

}