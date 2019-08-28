package by.htp.les07.main;

import java.util.Stack;

// Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//которых число 5 встречается три и более раз.

public class Task30 {

	public static void main(String[] args) {
		
	Stack<Integer> stack = new Stack<>();
	int m = 10, n = 20;
	int[][] mas = new int[m][n];
	int i = 0, j = 0, count = 0;
	for (i = 0; i < mas.length; i++) {
		for (j = 0; j < mas[0].length; j++) {
			mas[i][j] = (int) (Math.random() * 15);
			System.out.printf("%4d", mas[i][j]);
		}
		System.out.println();
	}
	System.out.println();
	for (i = 0; i < mas.length; i++) {
		for (j = 0; j < mas[0].length; j++) {
			if (mas[i][j] == 5)
				count++;
		}
		if (count >= 5)
			stack.push(i);
		count = 0;
	}
	System.out.println();
	System.out.println(stack);

}

}


