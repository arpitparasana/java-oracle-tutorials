package com.javademo.innerclass;

public class Processor {

	int cores;

	double getCache() {
		return 4.3;
	}

	class RAM {
		double memory;
		String manufacturer;
		
		double getClockSpeed() {
			return 5.5;
		}
	}
}
