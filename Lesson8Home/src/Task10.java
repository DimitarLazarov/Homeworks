import java.util.Scanner;

public class Task10 {
	/*
	 * �� �� ������� ��������, ����� �� ����� ��� ����� ����, 
	 * ���������, �� ����� �� �������� ���� ��� ����� ��� �� ������ 
	 * �� ASCII ��������� � ���������� ������� 5 � � ������� ������������� ������.
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������� �����");
		String text = scanner.nextLine();
		int five = 5;
		StringBuilder newText = new StringBuilder(text);
		for (int i = 0; i < text.length(); i++) {
			newText.setCharAt(i, (char)(text.charAt(i) + five));
		}
		
		text = newText.toString();
		System.out.println(text);
	}
}
