package by.htp.les05.main;

import java.util.Arrays;

// Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой последовательности.
//Если таких чисел нет, то вывести сообщение об этом факте.

public class Task05 {

	public static void main(String[] args) {

		int n = 10;
		int[] mas1 = new int[n];
		int evenNums = 0;

		for (int i = 0; i < n; i++) {
			mas1[i] = (int) (Math.random() * (n + 1));
			if (mas1[i] % 2 == 0) {
				evenNums++;
			}
		}

		System.out.println(Arrays.toString(mas1));
		int[] mas2 = new int[evenNums];
		int index = 0;
		for (int i = 0; i < n; i++) {
			if (mas1[i] % 2 == 0) {
				mas2[index] = mas1[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(mas2));
	}

	// System.out.println("таких чисел нет");

}
