package by.htp.les07.main;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task18 {

	public static void main(String[] args) {

		int[][] mas = new int[5][5];
		int L = 1;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[0].length - i; j++) {
				mas[i][j] = L;
			}
			L++;
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.println();
			for (int j = 0; j < mas[0].length; j++) {
				System.out.printf("%3d", mas[i][j]);
			}
		}
	}
}
