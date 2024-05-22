package src.todo.service;

import src.todo.model.Task;

import java.util.*;
import java.util.stream.Collectors;

public class TodoListImpl implements TodoList {
    private Map<Integer, Task> tasks;
    private List<String> activityLog;
    private int nextTaskId;

    public TodoListImpl() {
        this.tasks = new HashMap<>();
        this.activityLog = new ArrayList<>();
        this.nextTaskId = 1;
    }

    public void addTask(String description, Date deadline, List<String> tags) {
        Task task = new Task(nextTaskId, description, deadline, tags);
        tasks.put(nextTaskId, task);
        activityLog.add("Added task " + nextTaskId + ": " + description);
        nextTaskId++;
    }

    public Task getTask(int taskId) {
        return tasks.get(taskId);
    }

    public void modifyTask(int taskId, String description, Date deadline, List<String> tags) {
        Task task = tasks.get(taskId);
        if (task != null) {
            task.setDescription(description);
            task.setDeadline(deadline);
            task.setTags(tags);
            activityLog.add("Modified task " + taskId + ": " + description);
        }
    }

    public void removeTask(int taskId) {
        Task task = tasks.remove(taskId);
        if (task != null) {
            activityLog.add("Removed task " + taskId + ": " + task.getDescription());
        }
    }

    public void markTaskCompleted(int taskId) {
        Task task = tasks.get(taskId);
        if (task != null) {
            task.markCompleted();
            activityLog.add("Completed task " + taskId + ": " + task.getDescription());
            tasks.remove(taskId);
        }
        System.out.println("TaskId : " + taskId + " completed successfully.");
    }

    public List<Task> listTasks(String filterTag, Date fromDate, Date toDate) {
        return tasks.values().stream()
                .filter(task -> (filterTag == null || task.getTags().contains(filterTag)) &&
                        (fromDate == null || task.getCreatedAt().after(fromDate)) &&
                        (toDate == null || task.getCreatedAt().before(toDate)))
                .sorted(Comparator.comparing(Task::getCreatedAt))
                .collect(Collectors.toList());
    }

    public Map<String, Integer> getStatistics(Date fromDate, Date toDate) {
        int added = 0, completed = 0, spilled = 0;
        Date now = new Date();

        for (String log : activityLog) {
            if ((fromDate == null || log.contains(fromDate.toString())) &&
                    (toDate == null || log.contains(toDate.toString()))) {
                if (log.contains("Added task")) added++;
                if (log.contains("Completed task")) completed++;
            }
        }

        for (Task task : tasks.values()) {
            if (task.getDeadline() != null && task.getDeadline().before(now)) {
                spilled++;
            }
        }

        Map<String, Integer> statistics = new HashMap<>();
        statistics.put("Added", added);
        statistics.put("Completed", completed);
        statistics.put("Spilled", spilled);

        return statistics;
    }

    public List<String> getActivityLog(Date fromDate, Date toDate) {
        return activityLog.stream()
                .filter(log -> (fromDate == null || log.contains(fromDate.toString())) &&
                        (toDate == null || log.contains(toDate.toString())))
                .collect(Collectors.toList());
    }
}