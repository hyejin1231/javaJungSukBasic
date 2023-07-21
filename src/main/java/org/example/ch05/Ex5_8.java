package org.example.ch05;

import java.util.Arrays;

/**
 * ch05. 배열의 활용 (3) ~ (4)
 */
public class Ex5_8
{
	public static void main(String[] args)
	{
		int[] numArr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Arrays.toString(numArr) = " + Arrays.toString(numArr));
		
		for (int i = 0; i< 100; i++)
		{
			int n = (int) (Math.random() * 10);
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		
		System.out.println("Arrays.toString(numArr) = " + Arrays.toString(numArr));
	}
}
