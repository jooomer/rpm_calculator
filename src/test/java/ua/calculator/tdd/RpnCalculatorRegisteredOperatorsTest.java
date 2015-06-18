package ua.calculator.tdd;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class RpnCalculatorRegisteredOperatorsTest {

	private RpnCalculator calculator;
	BigDecimal value = new BigDecimal(42);
	BigDecimal value2 = new BigDecimal(5);
	
	@Before
	public void init() {
		calculator = new RpnCalculator();
		calculator.setAccumulator(value);
		calculator.enter();
		calculator.setAccumulator(value2);
	}
	
	@Test
	public void shouldBeAbleToAdd() {
		calculator.execute("+");
		assertEquals(new BigDecimal(47), calculator.getAccumulator());
	}

	@Test
	public void shouldBeAbleToSubtract () {
		calculator.execute("-");
		assertEquals(new BigDecimal(37), calculator.getAccumulator());
	}
	
	@Test
	public void shouldBeAbleDoFactorial() {
		calculator.execute("!");
		assertEquals(new BigDecimal(120), calculator.getAccumulator());
	}
	
	@Test(expected = NoSuchOperatorException.class)
	public void shouldThrowNoSatchOperatorException() {
		calculator.execute("Bogus operator");
	}
}
