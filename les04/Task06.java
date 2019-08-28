package by.htp.les04.main;

//Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника

public class Task06 {

	public static void main(String[] args) {

		System.out.printf("Площадь = " + getSquare(4));
	}

	public static double getSquare(double a) {

		double s = ((a * a) * Math.sqrt(3)) / 4;

		return s * 6;
	}
}
