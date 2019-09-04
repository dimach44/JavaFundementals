package com.revature.intro;

public class Constructors {
	public static void main(String[] args) {
		C c = new C(4);
	}
}

class A {
	A() {
		//super();
		System.out.println("IN CLASS A CONSTRUCTOR");
	}
}

class B extends A {
	int num;
	B(){}
	B(int num){
		//super();
		System.out.println("IN CLASS B CONSTRUCTOR");
	}
}

class C extends B {
	C() {
		//super(4);
		System.out.println("IN CLASS C CONSTRUCTOR");
	}
	C(int num){
		System.out.println(num);
	}
}