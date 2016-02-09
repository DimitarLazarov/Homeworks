
public class Task5 {
	/*
	 * �� �� ������� ��������, ��� ����� ������������� �� �������� 
	 * ���������� ����� � �������� ����� 4*4 ��������.
	 * ���������� �� ������� �������� �� ���������� ����� � �������������
 	 * �� ���-�������� ���� �� ������ ������ ���-�������� ���� �� ������. 
	 */
	
	public static void main(String[] args) {
		
		int[][] array2d = {
							{1,2,3,4},
							{5,6,7,8},
							{9,10,11,12},
							{13,14,15,16}
						  };
		int sumCol = 0;
		for (int i = 0; i < array2d.length; i++) {
			sumCol = sumCol + array2d[i][0];
		}
		int sumRow = 0;
		for (int i = 0; i < array2d.length; i++) {
			sumRow = sumRow + array2d[0][i];
		}
		for (int i = 1; i < array2d.length; i++) {
			int tmp = 0;
			for (int j = 0; j < array2d.length; j++) {
				tmp = tmp + array2d[j][i];
			}
			if (tmp > sumCol) {
				sumCol = tmp;
			}
		}
		for (int i = 1; i < array2d.length; i++) {
			int tmp = 0;
			for (int j = 0; j < array2d.length; j++) {
				tmp = tmp + array2d[i][j];
			}
			if (tmp > sumRow) {
				sumRow = tmp;
			}
		}
		System.out.println("���-�������� ���� �� ������ � " + sumCol);
		System.out.println("���-�������� ���� �� ������ � " + sumRow);
		System.out.println(sumCol > sumRow ? "������������ ���� �� ������ � > �� ������������ ���� �� ������"
										   : "������������ ���� �� ������ � > �� ������������ ���� �� ������");
	}
}
