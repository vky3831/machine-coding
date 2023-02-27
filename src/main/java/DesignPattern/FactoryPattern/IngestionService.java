package DesignPattern.FactoryPattern;

public class IngestionService {
    FactoryOfSource factoryOfSource;

    IngestionService(FactoryOfSource factoryOfSource){
        this.factoryOfSource = factoryOfSource;
    }

    void ingestSourceDataToStorage(SourceDataType type){
        IngestToDatabase sourceDataCollector = factoryOfSource.getSourceDataCollector(type);
        sourceDataCollector.ingestData();
    }
}
