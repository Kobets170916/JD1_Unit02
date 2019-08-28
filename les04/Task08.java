package by.htp.les04.main;

import java.util.Scanner;

//Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
//которое меньше максимального элемента массива, но больше всех других элементов)

public class Task08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите количество элементов в массиве n:");
		int n = sc.nextInt();
		System.out.println("Вывод сгенерированного массива");
		int[] mas1 = methodMakeMass(n);
		System.out.println();
		methodMax2(mas1);

	}

	public static int[] methodMakeMass(int n) {
		int[] mas = new int[n];
		for (int i = 0; i < n; i++) {
			mas[i] = (int) (Math.random() * 100);
			System.out.print(mas[i] + " ");
		}
		return mas;
	}

	public static void methodMax2(int[] mas) {
		int max = mas[0];
		for (int i = 0; i < mas.length - 1; i++) {
			if (mas[i] > max) {
				max = mas[i];
			}
		}
		System.out.println("Максимальный элемент массива = " + max);
		int max1 = mas[0];
		for (int i = 0; i < mas.length - 1; i++) {
			if ((mas[i] > max1) && (mas[i] < max)) {
				max1 = mas[i];
			}
		}
		System.out.println("Максимальный 2 элемент элемент массива = " + max1);
	}

}