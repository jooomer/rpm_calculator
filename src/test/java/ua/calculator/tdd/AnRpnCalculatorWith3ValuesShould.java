package ua.calculator.tdd;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class AnRpnCalculatorWith3ValuesShould {

	private RpnCalculator calculator;
	private BigDecimal value = new BigDecimal(42);
	private BigDecimal value2 = new BigDecimal(2);
	private BigDecimal value3 = new BigDecimal(3);

	@Before
	public void init() {
		calculator = new RpnCalculator();
		calculator.setAccumulator(value);
		calculator.enter();
		calculator.setAccumulator(value2);
		calculator.enter();
		calculator.setAccumulator(value3);
	}
	
	@Test
	public void AllowToGetItsValues() {
		assertTrue(value3.equals(calculator.getValues().pop()));
		assertTrue(value2.equals(calculator.getValues().pop()));		
		assertTrue(value.equals(calculator.getValues().pop()));
	}

	@Test
	public void AllowMultipleValueToBeStored() {		
		assertEquals(value3, calculator.getAccumulator());
		calculator.drop();
		assertEquals(value2, calculator.getAccumulator());
		calculator.drop();
		assertEquals(value, calculator.getAccumulator());
		calculator.drop();
		assertEquals(BigDecimal.ZERO, calculator.getAccumulator());
	}
	
	@Test
	public void HaveTheLastValueEnteredInItsAccumulator() {
		assertEquals(value3, calculator.getAccumulator());
	}

	@Test
	public void HaveTheSecondToLastValueAfterASingleDrop() {
		calculator.drop();
		assertEquals(value2, calculator.getAccumulator());
	}
	
	@Test
	public void HaveTheFirstValueEnteredAfterTwoDrops() {
		calculator.drop();
		calculator.drop();
		assertEquals(value, calculator.getAccumulator());
	}
	
	@Test
	public void Have0AfterThreeDrops() {
		calculator.drop();
		calculator.drop();
		calculator.drop();
		assertEquals(BigDecimal.ZERO, calculator.getAccumulator());
	}


}