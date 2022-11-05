public class AddNumbers implements Chain{

    private  Chain nextInChain;

    // Weitergabe der Daten, falls keine Lösung gefunden wird

    public void setNextChain(Chain nextChain) {

        nextInChain = nextChain;

    }

    // Versucht eine Lösung zu finden, wenn nicht wird es an das nächste Objekt in der Chain weitergegeben.

    public void calculate(Numbers request) {

        if(request.getCalcWanted() == "add"){

            System.out.print(request.getNumber1() + " + " + request.getNumber2() + " = "+
                    (request.getNumber1()+request.getNumber2()));

        } else {

            nextInChain.calculate(request);

        }

    }
}