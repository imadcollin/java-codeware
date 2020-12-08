package codewar;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FactorialTest {
	@Test
	public void FactorialRecurcivTest() {
		Factorial f = new Factorial();
		assertEquals(24, f.factRecurciv(4));
	}

	@Test
	public void FactorialLoopTest() {
		Factorial f = new Factorial();
		assertEquals(24, f.factLoop(4));
	}
}
