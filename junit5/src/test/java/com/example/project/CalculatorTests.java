/*
 * Copyright 2015-2021 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package Calc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTests {

	@Test
	@DisplayName("1 + 1 = 2")
	void addsTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
	}

	@Test
	@DisplayName("10 - 8 = 2")
	void subtractsTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.subtract(10, 8), "10 - 8 should equal 2");
	}
	
	@Test
	@DisplayName("4 * 3 = 12")
	void multipliesTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(12, calculator.multiply(4, 3), "4 * 3 should equal 12");
	}

	@Test
	@DisplayName("10 / 2 = 5")
	void divideesTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.divide(10, 2), "10 / 2 should equal 5");
	}
	
	@ParameterizedTest(name = "{0} + {1} = {2}")
	@CsvSource({
			"0,    1,   1",
			"1,    2,   3",
			"49,  51, 100",
			"1,  100, 101"
	})
	void addParameterized(int first, int second, int expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.add(first, second),
				() -> first + " + " + second + " should equal " + expectedResult);
	}
}
