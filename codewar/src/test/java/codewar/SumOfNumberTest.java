package codewar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.stream.IntStream;

import org.junit.Test;

public class SumOfNumberTest {
	SumOfNumbers obj = new SumOfNumbers();

	@Test
	public void SquareTest() {
		int[] arr = { 1, 2, 3, 4 };
		assertEquals(30, obj.squareSum(arr));
		assertEquals(9, obj.squareSum(new int[] { 1, 2, 2 }));
	}

	@Test
	public void SquareSumFalseTest() {
		int[] arr = { 2, 2 };
		assertNotEquals(4, obj.squareSum(arr));
	}
	
	@Test
	public void StreamSquareSumTest() {
		assertEquals(9, obj.squareSum(new int[] { 1, 2, 2 }));
		assertEquals(14, obj.squareSum(new int[] { 1, 3, 2 }));
	}

	@Test
	public void StreamSquareSumFalseTest() {
		int[] arr = { 2, 2 };
		assertNotEquals(4, obj.streamSquareNum(arr));
	}

}
