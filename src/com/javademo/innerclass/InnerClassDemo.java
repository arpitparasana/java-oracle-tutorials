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
	}
}
