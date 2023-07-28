package org.example.ch07;

/**
 * ch07. 제어자, static, final, abstract
 * static
 * static 멤버변수 : 모든 인스턴스에 공통적으로 사용할 수 있는 변수, 객체 생성 없이 사용 가능
 * static 메서드 : 인스턴스를 생성하지 않고 사용 가능, 인스턴스 변수를 사용할 수 없음
 */
public class StaticTest
{
	static int width = 200; // 클래스 변수, 간단 초기화
	static int height = 300;  // 클래스 변수, 간단 초기화
	
	static  {
		// 복잡한 초기화
	}
	
	static int max(int a, int b) // 클래스 메서드 (static 메서드)
	{
		return  a > b ? a : b;
	}
}
