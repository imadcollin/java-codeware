package codewar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.stream.IntStream;

import org.junit.Test;

public class MultiplicationTableTest {
	MultiplicationTable mp = new MultiplicationTable();

	@Test
	public void multiplicationStr() {
		StringBuilder sb = new StringBuilder();
		sb.append("1 * 5 = 5");
		sb.append("\n");
		sb.append("2 * 5 = 10");
		sb.append("\n");
		sb.append("3 * 5 = 15");
		sb.append("\n");
		sb.append("4 * 5 = 20");
		sb.append("\n");
		sb.append("5 * 5 = 25");
		sb.append("\n");
		sb.append("6 * 5 = 30");
		sb.append("\n");
		sb.append("7 * 5 = 35");
		sb.append("\n");
		sb.append("8 * 5 = 40");
		sb.append("\n");
		sb.append("9 * 5 = 45");
		sb.append("\n");
		sb.append("10 * 5 = 50");
		sb.append("\n");
		assertNotNull(mp.multiplicationStr(5));
		assertEquals(sb.toString(), mp.multiplicationStr(5));
	}

	@Test
	public void multiplicationIntStreamTest() {
		StringBuilder sb = new StringBuilder();
		sb.append("1 * 5 = 5");
		sb.append("\n");
		sb.append("2 * 5 = 10");
		sb.append("\n");
		sb.append("3 * 5 = 15");
		sb.append("\n");
		sb.append("4 * 5 = 20");
		sb.append("\n");
		sb.append("5 * 5 = 25");
		sb.append("\n");
		sb.append("6 * 5 = 30");
		sb.append("\n");
		sb.append("7 * 5 = 35");
		sb.append("\n");
		sb.append("8 * 5 = 40");
		sb.append("\n");
		sb.append("9 * 5 = 45");
		sb.append("\n");
		sb.append("10 * 5 = 50");
		assertNotNull(mp.multiplicationIntStream(5));
		assertEquals(sb.toString(), mp.multiplicationIntStream(5));
	}
}
