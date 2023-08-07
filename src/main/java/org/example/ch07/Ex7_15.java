package org.example.ch07;

/**
 * ch07. 내부 클래스의 제어자와 접근성
 */
public class Ex7_15
{
	public static void main(String[] args)
	{
		Outer outer = new Outer(); // 외부 클래스 인스턴스를 먼저 생성해야 인스턴스 클래스 생성 가능
		Outer.InstanceInner instanceInner = outer.new InstanceInner();
		
		System.out.println(Outer.StaticInner.cv); // 외부 클래스의 객체 생성 없이 사용 가능
		
		// static 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 된다.
		Outer.StaticInner staticInner = new Outer.StaticInner();
		System.out.println("staticInner.iv = " + staticInner.iv);
	}
}
