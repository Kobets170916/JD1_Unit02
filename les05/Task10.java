package by.htp.les05.main;

//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

public class Task10 {

	public static void main(String[] args) {

		int[] mas1 = { 5, 8, 2, 15, 9, 10, 8, 58, 75, 4, 1 };

		for (int i = 0; i < mas1.length; i++) {
			System.out.print(mas1[i] > i ? mas1[i] + "\n" : "");
		}
	}
}
