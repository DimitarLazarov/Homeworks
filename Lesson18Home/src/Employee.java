
public class Employee extends Person{

	private double daySalary;
	
	public Employee(String name, int age, boolean isMale, double daySalary) {
		super(name,age,isMale);
		this.daySalary = daySalary;
	}
	
	public void showEmployeeInfo(){
		super.showPersonInfo();
		System.out.println(super.getName() + " is an employee with day salary " + this.daySalary);
	}
	
	public double calculateOvertime(double hours) {
		if (hours > 8 && super.getAge() >= 18) {
			double moneyPerHour = daySalary / 8;
			double hoursToPay = hours - 8;
			return hoursToPay * moneyPerHour * 1.5;
		}
		else {
			return 0;
		}
	}
	
}
