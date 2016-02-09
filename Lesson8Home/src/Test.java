
public class Test {
	
	public static void main(String[] args) {
		int number = cybic(15);
		System.out.println(number);
	}
	
	static int cybic(int number) {
		for (int i = 1; i < number; i++) {
			if (i * i * i == number) {
				return i;
			}
		}
		return -1;
	}
}
