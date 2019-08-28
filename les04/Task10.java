package by.htp.les04.main;

//Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Task10 {

	public static void main(String[] args) {

		System.out.println("суммa = " + Sum());
	}

	public static int Sum() {
		int sum = 0;
		for (int i = 1; i < 10; ++i) {
			if (i % 2 != 0)
				sum += Fact(i);
		}
		return sum;
	}

	public static int Fact(int a) {
		int f = 1;
		for (int i = 1; i <= a; ++i) {
			f *= i;
		}
		return f;
	}
}
