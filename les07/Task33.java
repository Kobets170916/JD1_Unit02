package by.htp.les07.main;

//Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов

import java.util.Scanner;

public class Task33 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("размерность массива n:");
		int n = sc.nextInt();
		sc.close();
		int[][] mas = new int[n][n];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[0].length; j++) {
				mas[i][j] = (int) (Math.random() * 10);
			}
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.println();
			for (int j = 0; j < mas[0].length; j++) {
				System.out.printf("%3d", mas[i][j]);
			}
		}
		System.out.println();
		System.out.println("Сортируем по возрастанию");

		for (int i = 0; i < mas[0].length; i++) {
			for (int k = mas.length - 1; k > 0; k--) {
				for (int j = 1; j <= k; j++) {
					if (mas[j][i] < mas[j - 1][i]) {
						int temp = mas[j - 1][i];
						mas[j - 1][i] = mas[j][i];
						mas[j][i] = temp;
					}
				}
			}
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.println();
			for (int j = 0; j < mas[0].length; j++) {
				System.out.printf("%3d", mas[i][j]);
			}
		}
		System.out.println();
		System.out.println("Сортируем по убыванию");
		for (int i = 0; i < mas[0].length; i++) {
			for (int k = mas.length - 1; k > 0; k--) {
				for (int j = 1; j <= k; j++) {
					if (mas[j][i] > mas[j - 1][i]) {
						int temp = mas[j - 1][i];
						mas[j - 1][i] = mas[j][i];
						mas[j][i] = temp;
					}
				}
			}
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.println();
			for (int j = 0; j < mas[0].length; j++) {
				System.out.printf("%3d", mas[i][j]);
			}
		}
	}
}
