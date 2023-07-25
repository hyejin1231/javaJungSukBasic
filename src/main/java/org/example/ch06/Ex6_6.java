package org.example.ch06;

/**
 * ch06. 메서드란? 메서드의 선언부와 구현부
 */
public class Ex6_6
{
	public int add(int a, int b) // 선언부
	{
		return a  + b; // 구현부
	}
	
	// 지역변수 : 메서드 내에 선언된 변수 , 메서드 종료와 함께 소멸
	public int multiply(int a, int b) // 매개변수 a, b 도 지역변수
	{
		int result = a * b; // 지역변수
		return result;
	}
}
