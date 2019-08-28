package by.htp.les07.main;

import java.util.Stack;

//Найти положительные элементы главной диагонали квадратной матрицы.

public class Task29 {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		int n = 4;
		int[][] mas = new int[n][n];
		int i = 0, j = 0;
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[0].length; j++) {
				mas[i][j] = (int) (Math.random() * 10);
				
				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[0].length; j++) {
				if (i == j && mas[i][j] > 0)
					stack.push(mas[i][j]);
			}
		}
		System.out.println();
		System.out.println(stack);
	}
}
