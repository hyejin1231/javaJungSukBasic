package org.example.ch09;

import java.util.ArrayList;

/**
 * ch09. 오토박싱 & 언박싱, 문자열과 숫자변환
 * : 기본형의 값을 객체로 자동변환하는 것을 오토박싱, 그 반대는 언박싱
 */
public class Ex9_11
{
	public static void main(String[] args)
	{
		// 문자열 -> 숫자로 변환하는 방법
		int i = new Integer("100").intValue(); // floatValue(), longValue()...
		int i1 = Integer.parseInt("100");
		Integer i2 = Integer.valueOf("100"); // 문자열 -> 래퍼 클래스
		
		// n진법의 문자열을 숫자로 변환하는 방법
		System.out.println("Integer.parseInt(\"100\", 2) = " + Integer.parseInt("100", 2));
		System.out.println("Integer.parseInt(\"100\", 8) = " + Integer.parseInt("100", 8));
		System.out.println("Integer.parseInt(\"100\", 16) = " + Integer.parseInt("100", 16));
		System.out.println("Integer.parseInt(\"FF\", 16) = " + Integer.parseInt("FF", 16));
		
		// 오토박싱 & 언박싱 (자동으로 컴파일러가 코드 추가해주는 것)
		int i3 = 10;
		int i4 = new Integer(20);
		int sum = i3 + i4; // 컴파일러가 i4를 자동으로 언박싱해줌
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		// arrayList.add(new Integer(10)); // 원래 이렇게 해야함
		arrayList.add(10); // 오토박싱 int -> Integer
		// int num = arraylist.get(0).intValue(); // 원래 이렇게 해야함
		int num = arrayList.get(0); // 언박싱 Integer -> int
	}
}
