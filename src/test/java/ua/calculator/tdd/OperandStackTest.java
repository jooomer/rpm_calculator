package ua.calculator.tdd;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class OperandStackTest {

	OperandStack values;
	
	@Before
	public void init() {
		values = new OperandStack();
	}
	
	@Test
	public void IsNeverEmpty() {
		assertEquals(BigDecimal.ZERO, values.peek());
	}
		
	@Test
	public void CanReplaceTopValue() {
		values.replaceTop(BigDecimal.TEN);
		assertEquals(BigDecimal.TEN, values.peek());
	}
	
	@Test
	public void CanHaveValuesPushed() {
		values.push(BigDecimal.ONE);
		assertEquals(BigDecimal.ONE, values.peek());
	}
	
	@Test
	public void NopValueRemovedOnPop() {
		values.push(new BigDecimal(19));
		values.pop();
		assertEquals(BigDecimal.ZERO, values.peek());
	}
	
	@Test
	public void PopCanBeCalledWhenEmpty() {
		values.pop();
		assertEquals(BigDecimal.ZERO, values.peek());
		
	}
}
