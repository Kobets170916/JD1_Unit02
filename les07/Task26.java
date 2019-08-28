package by.htp.les07.main;

import java.util.Scanner;

/*
 *  С клавиатуры вводится двумерный массив чисел размерностью n x m. Выполнить с массивом следующие действия:
а) вычислить сумму отрицательных элементов в каждой строке;
б) определить максимальный элемент в каждой строке;
в) переставить местами максимальный и минимальный элементы матрицы.
 */
public class Task26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите размер массива");
		System.out.println("Введите n ->");
		int n = sc.nextInt();
		System.out.println("Введите m ->");
		int m = sc.nextInt();
		int[][] mas = new int[n][m];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[0].length; j++) {
				System.out.println("Введите элемент [" + i + "][" + j + "]");
				mas[i][j] = sc.nextInt();
			}

		}
		sc.close();
		// вывод массива
		System.out.println("Введенный массив:");
		for (int i = 0; i < mas.length; i++) {
			System.out.println();
			for (int j = 0; j < mas[0].length; j++) {
				System.out.printf("%4d", mas[i][j]);
			}
		}
		// вычислить сумму отрицательных элементов в каждой строке;
		for (int i = 0; i < mas.length; i++) {
			int sum = 0;
			System.out.println();
			for (int j = 0; j < mas[0].length; j++) {
				if (mas[i][j] < 0) {
					sum = sum + mas[i][j];
				}
				if (j == mas[0].length - 1) {
					System.out.printf("sum отрицательных элементов в %d строке = %4d", i, sum);
				}
			}

		}
		// определить максимальный элемент в каждой строке;
		for (int i = 0; i < mas.length; i++) {
			int max = 0;
			System.out.println();
			for (int j = 0; j < mas[0].length; j++) {
				if (mas[i][j] > max) {
					max = mas[i][j];
				}
				if (j == mas[0].length - 1) {
					System.out.printf("max элемент в %d строке = %4d", i, max);
				}
			}

		}
		int maxA = 0;
		int maxA_i = 0;
		int maxA_j = 0;
		int minA = 0;
		int minA_i = 0;
		int minA_j = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[0].length; j++) {
				if (mas[i][j] > maxA) {
					maxA = mas[i][j];
					maxA_i = i;
					maxA_j = j;
				}
				if (mas[i][j] < minA) {
					minA = mas[i][j];
					minA_i = i;
					minA_j = j;
				}
			}

		}
		mas[minA_i][minA_j] = maxA;
		mas[maxA_i][maxA_j] = minA;

		System.out.println();
		System.out.println("Массив с измененным max и min элементом:");
		for (int i = 0; i < mas.length; i++) {
			System.out.println();
			for (int j = 0; j < mas[0].length; j++) {
				System.out.printf("%4d", mas[i][j]);
			}
		}
	}

}