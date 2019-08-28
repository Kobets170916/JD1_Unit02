package by.htp.les05.main;

//Дан одномерный массив A[N]. Найти:
//max(a2,a4,...,a2k) + min(a1,a3,...,a2k+1)

public class Task14 {

	public static void main(String[] args) {
		int[] mas1 = new int[] { 9, 28, 6, 85, 8, 55, 100, 35, 1, 36, 4 };

		int max = mas1[0];
		int min = mas1[1];

		for (int i = 0; i < mas1.length; i++) {
			if (mas1[i] > max) {
				max = mas1[i];
			}
			i++;
		}

		for (int i = 1; i < mas1.length; i++) {
			if (mas1[i] < min) {
				min = mas1[i];
			}
			i++;
		}
		System.out.println(max + " + " + min + " = " + (max + min));
	}
}