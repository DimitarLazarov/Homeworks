
public class College {

	public static void main(String[] args) {
		
		Student petko = new Student("petko", "KN", 3.76, 2, 20, false, 110);
		Student goshko = new Student("goshko", "KN", 4.26, 1, 19, false, 180);
		Student ivan = new Student("ivan", "SI", 5.12, 3, 21, false, 300);
		
		ivan.printInfo();
		petko.printInfo();
		goshko.receiveScholarShip(4.00, 76.4);
		goshko.printInfo();
		
		StudentGroup knGroup = new StudentGroup("KN");
		knGroup.addStudent(petko);
		knGroup.addStudent(goshko);
		knGroup.printStudentInGroup();
		knGroup.addStudent(ivan);
		System.out.println(knGroup.theBestStudent());
	}
}
