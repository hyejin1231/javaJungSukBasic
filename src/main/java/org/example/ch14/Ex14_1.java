package org.example.ch14;

/**
 * ch14. 람다식이란? 람다식 작성하기
 */
public class Ex14_1
{
	public static void main(String[] args)
	{
	
//		Object obj = (a ,b ) -> a > b ? a: b;  // 람다식, 익명 객체
		
		// 람다식은 사실 익명 객체 안에 있어야 한다.
		// -> 왜냐하면 자바에서는 메서드가 클래스 안에 존재해야 하기 때문에!!
		Object obj = new Object()
		{
			int max(int a, int b)
			{
				return a > b ? a : b;
			}
		};
		
//		int value = obj.max(3, 5); // error 발생 ! Object 객체는 max를 가지고 있지 않기 때문에 error 발생, 형변환을 해줘야 하는데 형변환을 할수도 없다..
	}
}
