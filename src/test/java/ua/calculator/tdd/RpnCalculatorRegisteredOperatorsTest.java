package ua.calculator.tdd;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class RpnCalculatorRegisteredOperatorsTest {

	private RpnCalculator calculator;
	
	@Before
	public void init() {
		calculator = new RpnCalculator();
		calculator.enter();
	}
	
	@Test
	public void shouldBeAbleToAdd() {
		calculator.execute("+");
	}

	@Test
	public void shouldBeAbleToSubtract () {
		calculator.execute("-");
	}
	
	@Test
	public void shouldBeAbleDoFactorial() {
		calculator.execute("!");
	}
	
	@Test(expected = NoSuchOperatorException.class)
	public void shouldThrowNoSatchOperatorException() {
		calculator.execute("Bogus operator");
	}
}
