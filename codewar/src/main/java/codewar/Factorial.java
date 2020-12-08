package codewar;

/******************************************************************************
 * Factorial
 *******************************************************************************/
public class Factorial {
	public int factRecurciv(int n) {
		if (n == 0)
			return 1;
		else
			return n * factRecurciv(n - 1);
	}

	public int factLoop(int n) {
		int factorial = 1;
		while (n > 0) {
			factorial *= n;
			n--;
		}
		return factorial;
	}

}
