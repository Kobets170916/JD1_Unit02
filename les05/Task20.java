package by.htp.les05.main;

//import java.lang.reflect.Method;

//Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент
//(освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать

public class Task20 {

	public static void main(String[] args) {

		int[] mas1 = { 5, 19, 3, 6, 5, 8, 14, 2, 2, 58 };

		for (int i = 0; i < mas1.length; i += 2) {
			mas1[i] = 0;

		}

		for (int i = 0; i < mas1.length; i++) {
			System.out.print("  " + mas1[i]);
		}
		System.out.println();

		int b;
		for (int j = 1; j < mas1.length; j++) {
			for (int i = 0; i < mas1.length - 1; i++) {
				if (mas1[i] == 0) {
					b = mas1[i];
					mas1[i] = mas1[j];
					mas1[j] = b;
				}
			}
		}
	}
}