package TaskPlanner.models;

import TaskPlanner.enums.SubTaskStatus;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public class SubTask {

    @Setter(AccessLevel.NONE)
    Story story;

    String title;
    SubTaskStatus subTaskStatus;

    public SubTask(Story story){
        this.story = story;
    }

    public boolean changeStatus(SubTaskStatus subTaskStatus){
        this.setSubTaskStatus(subTaskStatus);
        return true;
    }
}
