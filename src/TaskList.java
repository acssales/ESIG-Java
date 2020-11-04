import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TaskList {
	private static List<Task> myTasks = new ArrayList<Task>();

	public TaskList () {}
	
	public static void setMyTasks(Task t) {
		myTasks.add(t);
	}
	
	public List<Task> getMyTasks() {
		return myTasks;
	}
	
}
