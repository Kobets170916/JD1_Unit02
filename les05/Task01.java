package by.htp.les05.main;

// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному K

public class Task01 {

	public static void main(String[] args) {

		int[] A = {5, 17, 350, 110, 50};
		
	
		
		int k = A.length;
		int sum = 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] % k == 0) {
				sum += A[i];
			}
		}

		System.out.println("Сумма - " + sum);

	}

}
