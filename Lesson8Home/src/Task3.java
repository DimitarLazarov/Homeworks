import java.util.Scanner;

public class Task3 {
	/*
	 * Да се състави програма, чрез която се въвеждат последователно
	 * две редици от символи без интервали. 
	 * Програмата да извежда съобщение за резултата от сравнението им по позиции
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Въведете редица от символи без интервали");
		String text1 = scanner.nextLine();
		System.out.println("Въведете редица от символи без интервали");
		String text2 = scanner.nextLine();
		
		if (text1.length() == text2.length()) {
			System.out.println("Двата низа са с равна дължина");
			System.out.println("Разлика по позиции:");
			boolean differnce = false;
			for (int i = 0; i < text1.length(); i++) {
				if (text1.charAt(i) != text2.charAt(i)) {
					differnce = true;
					System.out.println((i+1) + " " + text1.charAt(i) + ":" + text2.charAt(i));
				}
			}
			if (!differnce) {
				System.out.println("Няма разлики");
			}
		}
		else if (text1.length() > text2.length()) {
			System.out.println("Дължината на първия е по-голяма от дължината на втория");
		}
		else {
			System.out.println("Дължината на втория е по-голяма от дължината на първия");
		}
	}
}
