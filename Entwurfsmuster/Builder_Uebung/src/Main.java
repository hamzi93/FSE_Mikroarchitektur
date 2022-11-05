public class Main {

    public static void main(String[] args) {
        // RobotBuilder vom Typ OldRobotBuilder

        RobotBuilder oldStyleRobot = new OldRobotBuilder();

        // OldRobotBuilder Spezifikation wird in dem Engineer gegeben

        RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);

        // Dem Engineer sagen das er Robot erstellt mit der jeweiligen Spezifikation

        robotEngineer.makeRobot();

        // Der Engineer gibt den richtigen robot zurück

        Robot firstRobot = robotEngineer.getRobot();

        System.out.println("Robot Built");

        System.out.println("Robot Head Type: " + firstRobot.getRobotHead());

        System.out.println("Robot Torso Type: " + firstRobot.getRobotTorso());

        System.out.println("Robot Arm Type: " + firstRobot.getRobotArms());

        System.out.println("Robot Leg Type: " + firstRobot.getRobotLegs());
    }
}
