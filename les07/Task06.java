package by.htp.les07.main;

//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class Task06 {

	public static void main(String[] args) {

		int[][] mas = new int[5][15];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[0].length; j++) {
				mas[i][j] = (int) (Math.random() * 10);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.println();
			for (int j = 0; j < mas[0].length; j++) {
				if (((j % 2) != 0) && (mas[0][j] > mas[mas.length - 1][j])) {
					System.out.printf("mas[%d][%d] = %d   ", i, j, mas[i][j]);
				}
			}
		}
	}
}