package by.htp.les04.main;

import java.util.Scanner;

/*Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.*/

public class Task20 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("введите n: ");
		int n = in.nextInt();
		System.out.println("сколько действий надо произвести = " + Count(n));
		in.close();

	}

	public static int Count(int n) {
		int count = 0;
		while (n != 0) {
			n -= Sum(n);
			count++;
		}
		return count;
	}

	public static int Sum(int n) {
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}

		return sum;
	}

}
