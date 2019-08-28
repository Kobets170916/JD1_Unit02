package by.htp.les06.main;

import java.util.Arrays;

/* Сортировка выбором. Дана последовательность чисел
a1  a2   an .Требуется переставить элементы так,
чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший элемент
и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура повторяется.
Написать алгоритм сортировки выбором.
*/

public class Task03 {

	public static void main(String[] args) {

		int[] mas1 = { 5, 3, 9, 11, 2, 10 };
		for (int i = 0; i < mas1.length; i++) {
			int buf = mas1[0];
			for (int j = i + 1; j < mas1.length; j++) {
				if (mas1[i] < mas1[j]) {
					buf = mas1[i];
					mas1[i] = mas1[j];
					mas1[j] = buf;
				}
			}
		}
		System.out.println(Arrays.toString(mas1));

	}

}
