package by.htp.les07.main;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task17 {

	public static void main(String[] args) {

		int m = 5, n = 5;
		int[][] mas = new int[m][n];
		int i = 0, j = 0;
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[0].length; j++) {
				mas[0][j] = 1;
				mas[i][0] = 1;
				mas[mas[0].length - 1][j] = 1;
				mas[i][mas[0].length - 1] = 1;
			}
		}

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[0].length; j++) {
				System.out.printf("%3d", mas[i][j]);
			}
			System.out.println();
		}
	}
}
