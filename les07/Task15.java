package by.htp.les07.main;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task15 {

	public static void main(String[] args) {

		int[][] mas = new int[4][4];
		int i = 0, j = 0, k = mas[0].length;
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[0].length; j++) {
				if (i == j) {
					mas[i][j] = k;
					k--;
				}
				System.out.printf("%3d", mas[i][j]);
			}
			System.out.println();
		}
	}
}
