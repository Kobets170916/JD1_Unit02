package by.htp.les05.main;

//Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей

public class Task04 {
	public static void main(String[] args) {

		int[] list = { 1, 4, 5, 6, 8 };
		
		int i = 0;
		
		if (list[i] < list[i + 1]) {
			
			System.out.println("последовательность возврастает");
		
		} else {
		
			System.out.println("последовательность не возврастает");

		}
	}

}