package by.htp.les05.main;

//Дана последовательность целых чисел a1,a2,..,an .
//Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a1,a2,...,an).

public class Task17 {

	public static void main(String[] args) {
		int[] mas1 = { 9, 28, 6, 85, 55, 100, 35, 1, 36,  };

		int min = mas1[0];
		for (int i = 1; i < mas1.length; i++) {
			if (mas1[i] < min) {
				min = mas1[i];
			}
		}

		int k = 0;
		int i = (mas1.length - 1);
		while (i >= 0) {
			if (mas1[i] == min) {
				k++;
			}
			i--;
		}

		int[] mas2 = new int[mas1.length - k];
		int j = 0;
		for (i = 0; i < (mas1.length - k); i++) {
			if (mas1[j] != min) {
				mas2[i] = mas1[j];
			} else {
				mas2[i] = mas1[j + 1];
				j++;
			}
			j++;
		}

		for (i = 0; i < mas2.length; i++) {
			System.out.print(mas2[i] + " ");
		}
	}
}
