
public class Person {

	private String name;
	private int age;
	private boolean isMale;

	public Person(String name, int age, boolean isMale) {
		this.name = name;
		this.age = age;
		this.isMale = isMale;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		} else {
			this.name = "Unnamed";
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			this.age = 10;
		}
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	
	public void showPersonInfo(){
		System.out.print(this.name + "  " + this.age + "  ");
		System.out.println(this.isMale ? "man" : "girl");
	}
}
