
public class Task1 {
	
	/*
	 *  Имате двумерен масив 6х5 от естествени числа, чийто стойности са 
		въведени предварително.
		Да се състави програма, чрез която се извеждат елементите от масива 
		с най-малката и най-голямата стойност.
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
		int max = array2d[0][0];
		int min = array2d[0][0];
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {
				if (max < array2d[i][j]) {
					max = array2d[i][j];
				}
				if (min > array2d[i][j]) {
					min = array2d[i][j];
				}
			}
		}
		System.out.println("Най-голямата стойност е " + max);
		System.out.println("Най-малката стойност е " + min);
	}
}

