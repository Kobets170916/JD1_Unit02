package by.htp.les07.main;

import java.util.Scanner;

/*
 * Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ..., n2
так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой.
Построить такой квадрат. Пример магического квадрата порядка 3:
 */
public class Task40 {

	Scanner sc = new Scanner(System.in);System.out.println("Введите n:");
	int n = sc.nextInt();sc.close();
	int[][] masA = makeMass(n);while(prov(masA) != true) {
		mix(masA);
	}
	System.out.println("Магический квадрат ");
	printMas(masA);
	System.out.println();

}

public static int[][] makeMass(int n) {
	int[][] mas = new int[n][n];
	int k = 1;
	// создание массива неповторяющимися числами
	for (int i = 0; i < mas.length; i++) {
		for (int j = 0; j < mas.length; j++) {
			mas[i][j] = k;
			k++;
		}
	}
	return mas;
}

// перемешивание
	public static void mix(int[][] mas) {
		int i = (int) (0 + Math.random() * (mas.length));
		int j = (int) (0 + Math.random() * (mas.length));
		int temp = mas[i][j];
		if (i == mas.length - 1) {
			mas[i][j] = mas[i - 1][j];
			mas[i - 1][j] = temp;
		} else if (j == mas.length - 1) {
			mas[i][j] = mas[i][j - 1];
			mas[i][j - 1] = temp;
		} else if (i == 0) {
			mas[i][j] = mas[i + 1][j];
			mas[i + 1][j] = temp;
		} else if (j == 0) {
			mas[i][j] = mas[i][j + 1];
			mas[i][j + 1] = temp;
		} else {
			mas[i][j] = mas[i - 1][j + 1];
			mas[i - 1][j + 1] = temp;
		}
	}

	public static boolean prov(int[][] mas) {
		int e = 0;
		boolean flag = false;
		int magicSum = (mas.length * (mas.length * mas.length + 1)) / 2;
		int sum = 0;

		for (int i = 0; i < mas.length; i++) {
			sum = 0;
			for (int j = 0; j < mas.length; j++) {
				sum = sum + mas[i][j];
			}
			if (sum == magicSum) {
				e++;
			}
		}
		// по строкам
		for (int j = 0; j < mas.length; j++) {
			sum = 0;
			for (int i = 0; i < mas.length; i++) {
				sum = sum + mas[i][j];
			}
			if (sum == magicSum) {
				e++;
			}
		}

		sum = 0;
		for (int i = 0; i < mas.length; i++) {
			int j = i;
			sum = sum + mas[i][j];
			if (sum == magicSum) {
				e++;
			}
		}

		sum = 0;
		int j = mas.length - 1;
		for (int i = 0; i < mas.length; i++) {
			sum = sum + mas[i][j];
			j--;
			if (sum == magicSum) {
				e++;
			}
		}
		if (e == (2 * mas.length + 2)) {
			flag = true;
		}
		return flag;
	}

	public static boolean provD1(int[][] mas) {
		boolean flag = false;
		int magicSum = (mas.length * (mas.length * mas.length + 1)) / 2;
		int j = 0;
		int sum = 0;
		for (int i = j; i < mas.length; i++) {
			sum = 0;
			sum = sum + mas[i][j];
			if (sum == magicSum) {
				flag = true;
			}
		}
		return flag;
	}

public static void printMas(int[][] mas) {
	for (int i = 0; i < mas.length; i++) {
		System.out.println();
		for (int j = 0; j < mas[0].length; j++) {
			System.out.printf("%4d", mas[i][j]);
		}
	}
	System.out.println();
}