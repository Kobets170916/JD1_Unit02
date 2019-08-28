package by.htp.les07.main;

//Дана матрица. Вывести на экран все четные строки, то есть с четными номерами

public class Task05 {

	public static void main(String[] args) {

		int[][] mas1 = new int[3][5];
		int i = 0, j = 0;
		for (i = 0; i < mas1.length; i++) {
			for (j = 0; j < mas1.length; j++) {
				mas1[i][j] = (int) (Math.random() * 10);

				if (i % 2 == 0)
					System.out.print("mas1[" + i + "]" + "[" + j + "]" + " = " + mas1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
