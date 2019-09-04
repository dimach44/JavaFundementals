package com.revature.intro;

public class VariableScopes {
	
	String myInstanceVar;
	
	public static void main(String[] args) {
		
		String myName = "Peter";
		
		for(int i = 0;i < 0;i++) {
			System.out.println(myName);
		}
	}
}
