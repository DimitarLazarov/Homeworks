import java.util.Scanner;

public class Task6 {
	/*
	 * Да се състави програма, чрез която  се въвежда изречение с отделни думи.
	 * Като резултат на екрана да се извежда същия текст, но всяка отделна 
	 * дума да започва с главна буква, а следващите я букви да са малки.
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Въведете изречение");
		String sentence = scanner.nextLine();
		sentence = sentence.toLowerCase();
		StringBuilder newSentence = new StringBuilder(sentence);
		newSentence.setCharAt(0, (char)(sentence.charAt(0) - 32));
		for (int i = 0; i < newSentence.length() - 1; i++) {
			if (newSentence.charAt(i) == ' ') {
				newSentence.setCharAt(i+1, (char) (newSentence.charAt(i+1) - 32));
			}
		}
		sentence = newSentence.toString();
		System.out.println("Изречението след преобразуването е ");
		System.out.println(sentence);
	
	}
}
