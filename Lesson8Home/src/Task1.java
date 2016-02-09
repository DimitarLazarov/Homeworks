import java.util.Scanner;

public class Task1 {
	/*
	 * Да се състави програма, чрез която се въвеждат два низа съдържащи
	 * до 40 главни и малки букви.
	 * Като резултат на екрана да се извеждат низовете само с главни
	 *  и само с малки букви.
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int length = 0;
		String text1;
		String text2;
		do {
			System.out.println("Въведете низ 1");
			text1 = scanner.nextLine();
			length = text1.length();
			if(length > 40) {
				System.out.println("Дължината на низ 1 е по-голяма от 40.");
			}
		}
		while(length > 40);
		do {
			System.out.println("Въведете низ 2");
			text2 = scanner.nextLine();
			length = text2.length();
			if(length > 40) {
				System.out.println("Дължината на низ 2 е по-голяма от 40.");
			}
		}
		while(length > 40);
		System.out.println(text1.toLowerCase());
		System.out.println(text1.toUpperCase());
		System.out.println(text2.toLowerCase());
		System.out.println(text2.toUpperCase());
		
	}
}
