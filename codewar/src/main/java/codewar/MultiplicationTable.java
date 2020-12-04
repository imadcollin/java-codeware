package codewar;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/******************************************************************************
 * 
 * Your goal is to return multiplication table for number
 * that is always an integer from 1 to 10. 
1 * 5 = 5
2 * 5 = 10
3 * 5 = 15
4 * 5 = 20
5 * 5 = 25
6 * 5 = 30
7 * 5 = 35
8 * 5 = 40
9 * 5 = 45
10 * 5 = 50
* 
 *******************************************************************************/

public class MultiplicationTable {

	public static void main(String[] args) {
	//	String str = multiplicationStr(5);
		//System.out.println(str);

		String intStreamStr = multiplicationIntStream(5); 
		System.out.println(intStreamStr);

	}

	public static String multiplicationStr(int num ){
		StringBuilder sb= new StringBuilder(); 

		for (int i = 1; i <= 10; i++) {
			sb.append(i + " * " + num + " = " + i * num+ "\n");

		}
		return sb.toString(); 
	}

	public static String multiplicationIntStream(int num){
		return IntStream.rangeClosed(1, 10).mapToObj(i -> i+" * "+num +" = " + i*num).collect(Collectors.joining("\n"));
	}
 }
