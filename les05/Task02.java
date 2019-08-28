package by.htp.les05.main;

//В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов

public class Task02 {

	public static void main(String[] args) {

		String str = "11 34 3 0 45 23 5 0 67";

		String strArr[] = str.split(" ");

		int numArr[] = new int[strArr.length];
		for (int i = 0; i < strArr.length; i++) {
			numArr[i] = Integer.parseInt(strArr[i]);
		}

		for (int i = 0; i < str.length(); i++) {
			if (numArr[i] == 0) {

				System.out.println(numArr[i]);

			}
		}
	}
}
