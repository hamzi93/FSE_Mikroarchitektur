package at.itKolleg.observer;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DecimalFormat;

public class LogObserver extends AObserver{

    private static int observerIDTracker = 0;
    private int observerID;

    public LogObserver(Subject subject) {
        super(subject);
        this.observerID = observerIDTracker++;
        System.out.println("New Observer " + this.observerID);
        subject.register(this);
    }

    @Override
    public void update(double ausgangsBetrag, double zielBetrag, String ausgangsWaehrung, String zielWaehrung) {
        writeToLogFile(ausgangsBetrag,zielBetrag,ausgangsWaehrung,zielWaehrung);
    }

    public void writeToLogFile(double ausgangsBetrag, double zielBetrag, String ausgangsWaehrung, String zielWaehrung) {
        try {
            DecimalFormat df = new DecimalFormat("0.00");
            Timestamp ts = new Timestamp(System.currentTimeMillis());
            String log = ts + "\nAusgangsbetrag: " + df.format(ausgangsBetrag) + "\nAusgangswährung: " + ausgangsWaehrung + "\nZielwährung: " + zielWaehrung + "\nZielbetrag: " + df.format(zielBetrag) + "\n=========================\n";

            FileWriter myWriter = new FileWriter("log.txt",true);
            myWriter.write(log);
            myWriter.close();
            System.out.println("Log erfolgreich geschrieben!");
        } catch (IOException e) {
            System.out.println("Die Log Datei konnte nicht geschrieben werden!");
            e.printStackTrace();
        }
    }


}
