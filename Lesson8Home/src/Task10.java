import java.util.Scanner;

public class Task10 {
	/*
	 * Да се състави програма, която по даден низ връща друг, 
	 * символите, на който са получени като към всеки код на символ 
	 * от ASCII таблицата е добавеното числото 5 и е записан новополучения символ.
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Въведете текст");
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
