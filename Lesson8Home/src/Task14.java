
public class Task14 {
	/*
	 * Да се състави метод, който приема за стойност число N
	 * и връща стойността на N! (N факториел).
	 */
	
	public static void main(String[] args) {
		
		int n = 5;
		System.out.println(factiorial(n));
	}
	
	static int factiorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}
}
