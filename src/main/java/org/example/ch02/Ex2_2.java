package org.example.ch02;

/**
 * ch02. 변수, 변수의 저장 과정
 */
public class Ex2_2
{
	public static void main(String[] args)
	{
		System.out.println("===== 변수 사용 전 =====");
		System.out.println("6 + 3 = " + (6 + 3));
		System.out.println("6 - 3 = " + (6 - 3));
		System.out.println("6 * 3 = " + (6 * 3));
		System.out.println("6 / 3 = " + (6 / 3));
		
		System.out.println();
		System.out.println("===== 변수 사용 후 =====");
		int x = 4,  y = 2;
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y));
		
		
	}
}
