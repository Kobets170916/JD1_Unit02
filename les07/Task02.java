package by.htp.les07.main;

//Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9].

public class Task02 {

	public static void main(String[] args) {

		int[][] mas1 = new int[2][3];
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[0].length; j++) {
				mas1[i][j] = (int) (Math.random() * 10);
			}
		}

		for (int i = 0; i < mas1.length; i++) {
			System.out.println();
			for (int j = 0; j < mas1[0].length; j++) {
				System.out.print("  ||||   mas[" + i + "][" + j + "] = " + mas1[i][j]);
			}
		}
	}
}