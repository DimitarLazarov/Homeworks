
public class Demo {

	public static void main(String[] args) {

		Person peshko = new Person("Peshko", 19, true);
		Person ivanka = new Person("Ivanka", 20, false);
		Employee dancho = new Employee("Dancho", 18, true, 40);
		Employee dragancho = new Employee("Dragancho", 21, true, 50);
		Student mitko = new Student("Mitko", 21, true, 5.5);
		Student geri = new Student("Geri", 19, false, 4.6);

		Person[] people = new Person[10];
		people[0] = peshko;
		people[1] = ivanka;
		people[2] = dancho;
		people[3] = dragancho;
		people[4] = mitko;
		people[5] = geri;

		for (int i = 0; i < people.length; i++) {
			if (people[i] instanceof Employee) {
				((Employee) people[i]).showEmployeeInfo();
			} else if (people[i] instanceof Student) {
				((Student) people[i]).showStudentInfo();
			} else if (people[i] instanceof Person) {
				people[i].showPersonInfo();
			}
		}
		
		System.out.println(dancho.calculateOvertime(12));
	}
}
