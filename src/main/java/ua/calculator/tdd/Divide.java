package ua.calculator.tdd;

import java.math.BigDecimal;

public class Divide extends BinaryMathOperator {

	@Override
	protected BigDecimal executeImplementation(BigDecimal lhs, BigDecimal rhs) {
		return lhs.divide(rhs);
	}

}
