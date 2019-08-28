package by.htp.les07.main;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)

public class Task22 {

	public static void main(String[] args) {

		int[][] mas = new int[6][6];
		System.out.println();
		for (int i = 0; i < mas.length; ++i) {
			int k = i;
			for (int j = 0; j < mas[0].length - i; ++j) {
				mas[i][j] = k + 1;
				k++;
			}
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[0].length; j++) {
				System.out.printf("%3d", mas[i][j]);
			}
			System.out.println();
		}
	}
}