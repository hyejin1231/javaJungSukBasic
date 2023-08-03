package org.example.ch07;

/**
 * ch07. static 메서드, 디폴트 메서드
 * 인터페이스에 static 메서드, default 메서드를 제공함 (jdk 1.8부터)
 *
 * 디폴트 메서드가 기존 메서드와 충돌할 때는 오버라이딩을 통해 해결 !!
 */
public interface MyInterface
{
	void method();
	
	// default 키워드를 추가해줘야함
	default void newMethod()
	{
		System.out.println("MyInterface.newMethod");
	}
}
