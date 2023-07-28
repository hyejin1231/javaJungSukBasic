package org.example.ch07;

/**
 * ch07. 다형성
 * 조상 타입의 참조변수로 자손 타입의 객체를 다루는 것
 * 자손 타입의 참조변수로 조상 타입의 객체를 가리킬 수 없다.
 */
public class Ex7_5
{
	public static void main(String[] args)
	{
		Tv tv = new Tv(); // 참조변수와 인스턴스의 타입이 일치
		Tv smartTv = new SmartTv(); // 조상 타입의 참조변수로 자손 타입 인스턴스 참조
		
//		smartTv.caption; // error ! SmartTv의 멤버로 caption이 있어도 부모 타입의 참조변수이기 때문에 사용 불가

//		SmartTv s = new Tv(); // error ! 자손 타입의 참조변수로 조상 타입의 객체를 가리킬 수 없다.
	}
}
