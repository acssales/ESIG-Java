import javax.annotation.PostConstruct;
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
