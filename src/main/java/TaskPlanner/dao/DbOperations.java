package TaskPlanner.dao;


import TaskPlanner.models.Sprint;
import TaskPlanner.models.Task;

import java.util.List;

public interface DbOperations {

    boolean saveTask(Task task);
    boolean saveSprint(Sprint sprint);

    boolean deleteSprint(Sprint sprint);

    List<Task> getTaskByAssignee(String assignee);

    Sprint getSprintById(String uuid);
}
