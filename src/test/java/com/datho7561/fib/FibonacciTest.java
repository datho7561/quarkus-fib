package com.datho7561.fib;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FibonacciTest {

	@Test
	public void lengthZero() {
		assertIntegerListEquals(Fibonacci.fibSeq(0));
	}

	@Test
	public void lengthOne() {
		assertIntegerListEquals(Fibonacci.fibSeq(1), 0);
	}

	@Test
	public void lengthThree() {
		assertEquals(Fibonacci.fibSeq(3), Arrays.asList(0, 1, 1));
	}

	private static void assertIntegerListEquals(List<Integer> actual, Integer... expected) {
		assertEquals(actual.size(), expected.length);
		for (int i = 0; i < actual.size(); i++) {
			assertEquals(expected[i], actual.get(i));
		}
	}
}