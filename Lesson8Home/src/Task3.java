import java.util.Scanner;

public class Task3 {
	/*
	 * �� �� ������� ��������, ���� ����� �� �������� ��������������
	 * ��� ������ �� ������� ��� ���������. 
	 * ���������� �� ������� ��������� �� ��������� �� ����������� �� �� �������
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������� ������ �� ������� ��� ���������");
		String text1 = scanner.nextLine();
		System.out.println("�������� ������ �� ������� ��� ���������");
		String text2 = scanner.nextLine();
		
		if (text1.length() == text2.length()) {
			System.out.println("����� ���� �� � ����� �������");
			System.out.println("������� �� �������:");
			boolean differnce = false;
			for (int i = 0; i < text1.length(); i++) {
				if (text1.charAt(i) != text2.charAt(i)) {
					differnce = true;
					System.out.println((i+1) + " " + text1.charAt(i) + ":" + text2.charAt(i));
				}
			}
			if (!differnce) {
				System.out.println("���� �������");
			}
		}
		else if (text1.length() > text2.length()) {
			System.out.println("��������� �� ������ � ��-������ �� ��������� �� ������");
		}
		else {
			System.out.println("��������� �� ������ � ��-������ �� ��������� �� ������");
		}
	}
}
