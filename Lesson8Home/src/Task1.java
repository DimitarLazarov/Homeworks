import java.util.Scanner;

public class Task1 {
	/*
	 * �� �� ������� ��������, ���� ����� �� �������� ��� ���� ���������
	 * �� 40 ������ � ����� �����.
	 * ���� �������� �� ������ �� �� �������� �������� ���� � ������
	 *  � ���� � ����� �����.
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int length = 0;
		String text1;
		String text2;
		do {
			System.out.println("�������� ��� 1");
			text1 = scanner.nextLine();
			length = text1.length();
			if(length > 40) {
				System.out.println("��������� �� ��� 1 � ��-������ �� 40.");
			}
		}
		while(length > 40);
		do {
			System.out.println("�������� ��� 2");
			text2 = scanner.nextLine();
			length = text2.length();
			if(length > 40) {
				System.out.println("��������� �� ��� 2 � ��-������ �� 40.");
			}
		}
		while(length > 40);
		System.out.println(text1.toLowerCase());
		System.out.println(text1.toUpperCase());
		System.out.println(text2.toLowerCase());
		System.out.println(text2.toUpperCase());
		
	}
}
