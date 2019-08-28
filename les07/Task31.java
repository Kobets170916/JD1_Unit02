package by.htp.les07.main;

//Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. Посчитать количество двузначных чисел в ней.

public class Task31 {

	public static void main(String[] args) {
		
		int m = 4;
		int n = 4;
		int[][] mas = new int[m][n];
		int i = 0, j = 0, count = 0;
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[0].length; j++) {
				mas[i][j] = (int) (Math.random() * 999);
				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				if (mas[i][j] >= 10 && mas[i][j] <= 99)
					count++;
			}
		}
		System.out.println();
		System.out.println(count);

	}

}

