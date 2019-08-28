package by.htp.les07.main;

//Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число 7 среди элементов
//массива.

public class Task08 {

	public static void main(String[] args) {

		int n = 3;
		int m = 5;

		int[][] mas1 = new int[n][m];
		int i = 0, j = 0;
		for (i = 0; i < mas1.length; i++) {
			for (j = 0; j < mas1[0].length; j++) {
				mas1[i][j] = (int) (Math.random() * 10);
				System.out.print("mas1[" + i + "]" + "[" + j + "]" + " = " + mas1[i][j] + " ");
			}
			System.out.println();
		}
		int count = 0;
		for (i = 0; i < mas1.length; i++) {
			for (j = 0; j < mas1[0].length; j++) {
				if (mas1[i][j] == 7)
					count++;
			}
		}
		System.out.println("встречается число - " + count);

	}

}
