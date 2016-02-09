
public class AllWork {

	private Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnassingendTask;

	public AllWork() {
		tasks = new Task[10];
		freePlacesForTasks = 10;
		currentUnassingendTask = 0;
	}

	public void addTask(Task task) {
		if (freePlacesForTasks > 0) {
			tasks[tasks.length - freePlacesForTasks] = task;
			freePlacesForTasks--;
		} else {
			System.out.println("No more free places for new tasks");
		}
	}

	public Task getNextTask() {
		if (currentUnassingendTask < 9) {
			if (tasks[currentUnassingendTask] != null) {
				currentUnassingendTask++;
				return tasks[currentUnassingendTask - 1];
			} else
				return null;
		} else
			return null;
	}

	public boolean isAllWorkDone() {
		for (int i = 0; i < tasks.length; i++) {
			if (tasks[i] != null) {
				if (tasks[i].getWorkingHours() != 0) {
					return false;
				}
			}
		}
		return true;
	}
}
