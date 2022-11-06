package at.itKolleg;

import at.itKolleg.decorator.ExportDecoratorFooter;
import at.itKolleg.decorator.ExportDecoratorHeader;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Credentials> credentialsList = new ArrayList<>();
        credentialsList.add(new Credentials("www.gmx.at","123zuesss", "a.iller"));
        credentialsList.add(new Credentials("www.hotmail.com","asdfjköljk", "corban.nerum"));
        credentialsList.add(new Credentials("www.xyz.net","9fas8dfu9ee", "bobba.fett"));

        // ohne decorator
        ExportCredentials exportCredentials = new CsvExporter();
        exportCredentials.export(credentialsList);

        System.out.println();

        // mit decorator (Verschachtelt)
        ExportCredentials exportCredentials1 =
                new ExportDecoratorHeader(
                        new ExportDecoratorFooter(
                                new CsvExporter()));
        exportCredentials1.export(credentialsList);

    }
}
