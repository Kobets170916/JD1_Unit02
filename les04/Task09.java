package by.htp.les04.main;

import java.util.Scanner;

//Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми

public class Task09 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("три числа:");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		if (numb(numb(a, b), c) == 1)
			System.out.println("Числа взаимно простые");
		else
			System.out.println("Числа не взаимно простые");
		in.close();
	}

	public static int numb(int a, int b) {
		while (a != b) {
			if (a > b)
				a -= b;
			else
				b -= a;
		}
		return a;
	}
}
