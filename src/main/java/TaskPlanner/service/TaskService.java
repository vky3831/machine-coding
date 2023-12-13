package TaskPlanner.service;


import TaskPlanner.enums.SubTaskStatus;
import TaskPlanner.enums.TaskStatus;
import TaskPlanner.enums.TaskType;
import TaskPlanner.models.Story;
import TaskPlanner.models.SubTask;
import TaskPlanner.models.Task;

import java.util.Date;
import java.util.Map;

public interface TaskService {
    Task createTask(TaskType taskType, String creator, String title, Date dueDate, Map<String, Object> typeSpecificDetails);

    SubTask createSubTask(Story story, String title);

    boolean changeTaskStatus(Task task, TaskStatus taskStatus);

    boolean changeSubTaskStatus(SubTask subTask, SubTaskStatus subTaskStatus);

    boolean changeAssigneeOfTask(Task task, String assignee);
}
