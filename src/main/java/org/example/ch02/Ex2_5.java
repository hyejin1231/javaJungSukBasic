package org.example.ch02;

/**
 * ch2. 두 변수 바꾸기
 */
public class Ex2_5
{
	public static void main(String[] args)
	{
		System.out.println("===== 두 변수 바꾸기 =====");
		int x = 4, y = 2;
		int tmp;
		
		tmp = x;
		x = y ;
		y = tmp;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
	}
}
