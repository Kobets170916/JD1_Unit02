package by.htp.les07.main;

//Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов.

public class Task07 {

	public static void main(String[] args) {

		int n = 5;
		int[][] mas = new int[n][n];
		int i = 0, j = 0;
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas.length; j++) {
				mas[i][j] = (int) (Math.random() * 10);
				System.out.print("mas[" + i + "]" + "[" + j + "]" + " = " + mas[i][j] + " ");
			}
			System.out.println();
		}
		int sum = 0;
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas.length; j++) {
				if (mas[i][j] < 0 && mas[i][j] % 2 != 0)
					sum += Math.abs(mas[i][j]);
			}
		}
		System.out.println("суммa модулей отрицательных нечетных элементов " + sum);
	}
}
