package ua.calculator.tdd;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import com.sun.accessibility.internal.resources.accessibility;

public class AnRpnCalculatorWithTwoOprandsShould {
	
	private RpnCalculator calculator;
	
	@Before
	public void init() {
		calculator = new RpnCalculator();
		calculator.setAccumulator(new BigDecimal(3));
		calculator.enter();
		calculator.setAccumulator(new BigDecimal(4));
	}
	
	@Test
	public void executeAddTwoNumbersCorrectly() {
		calculator.execute("+");
		assertEquals(new BigDecimal(7), calculator.getAccumulator());
	}

	@Test
	public void executeSubtractTwoNumbersCorrectly() {
		calculator.execute("-");
		assertEquals(new BigDecimal(-1), calculator.getAccumulator());
	}

	@Test
	public void executeFactorialCorrectly() {
		calculator.execute("!");
		assertEquals(new BigDecimal(24), calculator.getAccumulator());
	}

	@Test
	public void executeMultiplyTwoNumbersCorrectly() {
		calculator.execute("*");
		assertEquals(new BigDecimal(12), calculator.getAccumulator());
	}
}
