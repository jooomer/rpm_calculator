package ua.calculator.tdd;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MathOperatorFactory {
	
	private Map<String, MathOperator> operatorsByName;
	
	public MathOperatorFactory() {
		operatorsByName = new ConcurrentHashMap();
		registerOperators();
	}
	
	private void registerOperators() {
		operatorsByName.put("+", new Add());
		operatorsByName.put("-", new Subtract());
		operatorsByName.put("!", new Factorial());
		operatorsByName.put("*", new Multiply());
		operatorsByName.put("/", new Divide());
	}

	public MathOperator findOperatorNamed(String operatorName) {
		MathOperator operator = operatorsByName.get(operatorName);
		if (operator == null) {
			throw new NoSuchOperatorException();
		}
		return operator;

	}

}
