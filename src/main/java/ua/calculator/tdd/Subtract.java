package ua.calculator.tdd;

import java.math.BigDecimal;

public class Subtract extends BinaryMathOperator {

	@Override
	protected BigDecimal executeImplementation(BigDecimal lhs, BigDecimal rhs) {
		return lhs.subtract(rhs);
	}



}
