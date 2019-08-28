package by.htp.les04.main;

import java.util.Random;
import java.util.Scanner;

//На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими из
//пар точек самое большое расстояние. Указание. Координаты точек занести в массив.

public class Task07 {

	private static int length;

	public static void main(String[] args) {

		int n = 10;
		length = getLength(n);

	}

	static int getLength(int n) {

		int[][] mas = new int[n][2];

		Random rand = new Random();

		for (int i = 0; i < mas[i].length; i++) {
			System.out.println(i + 1 + " точка координат: " + n);

			int x = 0;
			int y = 0;

			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10);

			}
		}
		return n;

	}
}
