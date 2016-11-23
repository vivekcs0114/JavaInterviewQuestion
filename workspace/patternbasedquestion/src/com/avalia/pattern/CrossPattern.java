package com.avalia.pattern;

import java.util.*;

class CrossPattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of rows=column");
		int noOfEle = s.nextInt();
		int row, col;
		s.close();
		if (noOfEle >= 3) {
			for (row = 1; row <= noOfEle; row++) {
				for (col = 1; col <= noOfEle; col++) {
					if (col == row) {
						System.out.print("*");
					} else if (col == noOfEle - (row - 1)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("row=column must be greater than equal to 3");
		}
	}
}
