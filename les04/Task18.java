package by.htp.les04.main;

import java.util.ArrayList;
import java.util.Scanner;

/*Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
(например, 1234, 5789). Для решения задачи использовать декомпозицию.*/



public class Task18 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("введите n: ");
		int n = in.nextInt();
		ArrayList<Integer> A = new ArrayList<>();
		System.out.println("числа: ");
		Numb(A, n);
		in.close();

	}

	public static void Numb(ArrayList<Integer> A, int n) {
		boolean f = true;
		for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); ++i) {
			Array(A, i);
			for (int j = 0; j + 1 < A.size(); ++j) {
				if (A.get(j) <= A.get(j + 1))
					f = false;
			}
			if (f == true)
				System.out.print(i + " ");
			A.clear();
			f = true;
		}

	}

	public static void Array(ArrayList<Integer> A, int N) {
		while (N != 0) {
			A.add(N % 10);
			N /= 10;
		}
	}

}
