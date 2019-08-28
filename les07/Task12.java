package by.htp.les07.main;

//Получить квадратную матрицу порядка n:

public class Task12 {

	public static void main(String[] args) {

		int[][] mas1 = new int[4][4];
		int i = 0, j = 0;
		for (i = 0; i < mas1.length; i++) {
			for (j = 0; j < mas1[0].length; j++) {
				if (i == j)
					mas1[i][j] = i;
				System.out.print("mas1[" + i + "]" + "[" + j + "]" + " = " + mas1[i][j] + " ");
			}
			System.out.println();
		}
	}
}
