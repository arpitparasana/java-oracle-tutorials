package com.javademo.innerclass;

import java.util.Iterator;

public class CustomIteratorDemoUsingInnerClass {

	private static final int SIZE = 15;
	private int[] array = new int[SIZE];

	public CustomIteratorDemoUsingInnerClass() {
		for (int i = 0; i < SIZE; i++) {
			array[i] = i + 1;
		}
	}

	public void printEven() {
		CustomIterator it = this.new CustomIterator();
		while (it.hasNext()) {
			System.out.println(" " + it.next());
		}
	}

	class CustomIterator implements Iterator<Integer> {
		private int nextInt = 0;

		@Override
		public boolean hasNext() {
			return nextInt <= SIZE - 1;
		}

		@Override
		public Integer next() {
			int e = array[nextInt];
			nextInt += 2;
			return e;
		}
	}

	public static void main(String[] args) {
		CustomIteratorDemoUsingInnerClass demo = new CustomIteratorDemoUsingInnerClass();
		demo.printEven();
	}
}
