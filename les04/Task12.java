package by.htp.les04.main;

import java.util.Scanner;

/*Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
		если угол между сторонами длиной X и Y— прямой.*/

public class Task12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("длины сторон четырехугольника: ");
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		int t = in.nextInt();
		System.out.println("площадь= " + S(x, y, z, t));

		in.close();
	}

	public static double S(int x, int y, int z, int t) {
		double p = 0.5 * (x + y + z + t);
		double s = Math.sqrt((p - x) * (p - y) * (p - z) * (p - t));
		return s;
	}
}
