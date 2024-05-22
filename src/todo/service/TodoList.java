package src.todo.service;

import src.todo.model.Task;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface TodoList {
    void addTask(String description, Date deadline, List<String> tags);
    Task getTask(int taskId);
    void modifyTask(int taskId, String description, Date deadline, List<String> tags);
    void removeTask(int taskId);
    void markTaskCompleted(int taskId);
    List<Task> listTasks(String filterTag, Date fromDate, Date toDate);
    Map<String, Integer> getStatistics(Date fromDate, Date toDate);
    List<String> getActivityLog(Date fromDate, Date toDate);
}
