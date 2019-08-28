package by.htp.les05.main;

//Даны действительные числа a1,a2,...,an . Найти
//max(a1 + a2n,a2 + a2n−1,...,an + an+1).

public class Task16 {
	
		public static void main(String[] args) {
			int[] mas1 = new int[] { 9, 28, 6, 85, 8, 55, 100, 35, 1, 36, 4 };

			int j = 0;
			int[] mas2 = new int[mas1.length - 1];
			for (int i = 0; i < (mas1.length - 1); i++) {
				mas2[j] = mas1[i] + mas1[i + 1];
				j++;
			}

			for (int i = 0; i < mas2.length; i++) {
				System.out.print(mas2[i] + " ");

			}
			System.out.println(" ");
			int max = mas1[0];
			for (int i = 0; i < mas2.length; i++) {
				if (mas2[i] > max) {
					max = mas2[i];
				}
			}
			System.out.println(max);
		}
	}