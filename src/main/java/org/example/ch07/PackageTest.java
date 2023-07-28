package org.example.ch07;

import static java.lang.Math.*;

/**
 * ch07. 패키지, 클래스 패스, import문, static import 문
 * 패키지 : 서로 관련 있는 클래스들의 묶음
 * 클래스 패스 : 클래스 파일 (*.class)의 위치를 알려주는 경로  -> 환경 변수 classpath에 등록해줘야 함
 * import 문 : 클래스를 사용할 때 패키지 이름을 생략할 수 있음, 컴파일러에게 클래스가 속한 패키지를 알려줌
 * static import 문 : static 멤버를 사용할 때 클래스 이름을 생략 할 수 있음.
 */
public class PackageTest
{
	public static void main(String[] args)
	{
		System.out.println("PackageTest.main");
		System.out.println(random());  // Math는 static import 문으로 클래스 이름을 생략할 수 있다.
	}
}
