package by.htp.les06.main;

import java.util.Arrays;

//Даны две последовательности a1 <= a2 <= ... an и b1 <= b2 <= ... bm . Образовать из них новую последовательность чисел
//так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.

public class Task02 {

	public static void main(String[] args) {

		int[] mas1 = { 5, 3, 9, 11, 2, 10 };
		int[] mas2 = { 1, 2, 6, 6, 8 };
		int n = mas1.length + mas2.length;
		int[] mas3 = new int[n];

		for (int i = 0; i < mas1.length; ++i) {
			mas3[i] = mas1[i];
		}
		for (int i = mas1.length, j = 0; j < mas2.length; ++j, ++i) {
			mas3[i] = mas2[j];
		}
		for (int i = mas3.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++)
				if (mas3[j] > mas3[j + 1]) {
					int buf = mas3[j];
					mas3[j] = mas3[j + 1];
					mas3[j + 1] = buf;
				}
		}
		System.out.println(Arrays.toString(mas3));
	}
}
