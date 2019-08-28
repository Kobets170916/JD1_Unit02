package by.htp.les07.main;

//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class Task35 {

	public static void main(String[] args) {

		int[][] mas = new int[5][5];
		int i = 0, j = 0, max = 0;
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
				if (mas[i][j] > max)
					max = mas[i][j];
			}
		}
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[0].length; j++) {
				if (mas[i][j] % 2 != 0)
					mas[i][j] = max;
				System.out.printf("%3d", mas[i][j]);
			}
			System.out.println();
		}
	}
}