package by.htp.les07.main;

import java.util.Scanner;

//Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца

public class Task34 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите размерность массива n:");
		int n = sc.nextInt();
		System.out.println("Введите размерность массива m:");
		int m = sc.nextInt();
		sc.close();
		int[][] mas = new int[n][m];
		int i = 0;
		for (int j = 0; j < mas[0].length; j++) {
			int p = 0;
			while (p != j) {
				i = (int) (Math.random() * n);
				if (mas[i][j] != 1) {
					mas[i][j] = 1;
					p++;
				}
			}
		}
		for (i = 0; i < mas.length; i++) {
			System.out.println();
			for (int j = 0; j < mas[0].length; j++) {
				System.out.printf("%3d", mas[i][j]);
			}
		}
	}
}