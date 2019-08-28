package by.htp.les05.main;

import java.util.Arrays;

//Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти числа

public class Task06 {

	public static void main(String[] args) {

		int[] mas1 = { 15, 2, 4, 3, 5, 5 };
		Arrays.sort(mas1);
		int min = mas1[0];

		System.out.println("Min Value = " + min);
	}

}
