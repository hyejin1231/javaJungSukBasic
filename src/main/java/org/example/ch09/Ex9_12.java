package org.example.ch09;

/**
 * ch09. 오토박싱 & 언박싱, 문자열과 숫자변환
 */
public class Ex9_12
{
	public static void main(String[] args)
	{
		int i = 10;
		
		// 기본형을 참조형으로 형변환 (형변환 생략 가능)
		Integer intg = (Integer) i; // Integer intg = Integer.valueOf(i);
		Object obj = (Object) i; // Object obj = (Object) Integer.valueOf(i);
		
		Long lng = 100L;
		int i2 = intg + 10; // 기본형과 참조형 연산 가능
		long l = intg + lng; // 참조형간의 덧셈도 가능
		
		Integer integer = new Integer(20);
		int i3 = integer; // 참조형을 기본형으로 형변환도 가능 (형변환 생략 가능)
		
	}
}
