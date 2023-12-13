package TaskPlanner;



import TaskPlanner.dao.DbOperations;
import TaskPlanner.dao.impl.DbOperationsImpl;
import TaskPlanner.enums.*;
import TaskPlanner.models.*;
import TaskPlanner.service.DisplayService;
import TaskPlanner.service.SprintService;
import TaskPlanner.service.TaskService;
import TaskPlanner.service.impl.DisplayServiceImpl;
import TaskPlanner.service.impl.SprintServiceImpl;
import TaskPlanner.service.impl.TaskServiceImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PlayTaskPlanner {
    public static void main(String[] args) throws ParseException {
        DbOperations dbOperations = new DbOperationsImpl();
        TaskService taskService = new TaskServiceImpl(dbOperations);
        SprintService sprintService = new SprintServiceImpl(dbOperations);
        DisplayService displayService = new DisplayServiceImpl(dbOperations);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date;



        Sprint sprint1 = sprintService.createSprint();

        // create dashboard
        Map<String, Object> attributes = new HashMap<>();
        attributes.put("featureSummary", "Create console for debugging");
        attributes.put("impact", Impact.LOW);
        attributes.put("assignee", "Peter");
        date = dateFormat.parse("2019-04-12");
        Feature createDashboard = (Feature) taskService.createTask(TaskType.FEATURE, "Brad", "Create Dashboard", date, attributes);
        sprintService.addTaskToSprint(sprint1, createDashboard);

        // Fix mysql issue
        attributes.clear();
        attributes.put("severity", Severity.P0);
        attributes.put("assignee", "Ryan");
        date = dateFormat.parse("2019-04-14");
        Bug fixMysqlIssue = (Bug) taskService.createTask(TaskType.BUG, "Ryan", "Fix mysql issue", date, attributes);
        taskService.changeTaskStatus(fixMysqlIssue, TaskStatus.IN_PROGRESS);
        sprintService.addTaskToSprint(sprint1, fixMysqlIssue);

        // create a micro service
        attributes.clear();
        attributes.put("assignee", "Ryan");
        attributes.put("summary", "Add logging to the feature");
        date = dateFormat.parse("2019-03-12");
        Story createMicroservice = (Story) taskService.createTask(TaskType.STORY, "Amy", "Create a microservice", date, attributes);

        SubTask development = taskService.createSubTask(createMicroservice, "Development");
        SubTask unitTest = taskService.createSubTask(createMicroservice, "Unit Test");
        SubTask integrationTest = taskService.createSubTask(createMicroservice, "Integration Test");
        taskService.changeSubTaskStatus(development, SubTaskStatus.COMPLETED);
        taskService.changeSubTaskStatus(unitTest, SubTaskStatus.COMPLETED);
        taskService.changeSubTaskStatus(integrationTest, SubTaskStatus.COMPLETED);

        taskService.changeTaskStatus(createMicroservice, TaskStatus.COMPLETED);

        sprintService.addTaskToSprint(sprint1, createMicroservice);

        // Setup console
        attributes.clear();
        attributes.put("featureSummary", "Create console for debugging");
        attributes.put("impact", Impact.HIGH);
        attributes.put("assignee", "Ryan");
        date = dateFormat.parse("2019-04-14");
        Feature setupConsole = (Feature) taskService.createTask(TaskType.FEATURE, "Ryan", "Setup console", date, attributes);
        taskService.changeTaskStatus(setupConsole, TaskStatus.IN_PROGRESS);

        // Console Api
        attributes.clear();
        attributes.put("featureSummary", "Create api for console");
        attributes.put("impact", Impact.HIGH);
        attributes.put("assignee", "Ryan");
        date = dateFormat.parse("2019-04-14");
        Feature consoleApi = (Feature) taskService.createTask(TaskType.FEATURE, "Ryan", "Console api", date, attributes);
        taskService.changeTaskStatus(consoleApi, TaskStatus.IN_PROGRESS);

        displayService.displaySprintSnapshot(sprint1.getSprintId());

        displayService.displayTasksByAssignee("Ryan");

        displayService.displayTasksByAssignee("Peter");

    }
}