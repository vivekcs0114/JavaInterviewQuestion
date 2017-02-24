package com.avalia.interviewquestion;

public class SecondMaxNumWithoutUsingNestedLoop {
	public int twoMaxNumbers(int[] nums) {
		if(nums==null){
			return 0;
		}
		if(nums.length==0){
			return -1;
		}
		int maxOne = 0;
		int maxTwo = 0;
		for (int n : nums) {
			if (maxOne < n) {
				maxTwo = maxOne;
				maxOne = n;
			} else if (maxTwo < n) {
				maxTwo = n;
			}
		}
		return maxTwo;
	}
	public static void main(String[] args) {
		SecondMaxNumWithoutUsingNestedLoop obj=new SecondMaxNumWithoutUsingNestedLoop();
		int[] nums={120,15,19,30,75,65};
		int secondMax=obj.twoMaxNumbers(nums);
		System.out.println(secondMax);
	}
}
