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

		// Anonymous class as Adder interface is used in AdderFactory
		Adder adder = AdderFactory.get(5);
		System.out.println(adder.add(10));
		System.out.println(adder.add(15));

		// can be implemented directly here
		adder = new Adder() {
			@Override
			public int add(int i) {
				return i + 2;
			}
		};
		System.out.println(adder.add(10));

		// can also provide behavior using lambda
		// though this can only be done if Adder has only one method in which case it
		// becomes functional interface
		adder = (i) -> i + 1;

		System.out.println(adder.add(15));

	}
}
