package by.htp.les04.main;

/*Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
массива с номерами от k до m.
*/
public class Task11 {

	public static void main(String[] args) {
		int[] mas_x = methodMakeMass(6);
		System.out.println();
		System.out.println("1-2-3");
		methodSum(mas_x, 0);
		System.out.println("3-4-5");
		methodSum(mas_x, 2);
		System.out.println("4-5-6");
		methodSum(mas_x, 3);
	}

	public static int[] methodMakeMass(int n) {
		int[] mas = new int[n];
		for (int i = 0; i < n; i++) {
			mas[i] = (int) (Math.random() * 100);
			System.out.print(" " + mas[i]);
		}
		return mas;
	}

	public static void methodSum(int[] mas, int j) {
		int sum = 0;
		for (int i = j; i < (j + 3); i++) {
			sum = sum + mas[i];
		}
		System.out.println("    " + sum);
	}
}
