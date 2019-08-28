package by.htp.les06.main;

import java.util.Arrays;

/*
 * Сортировка вставками. Дана последовательность чисел
a1,a2,...,an . Требуется переставить числа в порядке
возрастания. Делается это следующим образом. Пусть a1,a2,...,ai - упорядоченная последовательность, т. е.
a1 <= a2 <=...<= an . Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая
последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n не
будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить с
помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */
public class Task05 {

	public static void main(String[] args) {
		int[] mas1 = { 5, 3, 9, 11, 2, 10 };

		for (int i = 1; i < mas1.length; i++) {
			int v = mas1[i];
			int lo = binSearch(mas1, mas1[i], 0, i);
			for (int j = i; j > lo; --j)
				mas1[j] = mas1[j - 1];
			mas1[lo] = v;
		}
		System.out.println(Arrays.toString(mas1));
		System.out.println();
	}

	static int binSearch(int[] a, int v, int lo, int hi) {
		while (lo < hi) {
			int mid = lo + (hi - lo) / 2;
			if (v < a[mid])
				hi = mid;
			else
				lo = mid + 1;
		}
		return lo;
	}
}
