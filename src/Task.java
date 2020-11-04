import javax.faces.bean.ManagedBean;

@ManagedBean
public class Task {

	private String todo;
	private String dueDate;

	public Task() {
	}

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
		if (dueDate != null) {
			TaskList.setMyTasks(this);
		}
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
		if (todo != null) {
			TaskList.setMyTasks(this);
		}
	}

}
