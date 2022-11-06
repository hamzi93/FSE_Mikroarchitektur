package at.itKolleg.decorator;

import at.itKolleg.Credentials;
import at.itKolleg.ExportCredentials;

import java.util.List;

public abstract class ExportDecorator implements ExportCredentials {
    ExportCredentials exportCredentials;

    public ExportDecorator(ExportCredentials exportCredentials) {
        this.exportCredentials = exportCredentials;
    }

    public void export(List<Credentials> credentialsList)
    {
        exportCredentials.export(credentialsList);
    }

}
