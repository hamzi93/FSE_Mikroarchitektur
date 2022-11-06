package at.itKolleg.decorator;

import at.itKolleg.Credentials;
import at.itKolleg.ExportCredentials;

import java.util.List;

public class ExportDecoratorFooter extends ExportDecorator{

    public ExportDecoratorFooter(ExportCredentials exportCredentials) {
        super(exportCredentials);
    }

    public void export(List<Credentials> credentialsList)
    {
        super.export(credentialsList);
        System.out.println("FOOTER FÜR EXPORT");
    }

}
