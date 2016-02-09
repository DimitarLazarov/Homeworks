import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Scheduler {

	private Queue<Task> tasks = new ArrayBlockingQueue<Task>(10);
	
	public void push(Task task) {
		tasks.add(task);
	}
	
	public void startWork() {
		while (!tasks.isEmpty()) {
			Task task = tasks.remove();
			task.doWork();
		}
	}
	
	
}
