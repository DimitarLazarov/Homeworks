
public class Task11 {
	/*
	 * Да се създаде метод, който отпечатва масив в конзолата. 
	 */
	
	public static void main(String[] args) {
		
		int[] arr = {12,3,21,5,4,16,416,5763,24,54};
		printArray(arr);
	}
	
	static void printArray(int array[]) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.print(array[i] + "]");
			}
			else {
				System.out.print(array[i] + ", ");
			}
		}
	}
}
