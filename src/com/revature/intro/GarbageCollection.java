package com.revature.intro;

public class GarbageCollection {
	
	public static void main(String[] args) {
		Garbage g1 = new Garbage("1");
		Garbage g2 = new Garbage("2");
		Garbage g3 = new Garbage("3");
		Garbage g4 = new Garbage("4");
		Garbage g5 = new Garbage("5");
		Garbage g6 = new Garbage("6");
		g6 = g2;
		g1 = null;
		g3 = g5;
		g4 = g1;
		System.gc();
		for (int i = 0;i < 1000;i++) {
			System.out.print("blah ");
		}
	}
	
}

class Garbage {
	String name;
	
	public Garbage(String name) {
		this.name = name;
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println(name + " IS BEING GARBAGE COLLECTED!");
	}
}

