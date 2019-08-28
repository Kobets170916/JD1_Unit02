package by.htp.les07.main;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task13 {

	public static void main(String[] args) {
		int n = 4;
		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			int k = 0;
			if ((i % 2) == 0) {
				for (int j = 0; j < mas[0].length; j++) {
					mas[i][j] = k + 1;
					k++;
				}
			} else {
				for (int j = (mas[0].length - 1); j >= 0; j--) {
					mas[i][j] = k + 1;
					k++;
				}
			}
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.println();
			for (int j = 0; j < mas[0].length; j++) {
				System.out.printf("%3d", mas[i][j]);
			}
		}
	}
}
