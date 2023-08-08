package org.example.ch08;

/**
 * ch08. 예외 처리하기, try-catch 문의 흐름
 */
public class Ex8_1
{
	public static void main(String[] args)
	{
		System.out.println(1);
		
		try
		{
			System.out.println("(0/0) = " + (0 / 0)); // Exception 발생
			System.out.println(2);
		}
		catch (ArithmeticException e) {
			System.out.println(3);
		}
		System.out.println(4);
	}
}
