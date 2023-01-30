package com.javademo.innerclass;

public class InnerClassDemo {

	public static void main(String[] args) {

		// Simple inner class
		Processor processor = new Processor();
		Processor.RAM ram = processor.new RAM();
		System.out.println(processor.getCache());
		System.out.println(ram.getClockSpeed());

		// Special Local Inner class
		System.out.println(FormValidator.validatePhoneNumber("1234567890"));
		System.out.println(FormValidator.validatePhoneNumber("12340"));
		System.out.println(FormValidator.validateEmail("test@testemail.com"));
		System.out.println(FormValidator.validateEmail("test@testemail.c"));

		// Anonymous class defined in Adder interface and implemented in AdderGenerator
		Adder adder = AdderGenerator.getAdder(5);
		System.out.println(adder.add(10));
		System.out.println(adder.add(15));
		
		adder = AdderGenerator.getAdder(15);
		System.out.println(adder.add(10));
		System.out.println(adder.add(15));
		
	}
}
