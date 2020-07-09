package com.nishank.algo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
	

 @Test
 void isFibonacciSeries() {
	 Fibonacci fibonaccci = new Fibonacci(1);
	 Assertions.assertArrayEquals(new int[] {0}, fibonaccci.fibSeries());
	 Fibonacci fibonaccci_len2 = new Fibonacci(2);
	 Assertions.assertArrayEquals(new int[] {0,1}, fibonaccci_len2.fibSeries());
	 Fibonacci fibonaccci_len4 = new Fibonacci(4);
	 Assertions.assertArrayEquals(new int[] {0,1,1,2}, fibonaccci_len4.fibSeries());
 }
}
