import java.util.Scanner;

public class Task5 {
	/*
	 * �� �� ������� ��������, ���� ����� �� �������� 2 ������ �� ����� 
	 * (����). ��� � ����� ������ ������� ���� � ���� ����, �� �� ������ �� ������ 
	 * ������� ������ ������������, � ������� ����������, ���� �� �� �� �������� � ����� �� 
	 * ����. ��� �������� ����� ��� ���� �� �� ������ ���� ������������ ���������.
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������� ���� 1");
		String word1 = scanner.nextLine();
		System.out.println("�������� ���� 2");
		String word2 = scanner.nextLine();
		boolean equalSymbol = false;
		int firstIndex = 0;
		int secondIndex = 0;
		for (int i = 0; i < word2.length(); i++) {
			for (int j = 0; j < word1.length(); j++) {
				if (word2.charAt(i) == word1.charAt(j)) {
					firstIndex = j;
					secondIndex = i;
					equalSymbol = true;
				}
				
			}
			if (equalSymbol) {
				break;
			}
		}
		int shifts = secondIndex;
		if (equalSymbol) {
			for (int i = 0; i < word1.length(); i++) {
					if (firstIndex == i) {
						System.out.println(word2);
					}
					else {
						while(shifts > 0) {
							System.out.print(" ");
							shifts--;
						}
						shifts = secondIndex;
						System.out.println(word1.charAt(i));
					}
			}
		}
		else {
			System.out.println("����� ���� ����� ��� ������.");
		}
		
		
		
		
		
	}
}
