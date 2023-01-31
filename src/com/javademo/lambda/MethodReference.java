package com.javademo.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReference {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
		List<Integer> even = list.stream().filter(MethodReference::isEven).collect(Collectors.toList());

		System.out.println(even.toString());
		System.out.println(list.toString());

	}

	public static boolean isEven(int i) {
		return i % 2 == 0;
	}
}
