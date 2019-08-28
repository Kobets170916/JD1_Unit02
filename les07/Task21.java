package by.htp.les07.main;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task21 {

	public static void main(String[] args) {

		int[][] mas = new int[5][5];
		System.out.println();
		for (int i = 0; i < mas.length; ++i) {
			for (int j = 0; j <= i; ++j) {
				mas[i][j] = mas[0].length - i;
			}

		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[0].length; j++) {
				System.out.printf("%3d", mas[i][j]);
			}
			System.out.println();
		}
	}
}