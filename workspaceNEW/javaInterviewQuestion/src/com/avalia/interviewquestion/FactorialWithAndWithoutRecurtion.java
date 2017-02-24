package com.avalia.interviewquestion;

public class FactorialWithAndWithoutRecurtion {
	public static int factorialWithRec(int n) {
		int sum = 0;
		if (n == 1 || n == 0) {
			return 1;
		}
		sum = n * factorialWithRec(n - 1);
		return sum;
	}

	public static int factorialWithoutRec(int n) {
		if (n == 1 || n == 0) {
			return 1;
		}
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println(factorialWithRec(5));
		System.out.println(factorialWithoutRec(5));
	}
}
