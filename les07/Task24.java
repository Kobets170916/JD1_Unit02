package by.htp.les07.main;

//Дан линейный массив x1, x2,..., xn−1, xn . Получить действительную квадратную матрицу порядка n:

public class Task24 {

	public static void main(String[] args) {
		double[] mas = new double[] { 1.5, 2.6, 3.5, 3.6, 4.5 };
		double[][] mas1 = new double[mas.length][mas.length];
		int k = 1;
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[0].length; j++) {
				mas1[i][j] = Math.pow(mas[j], k);
			}
			k++;
		}
		for (int i = 0; i < mas1.length; i++) {
			System.out.println();
			for (int j = 0; j < mas1[0].length; j++) {
				System.out.printf("%8.1f", mas1[i][j]);

			}
		}
	}
}

