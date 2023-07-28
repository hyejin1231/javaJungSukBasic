package org.example.ch07;

/**
 * ch07. 제어자, static, final, abstract
 * final
 * final 클래스 : 변경될 수 없는 클래스로 상속 불가 클래스
 * final 메서드 : 오버라이딩을 통해 재정의할 수 없는 메서드
 * final 변수 : 상수를 의미하는데 값을 변경할 수 없음
 */
final class FinalTest // 조상이 될 수 없는 클래스
{
	
	final int MAX_SIZE = 10; // 값을 변경할 수 없는 멤버변수 (상수)
	
	final int getMaxSize() // 오버라이딩을 할 수 없는 메서드 (변경 불가)
	{
		final int LV = MAX_SIZE;
		return MAX_SIZE;
	}
	
	public static void main(String[] args)
	{
	
	}
}
