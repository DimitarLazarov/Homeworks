import java.util.Scanner;

public class Task8 {
	/*
	 * �� �� ������� ��������, ���� ����� �� ������� ��� �� ������� (������, ���).
	 * ���������� �� ������ �� ������ ���� ��������� ������ � ���������, �.�. 
	 * ���� ����� ������-������� � �������-������ � ���� � ���.
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������� ���� ��� ���������");
		String text = scanner.nextLine();
		boolean palindrome = true;
		for (int i = 0; i < text.length() / 2; i++) {
			if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
				palindrome = false;
				break;
			}
		}
		
		System.out.println(palindrome ? "���������" : "�� � ���������");
	}
}
