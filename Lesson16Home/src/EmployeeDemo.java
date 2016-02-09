
public class EmployeeDemo {

	public static void main(String[] args) {
		
		Task task1 = new Task("clean dishes", 5);
		Task task2 = new Task("build little house", 8);
		Task task3 = new Task("broke windows", 2);
		
		Employee pesho = new Employee("Pesho");
		Employee gosho = new Employee("Gosho");
		Employee ivan = new Employee("Ivan");
		
		gosho.setHoursLeft(8);
		pesho.setHoursLeft(6);
		ivan.setHoursLeft(2);
		
		pesho.work();
		pesho.setTask(task1);
		pesho.work();
		pesho.showReport();
	}
}
