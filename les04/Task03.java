package by.htp.les04.main;

import java.math.BigInteger;

//Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class Task03 {
	public static void main(String[] args) {
		int[] nums = { 15, 25, 30, 40 };

		int gcd = nums[0];
		for (int i = 1; i < nums.length; i++) {
			gcd = Getgcd(gcd, nums[i]);
		}

		System.out.println("наибольший общий делитель 4 чисел = " + gcd);

	}

	private static int Getgcd(int a, int b)

	{
		return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
	}
}
