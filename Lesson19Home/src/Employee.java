
public class Employee {

	private String name;
	private Task task;
	private int hoursLeft;
	private static AllWork allwork;

	public Employee(String name) {
		setName(name);
	}

	public Employee(String name, AllWork allwork) {
		setName(name);
		setAllWork(allwork);
	}

	public void setAllWork(AllWork allwork) {
		if (allwork != null) {
			Employee.allwork = allwork;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && name != "") {
			this.name = name;
		} else {
			this.name = "Unnamed employee";
		}
	}

	public int getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		if (hoursLeft >= 0) {
			this.hoursLeft = hoursLeft;
		} else {
			this.hoursLeft = 0;
		}
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		if (task != null) {
			this.task = task;
		} else {
			task = new Task();
		}
	}

	public void work() {
		if (this.task != null) {
			System.out.println(this.getName() + " is working on " + this.task.getName());
			if (this.hoursLeft < this.task.getWorkingHours()) {
				this.task.setWorkingHours(this.task.getWorkingHours() - this.hoursLeft);
				setHoursLeft(0);
				System.out.println(this.name + " has done his work for today");
				return;
			} else {
				setHoursLeft(this.hoursLeft - this.task.getWorkingHours());
				this.task.setWorkingHours(0);
				System.out.println(this.task.getName() + " have been done by " + this.getName());
				task = allwork.getNextTask();
				if (this.task != null) {
					System.out.println(this.getName() + " is getting new task -> " + this.task.getName());
				}
				work();
			}

		} else {
			task = allwork.getNextTask();
			if (task != null) {
				System.out.println(this.getName() + " is getting new task -> " + this.task.getName());
				if (this.hoursLeft < this.task.getWorkingHours()) {
					this.task.setWorkingHours(this.task.getWorkingHours() - this.hoursLeft);
					setHoursLeft(0);
					System.out.println(this.name + " has done his work for today");
					return;
				} else {
					setHoursLeft(this.hoursLeft - this.task.getWorkingHours());
					this.task.setWorkingHours(0);
					System.out.println(this.task.getName() + " have been done by " + this.getName());
					task = allwork.getNextTask();
					work();
				}

			} else {
				System.out.println("No more tasks for " + this.getName());
				return;
			}
		}

	}

	public static void startWorkingDay(Employee[] employees) {
		for (int i = 0; i < employees.length; i++) {
			employees[i].setHoursLeft(8);
		}
	}

	public void printInfo() {
		System.out.println("Employee name: " + this.name);
		System.out.println("Employee hours left: " + this.hoursLeft);
		task.printInfo();
	}

	public void showReport() {
		this.printInfo();
	}

}
