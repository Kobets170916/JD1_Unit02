package by.htp.les07.main;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task14 {

	public static void main(String[] args) {

		int n = 4;
		int[][] mas = new int[n][n];
		int i = 0, j = 0;
		for (i = 0; i < mas.length; i++) {
			for (j = mas.length - 1; j >= 0; j--) {
				if (i == j)
					mas[i][j] = j + 1;
				System.out.printf("%3d", mas[i][j]);
			}
			System.out.println();
		}
	}
}
