package by.htp.les07.main;

// Найдите произведение двух матриц

public class Task39 {

	public static void main(String[] args) {

		int[][] mas = new int[5][7];
		int[][] mas1 = new int[7][5];
		int i = 0, j = 0;
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[0].length; j++) {
				mas[i][j] = (int) (Math.random() * 10);
				System.out.printf("%3d", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for (i = 0; i < mas[0].length; i++) {
			for (j = 0; j < mas.length; j++) {
				mas1[i][j] = (int) (Math.random() * 10);
				System.out.printf("%3d", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(" произведение:");
		int[][] c = new int[5][5];
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas.length; j++) {
				for (int r = 0; r < mas[0].length; r++) {
					c[i][j] += mas[i][r] * mas1[r][j];
				}
			}
		}
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas.length; j++) {
				System.out.printf("%3d", mas[i][j]);
			}
			System.out.println();
		}
	}
}