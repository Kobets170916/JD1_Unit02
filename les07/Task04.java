package by.htp.les07.main;

//Дана матрица. Вывести на экран первую и последнюю строки.

public class Task04 {

	public static void main(String[] args) {

		int[][] mas1 = new int[3][4];
		int i = 0, j = 0;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				mas1[i][j] = (int) (Math.random() * 10);
			}
		}
		for (j = 0; j <mas1.length; j++) {
			System.out.print("mas[" + 0 + "]" + "[" + j + "]" + " = " + mas1[0][j] + " ");
		}
		System.out.println();
		for (j = 0; j < mas1.length; j++) {
			System.out.print("mas[" + 2 + "]" + "[" + j + "]" + " = " + mas1[2][j] + " ");
		}
	}
}
