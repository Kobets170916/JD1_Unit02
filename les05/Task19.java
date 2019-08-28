package by.htp.les05.main;

//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел
//несколько, то определить наименьшее из них

public class Task19 {

	public static void main(String[] args) {

		int[] mas1 = { 5, 9, 3, 6, 5, 8, 14, 2, 2, 58, 6, 6, 45 };

		int element = 0;
		int maxelement = 0;

		for (int i = 0; i < mas1.length; i++) {

			for (int j = 0; j < mas1.length; j++) {
				if ((i != j) && (mas1[i] == mas1[j])) {
					element++;
				}
				if (element > maxelement) {
					maxelement = element;
					element = mas1[i];
				} else if (element == maxelement) {
					maxelement = element;
					if (element > mas1[i]) {
						element = mas1[i];
					}
				}
			}
			element = 0;
		}
		System.out.println("наиболее часто встречающееся число " + maxelement);

	}
}
