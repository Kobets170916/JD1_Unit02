package by.htp.les05.main;

//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются
//простыми числами.

public class Task12 {

	public static void main(String[] args) {

		double[] mas1 = new double[] { 5, 58, 2.5, 24, 34.4, -5, 24.5 };

		double sum = 0;
		for (int i = 2; i < mas1.length; i++) {
			if ((i == 2) || (i % 2 != 0)) {
				sum = sum + mas1[i];
				System.out.print(mas1[i] + " ");
			}
		}
		System.out.println();
		System.out.println(sum);
	}

}
