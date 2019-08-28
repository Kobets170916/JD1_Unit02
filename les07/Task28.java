package by.htp.les07.main;

// Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец
// содержит максимальную сумму.
public class Task28 {

	public static void main(String[] args) {

		int n = 4;
		int m = 4;
		int[][] mas = new int[4][4];
		int i = 0, j = 0, sum = 0;
		int[] arr = new int[n + 1];
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[0].length; j++) {
				mas[i][j] = (int) (Math.random() * 10);
				// System.out.print("mas[" + i + "]" + "[" + j + "]" + " = " + mas[i][j] + " ");
				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for (j = 0; j < mas[0].length; j++) {
			for (i = 0; i < mas.length; i++) {
				sum += mas[i][j];
			}
			arr[j] = sum;
			System.out.print("sum " + sum + " ");
			sum = 0;
		}
		System.out.println();
		int max = 0;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println("max" + max);
	}
}
