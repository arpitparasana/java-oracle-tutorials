package com.javademo.lambda;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	private String type;

	public Person(String firstName, String lastName, int age, Type t) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.type = t.toString();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return type + ": firstName: " + firstName + ", lastName: " + lastName + ", Age: " + age;
	}
}
