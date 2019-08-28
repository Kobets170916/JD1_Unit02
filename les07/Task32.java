package by.htp.les07.main;

// Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class Task32 {

	public static void main(String[] args) {

		int[][] mas = new int[5][6];
		int i = 0, j = 0;
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[0].length; j++) {
				mas[i][j] = (int) (Math.random() * 10);

				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for (i = 0; i < mas.length; i++) {
			for (int k = mas[0].length - 1; k >= 0; k--) {
				for (j = 0; j < k; j++) {
					if (i % 2 != 0) {
						if (mas[i][j] > mas[i][j + 1]) {
							int buf = mas[i][j];
							mas[i][j] = mas[i][j + 1];
							mas[i][j + 1] = buf;
						}
					} else {
						if (mas[i][j] < mas[i][j + 1]) {
							int buf = mas[i][j];
							mas[i][j] = mas[i][j + 1];
							mas[i][j + 1] = buf;
						}
					}
				}
			}
		}
		System.out.println();
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[0].length; j++) {
				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}
	}
}
