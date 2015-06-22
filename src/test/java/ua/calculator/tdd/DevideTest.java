package ua.calculator.tdd;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import jdk.nashorn.internal.runtime.regexp.joni.constants.OPSize;

import org.junit.Before;
import org.junit.Test;

public class DevideTest {

	@Test
	public void shouldBeAbleToDivide() {
		OperandStack stack = new OperandStack();
		stack.push(new BigDecimal(12));
		stack.push(new BigDecimal(2));
		
		Divide divide = new Divide();
		divide.execute(stack);
		
		assertEquals(new BigDecimal(6), stack.peek());
	}

}
