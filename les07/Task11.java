package by.htp.les07.main;

//Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа налево, вторая
//строка слева направо, третья строка справа налево и так далее.

public class Task11 {

	public static void main(String[] args) {

		int[][] mas1 = new int[5][6];
		int i = 0, j = 0;
		for (i = 0; i < mas1.length; i++) {
			for (j = 0; j < mas1[0].length; j++) {
				mas1[i][j] = (int) (Math.random() * 10);
				System.out.print("mas1[" + i + "]" + "[" + j + "]" + " = " + mas1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (i = 0; i < mas1.length; i++) {
			if ((i + 1) % 2 != 0) {
				for (j = mas1[0].length - 1; j >= 0; j--) {
					System.out.print("mas1[" + i + "]" + "[" + j + "]" + " = " + mas1[i][j] + " ");
				}
			} else {
				for (j = 0; j < mas1[0].length; j++) {
					System.out.print("mas1[" + i + "]" + "[" + j + "]" + " = " + mas1[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
