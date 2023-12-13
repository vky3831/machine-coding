package TaskPlanner.models;

import TaskPlanner.enums.Severity;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class Bug extends Task{
    public Bug(String creator){
        this.creator = creator;
    }

    Severity severity;
}
