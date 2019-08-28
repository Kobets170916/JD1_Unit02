package by.htp.les07.main;

//Получить квадратную матрицу порядка n

public class Task25 {

	public static void main(String[] args) {

		int n = 6;

		int[][] mas = new int[n][n];
		int k = 1;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[0].length; j++) {
				mas[i][j] = k;
				k++;
			}
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.println();
			for (int j = 0; j < mas[0].length; j++) {
				System.out.printf("%4d", mas[i][j]);
			}
		}
	}
}