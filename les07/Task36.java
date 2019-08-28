package by.htp.les07.main;

//Операция сглаживания матрицы дает новую матрицу того же размера, каждый элемент которой получается
//как среднее арифметическое соседей соответствующего элемента исходной матрицы. Построить результат
//сглаживания заданной матриц

public class Task36 {

	public static void main(String[] args) {

		int[][] mas = new int[5][5];
		int i = 0, j = 0;
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[0].length; j++) {
				mas[i][j] = (int) (Math.random() * mas.length);
				System.out.printf("%3d", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		for (i = 1; i < mas.length - 1; i++) {
			for (j = 1; j < mas[0].length - 1; j++) {
				mas[i][j] = (mas[i][j - 1] + mas[i][j + 1]) / 2;
			}
		}
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[0].length; j++) {
				System.out.printf("%3d", mas[i][j]);
			}
			System.out.println();
		}
	}
}
