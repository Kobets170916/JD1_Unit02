package by.htp.les04.main;

//Треугольник задан координатами своих вершин. Написать метод для вычисления его площади.

public class Task01 {

	public static void main(String[] args) {

		getSquare(8, 6, 3);

	}

	static void getSquare(double a, double b, double c) {
		double p = (a + b + c) / 2.0;
		double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		System.out.println(square);
	}

}