package by.htp.les05.main;

import java.util.Arrays;

//Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.

public class Task08 {

	public static void main(String[] args) {
		int n = 10;

		int[] mas1 = new int[n];

		for (int i = 0; i < n; i++) {
			mas1[i] = (int) (Math.random() * (n + 1));
		}
		System.out.println(Arrays.toString(mas1));

		int i = 0;

		int index1 = 0;
		if (mas1[i] < 0) {
			index1++;
		}
		int index2 = 0;
		if (mas1[i] == 0) {
			index2++;
		}

		int index3 = 0;
		if (mas1[i] > 0) {
			index3++;
		}

		System.out.println("отрицательных элементов - " + index1);
		System.out.println("нулевых элементов - " + index2);
		System.out.println("положительных элементов - " + index3);
	}
}

