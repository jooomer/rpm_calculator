package ua.calculator.tdd;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import org.mockito.BDDMockito;

import static org.mockito.Mockito.*;

public class ABinaryMathOperatorShould {
	
	private BinaryMathOperator mockOperator;
	private OperandStack stackMock; 
	
	@Before
	public void init() {
		mockOperator = mock(BinaryMathOperator.class);
		stackMock = mock(OperandStack.class);
	}

	@Test
	public void acquireTwoParametersFromStack() {
		
		mockOperator.execute(stackMock);
		
		verify(stackMock, times(2)).peek();
		verify(stackMock, times(1)).pop();
	}
	
	@Test
	public void executeExtentionPoint() {
		BigDecimal lhs = new BigDecimal(9);
		BigDecimal rhs = new BigDecimal(-4);
		
		when(stackMock.peek()).thenReturn(rhs).thenReturn(lhs);
		
		mockOperator.execute(stackMock);

		verify(mockOperator, times(1)).executeImplementation(lhs, rhs);
	}
	
	@Test
	public void storeResultsToStack(){
		when(mockOperator.executeImplementation(any(BigDecimal.class), any(BigDecimal.class))).thenReturn(BigDecimal.TEN);
		mockOperator.execute(stackMock);

		verify(stackMock, times(1)).push(BigDecimal.TEN);
		
		
	}
}
