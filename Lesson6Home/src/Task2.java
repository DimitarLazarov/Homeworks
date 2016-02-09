import java.util.Scanner;

public class Task2 {
	/*
	 * Имате квадратен двумерен масив от естествени числа, чий то стойности
	 * се въвеждат от конзолата. Да се отпечатат диагоналите на масива.
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Въведете големина на двумерния квадратен масив");
		int size = scanner.nextInt();
		int[][] array2d = new int[size][size];
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {
				System.out.println("Въвдете стойност в клетка " + "[" + i + "," + j + "]");
				array2d[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Главния диагонал е ");
		for (int i = 0; i < array2d.length; i++) {
			System.out.print(array2d[i][i] + " ");
		}
		System.out.println();
		System.out.println("Вторичния диагонал е ");
		for (int i = 0; i < array2d.length; i++) {
			System.out.print(array2d[i][array2d.length - i -1] + " ");
		}
	}
}
