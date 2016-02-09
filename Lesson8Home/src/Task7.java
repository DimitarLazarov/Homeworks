import java.util.Scanner;

public class Task7 {
	/*
	 * Да се състави програма, която чете набор от думи разделени с интервал. 
	 * Като резултат да се извеждат броя на въведените думи, както и 
	 * броя знаци в най-дългата дума.
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Въведете изречение");
		String sentence = scanner.nextLine();
		int logestWordSymbols = 0;
		int allWords = 1;
		int counter = 0;
		for (int i = 1; i < sentence.length(); i++) {
			counter++;
			if (counter > logestWordSymbols) {
				logestWordSymbols = counter;
			}
			if ((sentence.charAt(i)==' ' ) && (sentence.charAt(i) != sentence.charAt(i - 1))) {
				allWords++;
				counter = 0;
			}
			if (sentence.charAt(i) == sentence.charAt(i - 1)) {
				counter = 0;
			}
		}
		
		System.out.println(allWords + " думи, най-дългата е " + logestWordSymbols + " символа" );
	}
}
