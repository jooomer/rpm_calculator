package ua.calculator.tdd;

import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.Deque;

public class OperandStack {

	private Deque<BigDecimal> values = new ArrayDeque<>();

	public BigDecimal peek() {
		if (values.size() > 0) {
			return values.peek();
		} else {
			return BigDecimal.ZERO;
		}
	}
 
	public void replaceTop(BigDecimal value) {
		this.pop();
		values.push(value);
	}

	public void push(BigDecimal value) {
		values.push(value);
	}

	public BigDecimal pop() {
		if (values.size() > 0) {
			return values.pop();
		} else {
			return BigDecimal.ZERO;
		}
	}

}
