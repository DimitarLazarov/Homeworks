
public class Task4 {
	/*
	 * ����� ������������� �������� ��������� �� �������� � �������� 
	 * ����� - ���������� �����.
	 * �� �� ������� ��������, ���� ����� �� �������� ����������� �� 
	 * ���������� � �������� ����� ���� ���������� �� �� +90 �������.
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
