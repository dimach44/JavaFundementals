package com.revature.codingchallenges;

public class Anagram {

	public static void main(String[] args) {
		System.out.println(anagram("restful", "fluster"));
	}

	public static boolean anagram(String str1, String str2) {
		char temp1;
		char temp2;
		int hasChar = 0;
		if (str1.length() != str2.length()) return false;
		for(int i = 0;i < str1.length();i++) {
			temp1 = str1.charAt(i);
			for(int j = 0;j < str1.length();j++) {
				temp2 = str2.charAt(j);
				if (temp2 == temp1) {
					hasChar += 1;
					continue;
				}
			}
		}
		if (hasChar == str1.length()) return true;
		
		return false;
	}
}
