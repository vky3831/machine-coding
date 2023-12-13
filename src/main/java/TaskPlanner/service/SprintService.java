package TaskPlanner.service;


import TaskPlanner.models.Sprint;
import TaskPlanner.models.Task;

public interface SprintService {
    Sprint createSprint();
    boolean deleteSprint(Sprint sprint);

    boolean addTaskToSprint(Sprint sprint, Task task);

    boolean removeTaskFromSprint(Sprint sprint, Task task);
}
