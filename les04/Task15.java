package by.htp.les04.main;

import java.util.Scanner;
import java.util.ArrayList;
/*Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
		являются числа, сумма цифр которых равна К и которые не большее N.*/

public class Task15 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("числа К и N: ");
		int K = in.nextInt();
		int N = in.nextInt();
		ArrayList<Integer> A = new ArrayList<>();
		Form(A, K, N);
		for (Integer s : A) {
			System.out.print(s + " ");
		}
		in.close();
	}

	public static void Form(ArrayList<Integer> A, int K, int N) {
		for (int a = 0; a <= N; ++a) {
			if (Sum(a) == K)
				A.add(a);
		}
	}

	public static int Sum(int a) {
		int sum = 0;
		do {
			sum += a % 10;
			a = a / 10;
		} while (a % 10 != 0);
		return sum;
	}
}
