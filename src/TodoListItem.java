
public class TodoListItem {
	public String description;
	public int priority;
	
	public boolean done = false;
	public TodoListItem(String string, int i) {
		this.description = string;
		this.priority = i;
		
		
	}

	public String getDescription() {
		return description;
	}

	public int getPriority() {
		return priority;
	}

	public boolean isDone() {
		return done;
	
	}

	public void markDone() {
		done = true;
		
	}

}
