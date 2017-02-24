package com.avalia.interviewquestion;

import java.util.*;

public class PalindromeWithoutUsingFunction {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String inp = s.nextLine().toLowerCase();
		int l=inp.length(),i;
		boolean status=true;
		char[] arr1=inp.toCharArray();
		char[] arr2=new char[l];
		for( i=0;i<inp.length();i++){
			arr2[i]=arr1[--l];
		}
		for( i = 0;i<inp.length();i++){
			if(arr1[i]!=arr2[i]){
				status=false;
				break;
			}
		}
		if(status){
			System.out.println("string is palindrom");
		}else{
			System.out.println("string is not palindrom");
		}
	}
}
