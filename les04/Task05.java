package by.htp.les04.main;

// Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел.

public class Task05 {

	public static void main(String[] args) {

		double min = getMin(30, 5, 11);
		double max = getMax(30, 5, 11);
		System.out.println(min + max);
	}

	public static double getMin(double a, double b, double c) {
		return Math.min(Math.min(a, b), c);
	}

	public static double getMax(double a, double b, double c) {
		return Math.max(Math.max(a, b), c);
	}
}
