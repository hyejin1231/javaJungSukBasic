package org.example.ch07;

/**
 * ch07. 내부 클래스 종류와 특징, 선언
 */
public class Outer
{
	class InstanceInner {} // 인스턴스 클래스
	
	static class StaticInner {} // 스태틱 클래스
	
	void method()
	{
		class LocalInner {} // 지역 클래스
	}
}
