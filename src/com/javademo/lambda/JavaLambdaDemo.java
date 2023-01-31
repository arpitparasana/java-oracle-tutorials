package com.javademo.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class JavaLambdaDemo {

	public static void main(String[] args) {
		List<Person> characters = new ArrayList<Person>();

		characters.add(new Person("Frodo", "Baggins", 32, Type.HOBBIT));
		characters.add(new Person("Samwise", "Gamgee", 32, Type.HOBBIT));
		characters.add(new Person("Gandalf", "The Grey", 500, Type.WIZARD));
		characters.add(new Person("Aragorn", "Elessar", 60, Type.MAN));
		characters.add(new Person("Arwen", "Undómiel", 160, Type.ELF));
		characters.add(new Person("Legolas", "Greenleaf", 150, Type.ELF));

		System.out.println("---------------------------------------");
		printWithAnonymousClass(characters, new Check() {

			@Override
			public boolean check(Person p) {
				return p.getAge() > 100;
			}
		});

		System.out.println("---------------------------------------");
		printWithLambda(characters, (p) -> p.getAge() < 100);
		System.out.println();
		printWithLambda(characters, (p) -> p.getAge() < 50);

		System.out.println("---------------------------------------");
		printWithPredicate(characters, (p) -> p.getType().equals(Type.HOBBIT.toString()));
		System.out.println();
		printWithPredicate(characters, (p) -> true); // print all
	}

	public static void printWithAnonymousClass(List<Person> list, Check c) {
		for (Person person : list) {
			if (c.check(person)) {
				System.out.println(person.toString());
			}
		}
	}

	public static void printWithLambda(List<Person> list, Check c) {
		for (Person person : list) {
			if (c.check(person)) {
				System.out.println(person.toString());
			}
		}
	}

	public static void printWithPredicate(List<Person> list, Predicate<Person> p) {
		for (Person person : list) {
			if (p.test(person)) {
				System.out.println(person.toString());
			}
		}
	}
}

interface Check {
	boolean check(Person p);
}