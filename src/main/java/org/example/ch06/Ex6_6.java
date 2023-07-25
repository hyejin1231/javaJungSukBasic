package org.example.ch06;

/**
 * ch06. 메서드란? 메서드의 선언부와 구현부, 메서드 호출
 */
public class Ex6_6
{
	public static void main(String[] args)
	{
		Ex6_6 ex66 = new Ex6_6();
		int addResult = ex66.add(10, 20); // add를 호출하고 결과를 addResult 에 저장
		System.out.println("addResult = " + addResult);
		
		ex66.printHello(); // 반환값 없음
	}
	
	
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
	
	public void printHello() // 반환값이 없는 경우 void, 작업 결과 저장 필요 x
	{
		System.out.println("Hello ?");
	}
}
