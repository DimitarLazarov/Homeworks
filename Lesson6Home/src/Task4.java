
public class Task4 {
	/*
	 * Имате предварително въведени стойности на елементи в двумерен 
	 * масив - естествени числа.
	 * Да се състави програма, чрез която се извеждат стойностите на 
	 * елементите в двумерен масив след обръщането му на +90 градуса.
	 */
	public static void main(String[] args) {
		int[][] array2d = {
							{1,2,3,4},
							{5,6,7,8},
							{8,10,11,12},
							{13,14,15,16}
					 	  };
		for (int i = array2d.length - 1; i >= 0; i--) {
			for (int j = 0; j < array2d[i].length; j++) {
				System.out.print(array2d[j][i] + " ");
			}
			System.out.println();
		}
	}
}
