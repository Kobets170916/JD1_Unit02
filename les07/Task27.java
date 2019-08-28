package by.htp.les07.main;

import java.util.Scanner;

/*
 * В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить на
соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.
 */

public class Task27 {

	public static void main(String[] args) {

		int n = 4; // размер массива n:
		int m = 4; // размер массива m:
		int k1 = 5; // номер 1-го столбца
		int k2 = 6; // номер 2-го столбца

		int[][] mas1 = new int[n][m];
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[0].length; j++) {
				mas1[i][j] = (int) (Math.random() * 100);
			}
		}

		for (int i = 0; i < mas1.length; i++) {
			System.out.println();
			for (int j = 0; j < mas1[0].length; j++) {
				System.out.printf("mas[%d][%d] = %3d   ", i, j, mas1[i][j]);
			}
		}

		for (int i = 0; i < mas1.length; i++) {
			int d = mas1[i][k1];
			mas1[i][k1] = mas1[i][k2];
			mas1[i][k2] = d;
		}

		System.out.println();
		for (int i = 0; i < mas1.length; i++) {
			System.out.println();
			for (int j = 0; j < mas1[0].length; j++) {
				System.out.printf("mas[%d][%d] = %3d   ", i, j, mas1[i][j]);
			}
		}
	}
}