package by.htp.les07.main;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task19 {

	public static void main(String[] args) {

		int[][] mas = new int[5][5];
		System.out.println();
		boolean L = true;
		for (int i = 0; i < mas.length; ++i) {
			for (int j = 0; j < mas[0].length; ++j) {
				L = (j >= i && j + i < mas[0].length) || (j <= i && j + i >= mas[0].length - 1);
				if (L == true)
					mas[i][j] = 1;
				else
					mas[i][j] = 0;
				if (i == j)
					mas[i][j] = 1;
			}
		}
		for (int i = 0; i < mas[0].length; i++) {
			for (int j = 0; j < mas[0].length; j++) {
				System.out.printf("%3d", mas[i][j]);
			}
			System.out.println();
		}
	}
}
