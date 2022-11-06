package at.itKolleg.decorator;

import at.itKolleg.Credentials;
import at.itKolleg.ExportCredentials;

import java.util.List;

public class ExportDecoratorHeader extends ExportDecorator {

    public ExportDecoratorHeader(ExportCredentials exportCredentials) {
        super(exportCredentials);
    }

    public void export(List<Credentials> credentialsList)
    {
        System.out.println("HEADER FÜR EXPORT");
        super.export(credentialsList);
    }
}
