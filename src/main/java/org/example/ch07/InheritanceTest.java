package org.example.ch07;

/**
 * ch07. 클래스간의 관계, 상속과 포함, 단일 상속, Object 클래스
 * 포함 관계
 * : 클래스의 멤버로 참조변수를 선언하는 것
 */
class MyPoint /* extends Object */{ // 컴파일 하면 컴파일러가 자동으로 Object 상속을 넣는다.
	int x;
	int y;
}

class MyCircle extends MyPoint { // 상속 관계
	int r;
}

class MyCircle2 { // 포함 관계
	MyPoint point = new MyPoint(); // 참조변수의 초기화
	int r;
}

public class InheritanceTest
{
	public static void main(String[] args)
	{
		// 상속 관계
		MyCircle circle = new MyCircle();
		circle.x =1;
		circle.y = 2;
		circle.r = 3;
		
		System.out.println("circle.x = " + circle.x);
		System.out.println("circle.y = " + circle.y);
		System.out.println("circle.r = " + circle.r);
		
		// 포함 관계
		MyCircle2 myCircle2 = new MyCircle2();
		myCircle2.point.x = 1;
		myCircle2.point.y = 2;
		myCircle2.r =3;
		
		System.out.println("myCircle2.point.x = " + myCircle2.point.x);
		System.out.println("myCircle2.point.y = " + myCircle2.point.y);
		System.out.println("myCircle2.r = " + myCircle2.r);
		
		System.out.println("myCircle2.toString() = " + myCircle2.toString()); // toString() 생략 가능
	}
}
