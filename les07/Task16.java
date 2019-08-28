package by.htp.les07.main;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task16 {
	
	public static void main(String[] args) {

		int[][] mas = new int[5][5];
		int i = 0, j = 0;
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[0].length; j++) {
				if (i == j)
					mas[i][j] = (i + 1) * (i + 2);
				System.out.printf("%3d", mas[i][j]);
			}
			System.out.println();
		}
	}
}
