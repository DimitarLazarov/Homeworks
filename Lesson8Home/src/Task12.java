
public class Task12 {
	
	/*
	 * �� �� ������� �����, ����� ������ �� ������ ����� ����� N �
	 * ����� ����� �� ����� � ������� N, ����� ������� ������ ����� 
	 * �� 1 �� N.
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
