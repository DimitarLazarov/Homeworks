import java.util.Scanner;

public class Task6 {
	/*
	 * �� �� ������� ��������, ���� �����  �� ������� ��������� � ������� ����.
	 * ���� �������� �� ������ �� �� ������� ����� �����, �� ����� ������� 
	 * ���� �� ������� � ������ �����, � ���������� � ����� �� �� �����.
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������� ���������");
		String sentence = scanner.nextLine();
		sentence = sentence.toLowerCase();
		StringBuilder newSentence = new StringBuilder(sentence);
		newSentence.setCharAt(0, (char)(sentence.charAt(0) - 32));
		for (int i = 0; i < newSentence.length() - 1; i++) {
			if (newSentence.charAt(i) == ' ') {
				newSentence.setCharAt(i+1, (char) (newSentence.charAt(i+1) - 32));
			}
		}
		sentence = newSentence.toString();
		System.out.println("����������� ���� ��������������� � ");
		System.out.println(sentence);
	
	}
}
