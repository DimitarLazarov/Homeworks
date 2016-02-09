import java.util.Scanner;

public class Task5 {
	/*
	 * Да се състави програма, чрез която се въвеждат 2 редици от знаци 
	 * (думи). Ако в двете редици участва един и същи знак, да се изведе на екрана 
	 * първата редица хоризонтално, а втората вертикално, така че да се пресичат в общия си 
	 * знак. Ако редиците нямат общ знак да се изведе само уведомително съобщение.
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Въведете дума 1");
		String word1 = scanner.nextLine();
		System.out.println("Въведете дума 2");
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
			System.out.println("Двете думи нямат общ символ.");
		}
		
		
		
		
		
	}
}
