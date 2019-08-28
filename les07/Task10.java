package by.htp.les07.main;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class Task10 {

	public static void main(String[] args) {
		
		int n = 3;
		int m = 5;
		int k = 4;
		int p = 6;
		
		int[][] mas1 = new int[n][m];
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[0].length; j++) {
				mas1[i][j] = (int) (Math.random() * 10);
			}
		}
		
		for (int i = 0; i < mas1.length; i++) {
			System.out.println();
			for (int j = 0; j < mas1[0].length; j++) {
				System.out.print("mas1[" + i + "]" + "[" + j + "]" + " = " + mas1[i][j] + " ");
			}
		}
		
		System.out.println();
		System.out.println();
		for (int j = 0; j < mas1[0].length; j++) {
			System.out.print("mas1[" + k + "]" + "[" + j + "]" + " = " + mas1[k][j] + " ");
		}
		
		System.out.println();
		for (int i = 0; i < mas1.length; i++) {
			System.out.print("mas1[" + i + "]" + "[" + p + "]" + " = " + mas1[i][p] + " ");
			System.out.println();

		}

	}

}