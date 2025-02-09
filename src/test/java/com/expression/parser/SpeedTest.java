package com.expression.parser;

import org.junit.Test;

import com.expression.parser.exception.CalculatorException;

public class SpeedTest {

	@Test
	public void testOne() {

		try {
			final long time1 = System.currentTimeMillis();
			Parser.simpleEval(
					"6.5*7.8^2.3 + (3.5^3+7/2)^3 -(5*4/(2-3))*4 + 6.5*7.8^2.3 + (3.5^3+7/2)^3 -(5*4/(2-3))*4 + 6.5*7.8^2.3 + (3.5^3+7/2)^3 -(5*4/(2-3))*4 + 6.5*7.8^2.3 + (3.5^3+7/2)^3 -(5*4/(2-3))*4");
			final long time2 = System.currentTimeMillis();
			System.out.println("time test one:" + (time2 - time1));
		} catch (CalculatorException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testTwo() {

		try {
			final long time1 = System.currentTimeMillis();
	
			for (int i = 0; i < 1000000; i++) {
				Parser.simpleEval(
						"6.5*7.8^2.3 + (3.5^3+7/2)^3 -(5*4/(2-3))*4 + 6.5*7.8^2.3 + (3.5^3+7/2)^3 -(5*4/(2-3))*4 + 6.5*7.8^2.3 + (3.5^3+7/2)^3 -(5*4/(2-3))*4 + 6.5*7.8^2.3 + (3.5^3+7/2)^3 -(5*4/(2-3))*4");
			}
	
			final long time2 = System.currentTimeMillis();
			System.out.println("time test two:" + (time2 - time1));
		} catch (CalculatorException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testThree() {

		try {
			final long time1 = System.currentTimeMillis();
			Parser.simpleEval("6.5*7.8^2.3 + (3.5^3+7/2)^3 -(5*4/(2-3))*4");
			final long time2 = System.currentTimeMillis();
			System.out.println("time test three:" + (time2 - time1));
		} catch (CalculatorException e) {
			e.printStackTrace();
		}

	}
}
