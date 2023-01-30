package com.javademo.innerclass;

public class AdderFactory {

	public static Adder get(int base) {
		// Returning anonymous class here
		return new Adder() {
			@Override
			public int add(int i) {
				return base + i;
			}
		};
	}
}
