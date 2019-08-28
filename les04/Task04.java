package by.htp.les04.main;

import java.math.BigInteger;

// Написать метод(методы) для нахождения наименьшего общего кратного трех натуральных чисел.

public class Task04 {

	public static void main(String[] args) {
		int[] nums = { 14, 24, 38 };

		int lcm = nums[0];
		for (int i = 1; i < nums.length; i++) {
			lcm = Getlcm(lcm, nums[i]);
		}

		System.out.println("наименьшего общего кратного 3 чисел = " + lcm);

	}

	private static int Getlcm(int a, int b)

	{
		return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();

	}
}
