
public class Task14 {
	/*
	 * �� �� ������� �����, ����� ������ �� �������� ����� N
	 * � ����� ���������� �� N! (N ���������).
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
