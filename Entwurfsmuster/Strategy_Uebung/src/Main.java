import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Article> articles = new ArrayList<>();
        articles.add(new Article("345","name", "com"));
        articles.add(new Article("345","name", "com"));
        articles.add(new Article("345","name", "com"));

        ExporterContext exporterContext = new ExporterContext(new JSONExporter());
        ExporterContext exporterContext1 = new ExporterContext(new CSVExporter());
        exporterContext.doExport(articles);
        exporterContext1.doExport(articles);

    }
}
