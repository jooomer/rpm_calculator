package ua.calculator.tdd;

import java.math.BigDecimal;

public class RpnCalculator {

	private OperandStack values = new OperandStack();
		
	
	public BigDecimal getAccumulator() {
		return values.peek();
	}

	public void setAccumulator(BigDecimal value) {
		values.replaceTop(value);
	}

	public void enter() {
		values.push(getAccumulator());
	}

	public void drop() {
		values.pop();
	} 

	public OperandStack getValues() {
		return values;
	}

	public void add() {
		BigDecimal rhs = values.peek();
		this.drop();
		BigDecimal lhs = values.peek();
		BigDecimal result = rhs.add(lhs);
		values.replaceTop(result);
	}

	public void subtract() {
		BigDecimal rhs = values.peek();
		this.drop();
		BigDecimal lhs = values.peek();
		BigDecimal result = lhs.subtract(rhs);
		values.replaceTop(result);
	}

	public void factorial() {
		BigDecimal operand = values.peek();
		BigDecimal result = BigDecimal.ONE;
		
		while (operand.compareTo(BigDecimal.ONE) > 0) {
			result = result.multiply(operand);
			operand = operand.subtract(BigDecimal.ONE);
		}
		
		values.replaceTop(result);
		
	}	
	
	
}
