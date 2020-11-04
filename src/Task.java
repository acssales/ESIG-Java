import javax.faces.bean.ManagedBean;
import javax.persistence.*;

@ManagedBean
@Entity
@Table(name = "Task")
public class Task {

	private String todo;
	private String dueDate;
	
	@Id
	@Column(name = "Task_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
	    return id;
	}
	
	public Task() {
		TaskList.setMyTasks(this);
	}

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

		
}
