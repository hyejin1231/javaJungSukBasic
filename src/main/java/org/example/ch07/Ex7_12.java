package org.example.ch07;

/**
 * ch07. 내부 클래스의 제어자와 접근성
 */
class Ex7_12
{
	class InstanceInner {
		int iv = 100;
		static int cv = 100;
		final static int CONST = 100; // final static은 상수이므로 static 가능
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 200; // static 클래스만 static 멤버를 정의할 수 있다.
		
		//		int iv2 = iv22; static 클래스는 외부 클래스의 인스턴스 변수를 사용할 수 없다.
//		InstanceInner instanceInner = new InstanceInner(); // static 멤버는 인스턴스 멤버에 직접 접근 불가
	
	}
	
	void instatnceMethod()
	{
		StaticInner staticInner = new StaticInner();
//		LocalInner localInner = new LocalInner();  // error ! 지역 내부 클래스는 메서드 내에서만 사용 가능하다.
	}
	
	void myMethod()
	{
		class LocalInner {
			int iv = 300;
			static int cv = 300;
//			int lv = lv22; 외부 클래스의 지역변수는 final이 붙은 상수만 접근 가능하다.
			final static int CONST = 300; // final static은 상수이므로 static 가능
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("InstanceInner.CONST = " + InstanceInner.CONST);
		System.out.println("StaticInner.cv = " + StaticInner.cv);
//		System.out.println("LocalInner.CONST = " + LocalInner.CONST); // error ! 지역 내부 클래스는 메서드 내에서만 사용 가능하다.
	}
}
