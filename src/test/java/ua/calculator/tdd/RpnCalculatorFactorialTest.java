package ua.calculator.tdd;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class RpnCalculatorFactorialTest {

	private RpnCalculator calculator;
	
	@Before
	public void init() {
		calculator = new RpnCalculator();
	}
	
	@Test
	public void factorialOf0Is1() {
		calculator.execute("!");
		assertEquals(BigDecimal.ONE, calculator.getAccumulator());
	}

	@Test
	public void factorialOf5Is120() {
		calculator.setAccumulator(new BigDecimal(5));
		calculator.execute("!");
		assertEquals(new BigDecimal(120), calculator.getAccumulator());
	}

}
