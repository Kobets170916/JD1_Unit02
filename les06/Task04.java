package by.htp.les06.main;

/*Сортировка обменами. Дана последовательность чисел
a1 <= a2 <= ... an .Требуется переставить числа в порядке
возрастания. Для этого сравниваются два соседних числа ai и ai+1. Если ai > ai+1, то делается перестановка. Так
продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания. Составить алгоритм
сортировки, подсчитывая при этом количества перестановок.
*/

import java.util.Arrays;

public class Task04 {

	public static void main(String[] args) {
		int[] mas1 = { 5, 3, 9, 11, 2, 10 };
		
		
		for (int i = mas1.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++)
			
				if (mas1[j] > mas1[j + 1]) {
					int buf = mas1[j];
					mas1[j] = mas1[j + 1];
					mas1[j + 1] = buf;
					}
		}
		System.out.println(Arrays.toString(mas1));
	}
}


