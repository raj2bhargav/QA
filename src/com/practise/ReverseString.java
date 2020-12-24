package com.practise;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Raj Kumar Bhargav";
		
		String result = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			result = result + s.charAt(s.length() - i - 1);
			
		}
		
		System.out.println(result);

	}

}
