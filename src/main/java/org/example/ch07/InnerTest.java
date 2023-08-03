package org.example.ch07;

/**
 * ch07. 내부 클래스의 종류, 특징, 선언
 * 내부 클래스
 * : 클래스 안의 클래스
 * 내부 클래스에서 외부 클래스로 쉽게 접근할 수 있다. (객체 생성 없이)
 */
class X {
	int i = 100;
	Y y = new Y();
	
	// Y_in 은 X의 내부 클래스
	class Y_in
	{
		void method()
		{
			// 객체 생성 없이 외부 클래스의 멤버 접근 가능
			System.out.println("i = " + i);
		}
	}
}

class Y
{
	void method()
	{
		X x = new X();
		System.out.println("x.i = " + x.i);
	}
}

class Z
{
	Y y = new Y();
}

public class InnerTest
{
	public static void main(String[] args)
	{
		Y y = new Y();
		y.method();
	}
}
