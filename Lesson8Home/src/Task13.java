
public class Task13 {
	
	/*
	 * Да се създаде метод, който приема два масива от числа и връща
	 * масив, съдържащ всички елементи на подадените масиви, като в 
	 * първата част на масива са елементите на първия подаден масив, 
	 * а във втората част – тези на втория подаден масив. 
	 */
	
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {5,6,7};
		int[] arr = transformArrays(arr1, arr2);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	static int[] transformArrays(int[] array1, int[] array2) {
		int[] arrayToReturn = new int[array1.length + array2.length];
		for (int i = 0; i < array1.length; i++) {
			arrayToReturn[i] = array1[i];
		}
		for (int i = 0; i < array2.length; i++) {
			arrayToReturn[array1.length + i] = array2[i];
		}
		
		return arrayToReturn;
	}
}
