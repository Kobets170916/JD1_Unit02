package by.htp.les07.main;

//Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была ровно одна единица, и
//вывести на экран.

public class Task01 {

	public static void main(String[] args) {

		int[][] mas1 = new int[3][4];
		int j = 0;
		for (int i = 0; i < mas1.length; i++) {
			mas1[i][j] = 1;
			j++;
		}

		for (int i = 0; i < mas1.length; i++) {
			System.out.println();
			for (j = 0; j < mas1[0].length; j++) {
				System.out.print("||| mas[" + i + "][" + j + "] = " + mas1[i][j] + "   ");
			}
		}
	}
}
