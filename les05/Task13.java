package by.htp.les05.main;

//Определить количество элементов последовательности натуральных чисел, 
//кратных числу М и заключенных в промежутке от L до N.

public class Task13 {

	public static void main(String[] args) {
		int l = 5;
		int m = 3;
		int n = 100;

		int[] mas1 = new int[] { 8, 35, 89, 55, 1, 36, 2, 86, 19, -6, 99, 50 };

		int k = 0;
		for (int i = 0; i < mas1.length; i++) {
			if ((mas1[i] % m == 0) && (mas1[i] > l) && (mas1[i] < n)) {

				k++;
			}
		}
		System.out.println("количество элементов последовательности: " + k);
	}

}