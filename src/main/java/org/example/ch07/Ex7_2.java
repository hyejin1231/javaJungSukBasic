package org.example.ch07;

/**
 * ch07. 참조변수 super, 생성자 super()
 *
 * 참조변수 super
 * : 객체 자신을 가리키는 참조변수, 인스턴스 메서드 내에서만 존재
 * 조상의 멤버와 자신의 멤버를 구분하는데 사용
 *
 * super() 조상의 생성자
 * 조상의 생성자를 호출할 때 사용
 * 조상의 멤버는 조상의 생성자를 호출해서 초기화
 */
public class Ex7_2
{
	public static void main(String[] args)
	{
		Child child = new Child();
		child.method();
	}
}

class Parent {
	int x = 10;
	int y  = 30; // super.y와 this.y 둘다 가능 !
}

class Child extends Parent
{
	int x = 20;
	
	void method()
	{
		System.out.println("x = " + x);
		System.out.println("super.x = " + super.x);
		System.out.println("this.x = " + this.x);
		System.out.println();
		
		System.out.println("this.y = " + this.y);
		System.out.println("super.y = " + super.y);
	}
}

