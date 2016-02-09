
public class Task7 {
	/*
	 * Имате предварително въведени стойности от естествени числа,  
	 * въведени в квадратна таблица с размери 6 реда и 6 колони.
	 * Да се състави програма , чрез която се намира сумата на всички 
	 * елементи, чиято сума на индекси за ред и колона е четно число. 
	 * Програмата да извежда формираните суми за всеки отделен ред на 
	 * квадратната таблица, както и общата сума от тези елементи.
	 * Да се използва само един цикъл 
	 */
	
	public static void main(String[] args) {
		
		int[][] array2d = {
				{11,12,13,14,15,16},
				{21,22,23,24,25,26},
				{31,32,33,34,35,36},
				{41,42,43,44,45,46},
				{51,52,53,54,55,56},
				{61,62,63,64,65,66}
			  };
		int sumOfEven = 0;
		int sumOfRow = 0;
		int i = 0;
		int j = 0;
		while(i < array2d.length) {
				if ((i + j) % 2 == 0) {
				System.out.print(array2d[i][j] + ", ");
				sumOfRow = sumOfRow + array2d[i][j];
			}
			j++;
			if ( j == array2d[i].length ) {
				i++;
				System.out.println("Сума на елементите за реда: " + sumOfRow);
				j = 0;
				sumOfEven = sumOfEven + sumOfRow;
				sumOfRow = 0;
			}

		}
		System.out.println("Сума на елементите : " + sumOfEven);
		/*
		for (int i = 0; i < array2d.length; i++) {
			int sumOfRow = 0;
			for (int j = 0; j < array2d[i].length; j++) {
				if ((i + j) % 2 == 0) {
					System.out.print(array2d[i][j] + ", ");
					sumOfRow = sumOfRow + array2d[i][j];
				}
			}
			sumOfEven = sumOfEven + sumOfRow;
			System.out.println("Сума на елементите за реда: " + sumOfRow);
			sumOfRow = 0;
		}
		System.out.println("Сума на елементите : " + sumOfEven);
		*/
	}
}
