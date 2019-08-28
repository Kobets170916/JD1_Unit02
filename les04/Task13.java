package by.htp.les04.main;

import java.util.Arrays;
import java.util.Scanner;

//Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются
//цифры числа N.

public class Task13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("введите число:");
		int N = in.nextInt();
		int[] arr = new int[Mas(N)];
		Form(arr, N);
		System.out.println(Arrays.toString(arr));
		in.close();
	}

	public static int Mas(int N) {
		int count = 0;
		do {
			N = N / 10;
			count++;
		} while (N % 10 != 0);
		return count;
	}

	public static void Form(int[] arr, int N) {
		do {
			for (int i = 0; i < arr.length; ++i) {
				arr[i] = N % 10;
				N = N / 10;
			}
		} while (N % 10 != 0);
	}
}
