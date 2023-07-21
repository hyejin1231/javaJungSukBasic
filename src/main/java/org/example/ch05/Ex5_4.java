package org.example.ch05;

import java.util.Arrays;

/**
 * ch05. 배열의 출력
 */
public class Ex5_4
{
	public static void main(String[] args)
	{
		int[] iArr = { 100, 95, 80, 70, 60 };
		
		System.out.println("iArr = " + iArr); // [I@682a0b20 주소값 출력
		
		char[] chArr = { 'a', 'b', 'c', 'd', 'e' };
		System.out.println(chArr); // abcde 출력 (char형만 예외)
		
		// 배열의 요소를 순서대로 하나씩 출력
		for (int i = 0; i< iArr.length; i++)
		{
			System.out.println("iArr[i] = " + iArr[i]);
		}
		
		// Arrays.toString(배열) :  배열의 모든 요소를 문자열로 출력
		System.out.println("Arrays.toString(iArr) = " + Arrays.toString(iArr));
	}
}
