package com.avalia.interviewquestion;

import java.util.*;

public class CheckInputDataTypes {
	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the input");
		String obj = s.nextLine();
		try {
			int i = Integer.parseInt(obj);
			System.out.print("This input is of type Integer.");
		} catch (Exception intNumber) {
			try {
				float f = Float.parseFloat(obj);
				System.out.print("This input is of type float.");
			} catch (Exception floatNumber) {
				if (obj.length() == 1) {
					System.out.print("This input is of type character.");
				}
				System.out.print("This input is of type String.");
			}
		}
	}
}
