package org.example.ch06;

import org.example.ch06.tmp.Tv;

/**
 * ch06. 객체의 생성과 사용
 */
public class Ex6_2
{
	public static void main(String[] args)
	{
		// 1) 객체의 생성
		Tv tv; //클래스의 객체를 참조하기 위해 참조변수 선언
		tv = new Tv(); // 클래스의 객체를 생성 후 , 객체의 주소를 참조변수에 저장
		
		Tv tv2 = new Tv(); // 가비지 컬렉터 GC에 의해서 메모리에서 제거됨
		tv2 = tv; // 하나의 인스턴스를 여러 객체의 참조변수가 가리키는 경우 가능하다.
		
		// 2) 객체의 사용
		tv.channel = 7; // Tv 인스턴스의 멤버변수 channel의 값을 7로 설정
		tv.channelDown(); // Tv 인스턴스의 메서드 channelDown() 을 호출한다.
		System.out.println("Tv의 현재 채널은 " + tv.channel + "입니다.");
		System.out.println("Tv2의 현재 채널은 " + tv2.channel + "입니다.");
	}
}
