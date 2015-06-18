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

	private void add() {
		new Add().execute(values);
	}

	public void subtract() {
		new Subtract().execute(values);
	}
 
	private void factorial() {
		new Factorial().execute(values);
	}

	public void execute(String operatorName) {
		MathOperator operator = findOperatorNamed(operatorName);
		operator.execute(values);
	}

	private MathOperator findOperatorNamed(String operatorName) {
		if (operatorName.equals("+")) {
			return new Add();
		} else if (operatorName.equals("-")) {
			return new Subtract();
		} else if (operatorName.equals("!")) {
			return new Factorial();
		} else if (operatorName.equals("*")) {
			return new Multiply();
		} else {
			throw new NoSuchOperatorException();
		}
	}	
	
	
}
