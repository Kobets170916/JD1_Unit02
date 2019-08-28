package by.htp.les05.main;

import java.util.Arrays;

//Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом.
//Подсчитать количество замен.
public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int z = 7;
		int n = 10;
		int evenNums = 0;
		int[] mas1 = new int[n];

		for (int i = 0; i < n; i++) {
			mas1[i] = (int) (Math.random() * (n + 1));

			evenNums++;
		}

		System.out.println(Arrays.toString(mas1));
		int[] mas2 = new int[evenNums];
		int index = 0;
		for (int i = 0; i < n; i++) {
			if (mas1[i] > z) {
				mas1[i] = z;
				mas2[index] = mas1[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(mas2));
		System.out.println(index);
	}

}
