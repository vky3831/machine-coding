package DesignPattern.FactoryPattern;

public class PlayFactory {
    public static void main(String[] args) {
        IngestionService ingestionService = new IngestionService(new FactoryOfSource());
        ingestionService.ingestSourceDataToStorage(SourceDataType.API);
        ingestionService.ingestSourceDataToStorage(SourceDataType.FILE);
        ingestionService.ingestSourceDataToStorage(SourceDataType.KAFKA);
    }
}
