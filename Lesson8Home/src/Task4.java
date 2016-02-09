import java.util.Scanner;

public class Task4 {
	/*
	 * Да се състави програма, чрез която по въведени трите имена на двама
	 * човека разделени със запетая, се извежда чие име има по-голям сбор
	 * от ASCII кодовете на съставящите името букви.
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Въведете две имена, разделени с запетая");
		String names = scanner.nextLine();
		int i = 0;
		StringBuilder name1 = new StringBuilder("");
		StringBuilder name2 = new StringBuilder("");
		int sum1 = 0;
		int sum2 = 0;
		while(names.charAt(i) != ',') {
			if (names.charAt(i) != ' '){
			sum1 = sum1 + names.codePointAt(i);
			}
			name1.append(names.charAt(i));
			i++;
		}
		i++;
		String lastName1 = name1.toString();
		while(i < names.length()) {
			if (names.charAt(i) != ' '){
			sum2 = sum2 + names.codePointAt(i);
			}
			name2.append(names.charAt(i));
			i++;
		}
		String lastName2 = name2.toString();
		
		System.out.println(sum1 > sum2 ? lastName1 : lastName2);
	}
}
