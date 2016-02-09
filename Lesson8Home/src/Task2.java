import java.util.Scanner;

public class Task2 {
	/*
	 *  Да се състави програма, чрез която от клавиатурата се въвеждат
	 *  последователно две думи с дължина 10-20 знака. 
	 *  Програмата да размени първите им 5 знака и да изведе дължината
	 *   на по-дългата, както и новото им съдържание.
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int length = 0;
		String text1;
		String text2;
		do {
			System.out.println("Въведете първата дума");
			text1 = scanner.nextLine();
			length = text1.length();
			if(length < 10 || length > 20) {
				System.out.println("Дължината на думата е прекалено къса или прекалено дълга.");
			}
		}
		while(length < 10 || length > 20);
		do {
			System.out.println("Въведете втората дума");
			text2 = scanner.nextLine();
			length = text2.length();
			if(length < 10 || length > 20) {
				System.out.println("Дължината на думата е прекалено къса или прекалено дълга.");
			}
		}
		while(length < 10 || length > 20);
		StringBuilder newText1 = new StringBuilder(text1);
		StringBuilder newText2 = new StringBuilder(text2);
		for (int i = 0; i < 5; i++) {
			char tmp1 = newText1.charAt(i);
			char tmp2 = newText2.charAt(i);
			newText1.setCharAt(i, tmp2);
			newText2.setCharAt(i, tmp1);
		}
		System.out.println(newText1);
		text1 = newText1.toString();
		text2 = newText2.toString();
		System.out.println(text1.length() > text2.length() ? text1.length() + " " + text1 : text2.length() + " " + text2);
	}
}
