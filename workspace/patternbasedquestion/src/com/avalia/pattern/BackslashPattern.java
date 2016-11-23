package com.avalia.pattern;

import java.util.*;

class BackslashPattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of row=column");
		int noOfEle = s.nextInt();
		s.close();
		if (noOfEle >= 2) {
			for (int row = 1; row <= noOfEle; row++) {
				for (int col = 1; col <= noOfEle; col++) {
					if (row == col) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("row=column must be greater than equal to 2");
		}
	}
}
