package by.htp.les04.main;

//Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
//натуральных чисел:

public class Task02 {

	public static void main(String[] args) {
		methodNok(25, 40);

	}

	public static int methodNod(int a, int b) {
		while ((a != 0) && (b != 0)) {
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}
		int k = a + b;
		System.out.println(k);
		return k;
	}

	public static void methodNok(int a, int b) {
		int g = (a * b) / (methodNod(a, b));
		System.out.println(g);
	}
}