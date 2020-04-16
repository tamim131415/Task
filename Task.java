package designpattern;
import java.util.Date;

public class Task extends Date {
	private int id; // getter
	private String taskName; //getter, setter maximum length of task name must be < 10
	private boolean isDone; // getter, setter
	private Date taskCreated, taskCompleted, deadline; // getter, setter
	private static int autoIncrementingId = 1;

	public Task(String taskName, Date deadline) {
		this.taskName = taskName;
		id = autoIncrementingId++;
		this.deadline = deadline;
		isDone = false;
		taskCreated = new Date();
	}
	// write the getters and setters

    public int getId() {
        return id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public boolean isIsDone() {
        return isDone;
    }

    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }

    public Date getTaskCreated() {
        return taskCreated;
    }

    public void setTaskCreated(Date taskCreated) {
        this.taskCreated = taskCreated;
    }

    public Date getTaskCompleted() {
        return taskCompleted;
    }

    public void setTaskCompleted(Date taskCompleted) {
        this.taskCompleted = taskCompleted;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }        
}
