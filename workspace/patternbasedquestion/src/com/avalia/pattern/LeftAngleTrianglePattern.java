package com.avalia.pattern;

import java.util.*;

class LeftAngleTrianglePattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of row=column");
		int nnoOfEle = s.nextInt();
		s.close();
		if (nnoOfEle >= 3) {
			for (int row = 1; row <= nnoOfEle; row++) {
				for (int col = 1; col <= nnoOfEle; col++) {
					if (col == nnoOfEle - (row - 1)) {
						System.out.print("*");
					} else if (col == nnoOfEle) {
						System.out.print("*");
					} else if (row == nnoOfEle) {
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
