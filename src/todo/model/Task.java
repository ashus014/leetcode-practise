package src.todo.model;
import java.util.Date;
import java.util.List;
public class Task {
    private int taskId;
    private String description;
    private Date deadline;
    private List<String> tags;
    private boolean completed;
    private Date createdAt;
    private Date updatedAt;

    public Task(int taskId, String description, Date deadline, List<String> tags) {
        this.taskId = taskId;
        this.description = description;
        this.deadline = deadline;
        this.tags = tags;
        this.completed = false;
        this.createdAt = new Date();
        this.updatedAt = this.createdAt;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getDescription() {
        return description;
    }

    public Date getDeadline() {
        return deadline;
    }

    public List<String> getTags() {
        return tags;
    }

    public boolean isCompleted() {
        return completed;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setDescription(String description) {
        this.description = description;
        this.updatedAt = new Date();
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
        this.updatedAt = new Date();
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
        this.updatedAt = new Date();
    }

    public void markCompleted() {
        this.completed = true;
        this.updatedAt = new Date();
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", description='" + description + '\'' +
                ", deadline=" + deadline +
                ", tags=" + tags +
                ", completed=" + completed +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
