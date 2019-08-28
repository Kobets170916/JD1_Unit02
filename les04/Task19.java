package by.htp.les04.main;

import java.util.Scanner;

//Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. Определить
//также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

public class Task19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число, до которого вести поиск элементов:");
		int n = sc.nextInt();
		System.out.println();
		sc.close();
		methodMakeMass(n);
	}

	public static void methodMakeMass(int n) {
		int sum = 0;
		int[] mass = new int[n];
		for (int i = 10; i < mass.length; i++) {
			if (methodProvNech(i)) {

				sum = sum + i;
			}
		}
		System.out.println("Сумма нечетных чисел = " + sum);
		methodProvch(sum);
	}

	public static boolean methodProvNech(int n) {
		boolean flag = true;
		int g1 = 0;
		while (n > 0) {
			g1 = n % 10;
			n = n / 10;
			if ((g1 % 2) == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static void methodProvch(int n) {
		int g1 = 0;
		int k = 0;
		while (n > 0) {
			g1 = n % 10;
			n = n / 10;
			if ((g1 % 2) == 0) {
				k++;
			}
		}
		System.out.println("Количство четных цифр в полученной сумме = " + k);
	}
}