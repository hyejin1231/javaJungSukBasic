package org.example.ch07;

/**
 * ch07. 내부 클래스의 제어자와 접근성
 */
public class Ex7_13
{
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner2{
		int iiv = outerIv; // 외부 클래스의 private 멤버도 접근할 수 있다.
		
		int iiv2 = outerCv;
	}
	
	static class StaticInner2{
		//		int siv = outerIv; //error ! static 클래스는 외부 클래스의 인스턴스 멤버에 접근할 수 없다.
		int scv = outerCv;
	}
	
	void myMethod()
	{
		int lv = 0;
		final int LV = 0;
		
		class LocalInner2{
			int liv = outerIv; // 외부 클래스의 지역변수는 상수만 접근 가능하다. 원래 에러나는데 jdk1.8 부터는 final이 생략가능해서 에러는 안난다.
			
			int lcv = outerCv;
			int liv3 = lv;
			int liv4= LV;
		}
	}
}
