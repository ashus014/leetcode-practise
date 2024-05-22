package src.todo;

import src.todo.model.Task;
import src.todo.service.TodoListImpl;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TodoListImpl todoList = new TodoListImpl();

        // Adding tasks
        todoList.addTask("Task 1 description", new Date(), Arrays.asList("work", "urgent"));
        todoList.addTask("Task 2 description", null, Arrays.asList("home"));
        todoList.addTask("Task 3 description", new Date(System.currentTimeMillis() + 86400000), Arrays.asList("work"));


        // Getting a task
        System.out.println(todoList.getTask(1));

        // Modifying a task
        todoList.modifyTask(1, "Updated Task 1 description", new Date(), Arrays.asList("work"));

        // Getting a task
        System.out.println(todoList.getTask(1));

        // Marking a task as completed
        todoList.markTaskCompleted(2);

        // Getting a task
        todoList.getTask(2);

        // Removing a task
        todoList.removeTask(3);

        // Listing tasks
        List<Task> tasks = todoList.listTasks("work", null, null);
        for (Task task : tasks) {
            System.out.println("Task ID: " + task.getTaskId() + ", Description: " + task.getDescription());
        }

        // Getting statistics
        Map<String, Integer> stats = todoList.getStatistics(null, null);
        System.out.println("Statistics: " + stats);

        // Getting activity log
        List<String> logs = todoList.getActivityLog(null, null);
        for (String log : logs) {
            System.out.println("Log: " + log);
        }
    }
}
