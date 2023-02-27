package DesignPattern.FactoryPattern;

public class FactoryOfSource {
    IngestToDatabase sourceDataCollector = null;

    IngestToDatabase getSourceDataCollector(SourceDataType type){
        if(type == SourceDataType.FILE)  sourceDataCollector = new SourceDataFromFile();
        else if(type == SourceDataType.API)  sourceDataCollector = new SourceDataFromAPI();
        else if(type == SourceDataType.KAFKA) sourceDataCollector = new SourceDataFromKafka();

        return sourceDataCollector;
    }
}
