package DesignPattern.FactoryPattern;

public class SourceDataFromAPI implements IngestToDatabase {
    @Override
    public void ingestData() {
        System.out.println("Fetches data from API and ingests");
    }
}
