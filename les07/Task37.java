package by.htp.les07.main;

//Переставить строки матрицы случайным образом

public class Task37 {

	public static void main(String[] args) {

		int[][] mas = new int[5][5];
		int i = 0, j = 0;
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[0].length; j++) {
				mas[i][j] = (int) (Math.random() * 10);
				System.out.printf("%3d", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("строки");
		int a = (int) (Math.random() * (mas.length - 1));
		int b = (int) (Math.random() * (mas.length - 1));
		System.out.println(a + ", " + b);
		for (j = 0; j < mas[0].length; j++) {
			int buf = mas[a][j];
			mas[a][j] = mas[b][j];
			mas[b][j] = buf;
		}
		System.out.println();
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[0].length; j++) {
				System.out.printf("%3d", mas[i][j]);
			}
			System.out.println();
		}
	}
}
