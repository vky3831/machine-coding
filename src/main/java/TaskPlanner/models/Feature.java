package TaskPlanner.models;

import TaskPlanner.enums.Impact;
import lombok.Data;


@Data
public class Feature extends Task{

    public Feature(String creator){
        this.creator = creator;
    }

    String featureSummary;
    Impact impact;

}
