package com.datho7561.fib;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	public static List<Integer> fibSeq(int length) {
		List<Integer> memo = new ArrayList<>();
		memo.add(0);
		memo.add(1);
		for (int i = 2; i < length; i++) {
			memo.add(i, memo.get(i - 1) + memo.get(i - 2));
		}
		return memo.subList(0, length);
	}

}