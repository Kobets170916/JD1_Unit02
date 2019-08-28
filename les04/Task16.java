package by.htp.les04.main;

import java.util.Scanner;
		/*Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). Найти
		и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для решения
		задачи использовать декомпозицию*/

		public class Task16 {

			public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
				System.out.println("введите число > 2");
				int n = in.nextInt();
				Twins(n);
				in.close();
			}

			public static void Twins(int n) {
				for (int i = n; (i + 2) <= 2 * n; i++) {
					if (isSimple(i) && isSimple(i + 2))
						System.out.println(i + " + " + (i + 2));
				}
			}

			public static boolean isSimple(int a) {
				for (int i = 2; i <= Math.sqrt(a); i++) {
					if (a % i == 0)
						return false;
				}
				return true;
			}
	}
