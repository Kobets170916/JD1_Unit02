package by.htp.les04.main;

import java.util.Scanner;

//Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

public class Task14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("число:");
		int a = in.nextInt();
		int b = in.nextInt();
		int first = Count(a);
		int second = Count(b);
		if (first > second)
			System.out.println("число" + a + " больше");
		else if (first < second)
			System.out.println("число " + b + " больше");
		else
			System.out.println("одинаковое");

		in.close();
	}

	public static int Count(int x) {
		int count = 0;
		do {
			x = x / 10;
			count++;
		} while (x % 10 != 0);
		return count;
	}
}
