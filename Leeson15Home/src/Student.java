
public class Student {

	
	String name;
	String subject;
	double grade;
	int yearInCollege;
	int age;
	boolean isDegree;
	double money;
	
	Student() {
		grade = 4.0;
		money = 0;
		yearInCollege = 1;
		isDegree = false;
	}
	
	Student(String name, String subject, double grade, int yearInCollege, int age, boolean isDegree, double money) {
		this();
		this.name = name;
		this.subject = subject;
		this.grade = grade;
		this.yearInCollege = yearInCollege;
		this.age = age;
		this.isDegree = isDegree;
		this.money = money;
	}
	
	void upYear() {
		if(!isDegree) {
			yearInCollege++;
		}
		if (yearInCollege == 4) {
			isDegree = true;
		}
		
	}
	
	double receiveScholarShip(double min, double amount) {
		if (grade >= min && age < 30) {
			money += amount;
		}
		return money;
		
	}	
	
	void printInfo(){
		System.out.println(this.name + "  "  + this.grade + "  " + this.subject + "  " + this.yearInCollege + "  " + this.money);
	}
	
	
	
	
	
}
