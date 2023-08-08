package org.example.ch08;

/**
 * ch08. 예외 처리하기, try-catch 문의 흐름
 */
public class Ex8_2
{
	public static void main(String[] args)
	{
		System.out.println(1);
		System.out.println(2);
		try
		{
			System.out.println(3);
			System.out.println(0 / 0);
			System.out.println(4); // 실행되지 않는다.
		}
		catch (ArithmeticException e)
		{
			if (e instanceof ArithmeticException)
			{
				System.out.println("true");
			}
			System.out.println("ArithmeticException");
		}
		catch (Exception e) { // 모든 예외 처리 가능, 여기서는 ArithmeticException 을 제외한 모든 예외가 처리된다.
			System.out.println("Exception");
		}
		System.out.println(5);
	}
}
