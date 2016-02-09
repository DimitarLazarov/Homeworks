
public class EmployeeDemo {

	public static void main(String[] args) {
		
		AllWork allwork = new AllWork();
		Task task1 = new Task("clean dishes", 35);
		Task task2 = new Task("build little house", 68);
		Task task3 = new Task("broke windows", 32);
		Task task4 = new Task("clean windows", 38);
		Task task5 = new Task("broke little house", 19);
		Task task6 = new Task("make a new car", 97);
		Task task7 = new Task("build a scyscraper", 123);
		Task task8 = new Task("teach someone", 31);
		Task task9 = new Task("finish ITTalents", 99);
		
		allwork.addTask(task1);
		allwork.addTask(task2);
		allwork.addTask(task3);
		allwork.addTask(task4);
		allwork.addTask(task5);
		allwork.addTask(task6);
		allwork.addTask(task7);
		allwork.addTask(task8);
		allwork.addTask(task9);
		Employee pesho = new Employee("Pesho", allwork);
		Employee gosho = new Employee("Gosho");
		Employee ivan = new Employee("Ivan");
		Employee[] employees = new Employee[3];
		employees[0] = pesho;
		employees[1] = gosho;
		employees[2] = ivan;
		int counter = 0;
		while(true) {
			counter++;
			if(allwork.isAllWorkDone()){
				System.out.println("------------------------------------");
				System.out.println("Congratulations!!!");
				System.out.println("All work is done after " + counter + " days");
				System.out.println("------------------------------------");
				break;
			}
			else {
				Employee.startWorkingDay(employees);
				System.out.println("-----------------------------------");
				System.out.println("Working day number " + counter);
				for (int i = 0; i < employees.length; i++) {
					employees[i].work();
				}
			}				
		}

	}
}
