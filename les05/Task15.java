package by.htp.les05.main;

//Дана последовательность действительных чиселma1,a2,...,an.
//Указать те ее элементы, которые принадлежат отрезку [с, d]

public class Task15 {

	public static void main(String[] args) {

		int[] mas1 = new int[] { 9, 28, 6, 85, 8, 55, 100, 35, 1, 36, 4 };

		int c = 5;
		int d = 42;

		for (int i = 0; i < mas1.length; ++i) {

			if ((mas1[i] >= c) && (mas1[i] <= d)) {
				System.out.print(mas1[i] + " ");
			}
		}
	}
}
