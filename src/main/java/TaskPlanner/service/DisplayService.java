package TaskPlanner.service;

public interface DisplayService {
    void displayTasksByAssignee(String assignee);

    void displaySprintSnapshot(String sprintId);
}
