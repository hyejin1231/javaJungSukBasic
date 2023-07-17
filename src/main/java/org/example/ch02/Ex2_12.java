package org.example.ch02;

/**
 * ch02. 타입 간의 변환 방법
 * 1. 숫자 -> 문자 : (char) (3 + '0') --> '3'
 * 2. 문자 -> 숫자 : '3' - '0' --> 3
 * 3. 숫자 -> 문자열 : 3 + "" --> "3"
 * 4. 문자열 -> 숫자 : Integer.parseInt("3") --> 3
 * 5. 문자열 -> 문자 : "3".charAt('0') --> '3'
 * 6. 문자 -> 문자열 : '3' + "" --> "3"
 */
public class Ex2_12
{
	public static void main(String[] args)
	{
		String str = "3";
		
		System.out.println("(str.charAt(0) - '0') = " + (str.charAt(0) - '0')); // 3
		System.out.println("('3' - '0' + 1) = " + ('3' - '0' + 1)); // 문자 - '0' = 숫자로 변환 결과 : 4
		System.out.println("(Integer.parseInt(\"3\") + 1) = " + (Integer.parseInt("3") + 1)); // 4
		System.out.println("(\"3\" + 1) = " + ("3" + 1)); // 31
		System.out.println("(3 + '0') = " + (char)(3 + '0')); // 3
	}
}
