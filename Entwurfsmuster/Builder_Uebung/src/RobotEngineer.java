// Die Direktor / Engineer Klasse kreiiert einen Robot mit Hilfe
// des Builder Interfaces (in unserem Fall haben wir nur eine definierte Klasse mit OldRobotBuilder)

public class RobotEngineer {

    private RobotBuilder robotBuilder;

    // OldRobotBuilder Spezifikation wird zum Engineer gesendet

    public RobotEngineer(RobotBuilder robotBuilder){

        this.robotBuilder = robotBuilder;

    }

    // Rückgabe des Robots von der definierten Builder Klasse

    public Robot getRobot(){

        return this.robotBuilder.getRobot();

    }


    public void makeRobot() {

        this.robotBuilder.buildRobotHead();
        this.robotBuilder.buildRobotTorso();
        this.robotBuilder.buildRobotArms();
        this.robotBuilder.buildRobotLegs();

    }

}