import java.util.Scanner;

public class Task8 {
	/*
	 * Да се състави програма, чрез която се въвежда ред от символи (стринг, низ).
	 * Програмата да изведе на екрана дали въведения стринг е палиндром, т.е. 
	 * дали четен отляво-надясно и отдясно-наляво е един и същ.
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Въведете дума или изречение");
		String text = scanner.nextLine();
		boolean palindrome = true;
		for (int i = 0; i < text.length() / 2; i++) {
			if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
				palindrome = false;
				break;
			}
		}
		
		System.out.println(palindrome ? "Палиндром" : "Не е палиндром");
	}
}
