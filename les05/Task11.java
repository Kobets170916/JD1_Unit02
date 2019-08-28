package by.htp.les05.main;

//Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1)

public class Task11 {

	public static void main(String[] args) {

		int[] mas1 = {3, 9, 2, 15, 9, 11, 58, 7, 4, 2};
		int m = 3;
		int l = 1;
		
		if ((l > 0) && (l < m - 1)) {

			for (int i = 0; i < mas1.length; i++) {

				if (mas1[i] % m == l) {

					System.out.print(mas1[i] + "\n");
				}
			}
		}
	}
}
