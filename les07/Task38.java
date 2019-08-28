package by.htp.les07.main;

//Найдите сумму двух матриц

public class Task38 {

	public static void main(String[] args) {

		int m = 5;
		int n = 6;
		int[][] mas = new int[m][n];
		int[][] mas1 = new int[m][n];
		int i = 0, j = 0;
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[0].length; j++) {
				mas[i][j] = (int) (Math.random() * 10);
				System.out.printf("%3d", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[0].length; j++) {
				mas1[i][j] = (int) (Math.random() * 10);
				System.out.printf("%3d", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("суммa:");
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[0].length; j++) {
				mas1[i][j] += mas[i][j];
			}
		}
		System.out.println();
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[0].length; j++) {
				System.out.printf("%3d", mas[i][j]);
			}
			System.out.println();
		}
	}
}
