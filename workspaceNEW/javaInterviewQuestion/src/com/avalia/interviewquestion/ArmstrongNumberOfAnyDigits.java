package com.avalia.interviewquestion;

import java.util.*;

public class ArmstrongNumberOfAnyDigits {
	public void chekArmstrong() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int inp;
		try{
		 inp = s.nextInt();
		}catch(Exception e){
			System.out.println("plese enter number");
			return;
		}
		int l = (int) (Math.log10(inp) + 1);
		int n = inp;
		int sum = 0, m;
		while (n != 0) {
			m = n % 10;
			sum = sum + (int) Math.pow(m, l);
			n = n / 10;
		}
		if (sum == inp)
			System.out.println("number is armestrong");
		else
			System.out.println("number is not armestrong");
	}

	public static void main(String args[]) {
		ArmstrongNumberOfAnyDigits obj = new ArmstrongNumberOfAnyDigits();
		obj.chekArmstrong();
	}
}
