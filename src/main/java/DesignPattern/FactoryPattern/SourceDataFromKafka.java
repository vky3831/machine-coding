package DesignPattern.FactoryPattern;

public class SourceDataFromKafka implements IngestToDatabase {
    @Override
    public void ingestData() {
        System.out.println("Fetches data from Kafka topic and ingests");
    }
}
