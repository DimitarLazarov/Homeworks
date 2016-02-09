import java.util.Scanner;

public class Task9 {
	/*
	 * Да се състави програма, чрез която по въведен низ съдържащ букви, 
	 * цифри, знак минус '-' се извежда сборът на въведените числа като се 
	 * отчита знакът '-' пред съответното число.
	 */

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Въведете низ съдържащ букви, цифри или знак минус");
		String text = scanner.nextLine();
		int sum = 0;
		int number = 0;
		int dec = 1;
		for (int i = text.length() - 1; i >= 0; i--) {
			if (text.codePointAt(i) >= 48 && text.codePointAt(i) <= 57) {
				while(text.codePointAt(i) >= 48 && text.codePointAt(i) <= 57 || text.charAt(i) == '-') {
					if (text.charAt(i) == '-') {
						number = number * -1;
						break;
					}
					number = number +  ((text.codePointAt(i) - 48) * dec);
					if (i > 0){
					i--;
					}
					else {
						break;
					}
					dec *= 10;
					
				}
				System.out.println(number);
				sum = sum + number;
				dec = 1;
				number = 0;
			}
		}
		System.out.println("Сумата е " + sum);
	}
}
