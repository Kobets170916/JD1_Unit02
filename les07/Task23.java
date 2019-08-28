package by.htp.les07.main;

//Сформировать квадратную матрицу порядка N по правилу

public class Task23 {

	public static void main(String[] args) {
		int n = 6;
		int[][] mas = new int[6][6];
		int i = 0, j = 0, count = 0;
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[0].length; j++) {
				mas[i][j] = (int) Math.sin((i * i - j * j) / n);
				if (mas[i][j] > 0)
					count++;
				System.out.print("mas[" + i + "]" + "[" + j + "]" + " = " + mas[i][j] + " ");
				// System.out.printf("%3d", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(count);
	}
}