package org.example.ch05;

import java.util.Arrays;

/**
 * ch05. String 배열
 * String은 참조형으로 기본값은 null로 저장된다.
 */
public class Ex5_10
{
	public static void main(String[] args)
	{
		String[] strArr = { "가위", "바위", "보" };
		System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr));
		
		int i = (int) (Math.random() * 3);
		System.out.println("strArr = " + strArr[i]);
	}
}
