package ua.calculator.tdd;

import java.math.BigDecimal;

public abstract class BinaryMathOperator implements MathOperator {

	@Override
	public final void execute(OperandStack values) {
		BigDecimal rhs = values.peek();
		values.pop();
		BigDecimal lhs = values.peek();
		BigDecimal result = executeImplementation(lhs, rhs);
//		values.replaceTop(result);
		values.push(result);
	}

	protected abstract BigDecimal executeImplementation(BigDecimal lhs, BigDecimal rhs);
	
}
