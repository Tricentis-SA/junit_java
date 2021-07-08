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

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract (int a, int b) {
		return a-b;
	}
	
	public long multiply (int a, int b) {
		return a * b;
	}
	
	public double divide(int a, int b) {
		double result;
		if (b == 0) {
		throw new IllegalArgumentException("Divisor cannot divide by zero");
		} else {
		result = Double.valueOf(a)/Double.valueOf(b);
		}
		return result;
			}
	}

}
