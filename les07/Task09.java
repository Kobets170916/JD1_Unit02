package by.htp.les07.main;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Task09 {

	public static void main(String[] args) {

		int n = 5;
		int[][] mas1 = new int[n][n];
		int i = 0, j = 0;
		for (i = 0; i < mas1.length; i++) {
			for (j = 0; j < mas1[0].length; j++) {
				mas1[i][j] = (int) (Math.random() * 10);
			}
		}

		for (i = 0; i < mas1.length; i++) {
			System.out.print("mas1[" + i + "]" + "[" + i + "]" + " = " + mas1[i][i] + " ");
			System.out.println();
		}
		System.out.println();

	}

}
