package com.cg.demo.function;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionDemo {

	public static void main(String[] args) {

		Integer num = 11;

		Predicate<Integer> predicate = (n) -> {
			if (n % 2 == 0)
				return true;
			return false;
		};
		System.out.println(predicate.test(num));

//		if (num % 2 == 0)
//			System.out.println("Even");
//		System.out.println("Odd");

		Consumer<String> consumer = (name) -> {
			System.out.println(name);
		};
		consumer.accept("Sonu");

		Supplier<Integer> supplier = () -> {
			Random random = new Random();
			return random.nextInt();
		};

		System.out.println(supplier.get());

		Function<Integer, Integer> function = (input) -> {
			return input * input;
		};
		System.out.println(function.apply(10));
	}
}