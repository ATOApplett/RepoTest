public class ToDoItem {
    private String description;
    private boolean isDone;

    public ToDoItem(String description, boolean isDone) {
        this.description = description;
        this.isDone = isDone;
    }

    public ToDoItem(String description) {
        this(description, false);
    }

    public String getDescription() { return this.description; }

    public void setDescription(String description) { this.description = description; }

    public boolean isDone() {
        return this.isDone;
    }

    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }
}
