package by.htp.les05.main;

//Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается раньше - 
//положительное или отрицательное.

public class Task03 {

	public static void main(String[] args) {

		int[] cislo = { 14, -5, 20, 6, -9, 7 };

		if (cislo[0] > 0) {
			System.out.println("+");
		} else if (cislo[0] < 0) {
			System.out.println("-");

		}
	}
}
