
public class Task3 {
	/*
	 * Имате двумерен масив от числа, чийто стойности са въведени 
	 * предварително. Да се отпечатат сумата на елементите на масива, 
	 * както и средноаритметичното на тези числа.
	 */
	
	public static void main(String[] args) {
		
		int[][] array2d = {
				{ 48,72,13,14,15 },
				{ 21,22,53,24,75 },
				{ 31,57,33,34,35 },
				{ 41,95,43,44,45 },
				{ 59,52,53,54,55 },
				{ 61,69,63,64,65 }
						  };
		int sum = 0;
		int count = 0;
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {
				sum = sum + array2d[i][j];
				count++;
			}
		}
		double avg = (double)sum / count;
		System.out.println("Сумата на елементите на масива е " + sum);
		System.out.println("Средноаритметичното на масава е " + avg);
	}
}
