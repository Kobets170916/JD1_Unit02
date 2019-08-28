package by.htp.les07.main;

//Дана матрица. Вывести на экран первый и последний столбцы

public class Task03 {

	public static void main(String[] args) {

		int[][] mas1 = new int[2][5];
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[0].length; j++) {
				mas1[i][j] = (int) (Math.random() * 10);
			}
		}

		for (int i = 0; i < mas1.length; i++) {
			System.out.println();
			for (int j = 0; j < mas1[0].length; j++) {
				if ((j == 0) || (j == (mas1[0].length - 1))) {
					System.out.print("      mas[" + i + "][" + j + "] = " + mas1[i][j]);
				}
			}
		}
	}
}