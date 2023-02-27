package DesignPattern.FactoryPattern;

public class SourceDataFromFile implements IngestToDatabase {
    @Override
    public void ingestData() {
        System.out.println("Fetches data from File and ingests");
    }
}
