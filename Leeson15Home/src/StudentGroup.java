
public class StudentGroup {

	static String groupSubject;

	Student[] students;
	int freePlaces;

	public StudentGroup() {
		students = new Student[5];
		freePlaces = 5;
	}

	public StudentGroup(String groupSubject) {
		this();
		StudentGroup.groupSubject = groupSubject;
	}

	void addStudent(Student student) {
		if (StudentGroup.groupSubject.equals(student.subject) && freePlaces > 0) {
			students[students.length - freePlaces] = student;
			freePlaces--;
		} else if (freePlaces == 0) {
			System.out.println("No more places in this group");
		} else {
			System.out.println(student.name + " is not for this group");
		}
	}

	void emptyGroup() {
		students = new Student[5];
		freePlaces = 5;
	}

	String theBestStudent() {
		if (freePlaces != students.length) {
			int counter = 0;
			for (int i = 1; i < students.length - freePlaces; i++) {
				if (students[counter].grade < students[i].grade) {
					counter = i;
				}
			}
			return students[counter].name;
		} else
			return "No students in this group";
	}

	void printStudentInGroup() {
		for (int i = 0; i < students.length - freePlaces; i++) {
			students[i].printInfo();
		}
	}

}
