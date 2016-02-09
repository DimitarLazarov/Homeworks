
public class Task12 {
	
	/*
	 * Да се създаде метод, който приема за входни данни число N и
	 * връща масив от числа с дължина N, който съдържа всички числа 
	 * от 1 до N.
	 */
	
	public static void main(String[] args) {
		
		int[] arr = createArray(10);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	static int[] createArray(int capacity) {
		int[] array = new int[capacity];
		for (int i = 0; i < array.length; i++) {
			array[i] = i+1;
		}
		return array;
	}
}
