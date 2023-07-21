package org.example.ch05;

import java.util.Arrays;

/**
 * ch05. 배열의 출력
 */
public class Ex5_5
{
	public static void main(String[] args)
	{
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = { 100, 90, 80, 70, 60 };
		char[] chArr = { 'a', 'b', 'c', 'd' };
		
		// 1 ~ 10 의 숫자를 순서대로 배열에 저장
		for (int i = 0; i< iArr1.length; i++)
		{
			iArr1[i] = i + 1;
		}
		
		// 1 ~ 10 사이의 랜덤값을 배열에 저장
		for (int i = 0; i< iArr2.length; i++)
		{
			iArr2[i] = (int) (Math.random() * 10) + 1;
		}
		
		// 배열에 저장된 값 출력
		System.out.println("Arrays.toString(iArr1) = " + Arrays.toString(iArr1));
		
		System.out.println("Arrays.toString(iArr2) = " + Arrays.toString(iArr2));
		
		System.out.println("Arrays.toString(iArr3) = " + Arrays.toString(iArr3));
		
		System.out.println( chArr);
	}
}
