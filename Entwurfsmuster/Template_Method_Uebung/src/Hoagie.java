
// Die Schablonenmethode enthält eine Methode aller
// Schritte des Algorithmuses. Somit können andere Subklassen
// diese überschreiben, wenn nötig.

public abstract class Hoagie {

    boolean afterFirstCondiment = false;

    // Die Methode ist auf final gestzt damit
    // Subklassen diese nicht verändern können.

    final void makeSandwich(){

        cutBun();

        if(customerWantsMeat()){

            addMeat();

            // Here to handle new lines for spacing
            afterFirstCondiment = true;

        }

        if(customerWantsCheese()){

            if(afterFirstCondiment) { System.out.print("\n"); }

            addCheese();

            afterFirstCondiment = true;

        }

        if(customerWantsVegetables()){

            if(afterFirstCondiment) { System.out.print("\n"); }

            addVegetables();

            afterFirstCondiment = true;

        }

        if(customerWantsCondiments()){

            if(afterFirstCondiment) { System.out.print("\n"); }

            addCondiments();

            afterFirstCondiment = true;

        }

        wrapTheHoagie();

    }

    // Diese Methoden müssen überschrieben werden

    abstract void addMeat();
    abstract void addCheese();
    abstract void addVegetables();
    abstract void addCondiments();

    public void cutBun(){

        System.out.println("The Hoagie is Cut");

    }

    // Diese Methoden nennt man hooks und helfen beim richtig stellen.
    // Bei abstrakte Methoden wird der user gezwungen sie zu überschreiben.
    // Hooks sollten optional bleiben

    boolean customerWantsMeat() { return true; }
    boolean customerWantsCheese() { return true; }
    boolean customerWantsVegetables() { return true; }
    boolean customerWantsCondiments() { return true; }

    public void wrapTheHoagie(){

        System.out.println("\nWrap the Hoagie");

    }

    public void afterFirstCondiment(){

        System.out.println("\n");

    }

}
