import java.util.Scanner;

public class Task2 {
	/*
	 * ����� ��������� �������� ����� �� ���������� �����, ��� �� ���������
	 * �� �������� �� ���������. �� �� ��������� ����������� �� ������.
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������� �������� �� ��������� ��������� �����");
		int size = scanner.nextInt();
		int[][] array2d = new int[size][size];
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {
				System.out.println("������� �������� � ������ " + "[" + i + "," + j + "]");
				array2d[i][j] = scanner.nextInt();
			}
		}
		System.out.println("������� �������� � ");
		for (int i = 0; i < array2d.length; i++) {
			System.out.print(array2d[i][i] + " ");
		}
		System.out.println();
		System.out.println("��������� �������� � ");
		for (int i = 0; i < array2d.length; i++) {
			System.out.print(array2d[i][array2d.length - i -1] + " ");
		}
	}
}
