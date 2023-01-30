package com.javademo.innerclass;

public class AdderGenerator {

	public static Adder getAdder(int base) {
		// Returning anonymous class here
		return new Adder() {
			@Override
			public int add(int i) {
				return base + i;
			}
		};
	}
}
