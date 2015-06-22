package ua.calculator.tdd;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class MathOperatorFactoryRegisteredOperatorsTest {

	private MathOperatorFactory factory;
	
	@Before
	public void init() {
		factory = new MathOperatorFactory();
	}
	
	@Test
	public void shouldBeAbleToFindAdd() {
		factory.findOperatorNamed("+");
	}

	@Test
	public void shouldBeAbleToFindSubtract () {
		factory.findOperatorNamed("-");
	}
	
	@Test
	public void shouldBeAbleToFindFactorial() {
		factory.findOperatorNamed("!");
	}
	
	@Test(expected = NoSuchOperatorException.class)
	public void shouldThrowExceptionForUnknownOperator () {
		factory.findOperatorNamed("Bogus operator");
	}
	
	@Test
	public void shouldBeAbleToFindMultiply() {
		factory.findOperatorNamed("*");
	}
	
	@Test
	public void shouldBeAbleToDivid() {
		factory.findOperatorNamed("/");
	}
}
