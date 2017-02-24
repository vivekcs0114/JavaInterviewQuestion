package com.avalia.interviewquestion;

public class UpperToLowerToUpper {
	public String toUpper(String inp) {
		String out = "";
		for (int i = 0; i < inp.length(); i++) {
			char ch = inp.charAt(i);
			int l = ch;
			char c = (char) (l - 32);
			out = out + c;
		}
		return out;
	}

	public String toLower(String inp) {
		String out = "";
		for (int i = 0; i < inp.length(); i++) {
			char ch = inp.charAt(i);
			int l = ch;
			char c = (char) (l + 32);
			out = out + c;
		}
		return out;
	}

	public static void main(String[] args) {
		UpperToLowerToUpper obj=new UpperToLowerToUpper();
		System.out.println(obj.toLower("VIVEK"));
		System.out.println(obj.toUpper("vivek"));
	}
}
