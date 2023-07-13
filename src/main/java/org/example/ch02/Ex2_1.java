package org.example.ch02;

/**
 * ch2. 화면에 글자 출력하기 + 사칙연산
 * print() : 출력 후 줄바꿈 안함
 * println() : 출력 후 줄바꿈
 */
public class Ex2_1
{
	public static void main(String[] args)
	{
		System.out.println("===== 줄바꿈 =====");
		System.out.println("Hello");
		System.out.print("Hello");
		System.out.print("Hello");
		
		System.out.println();
		System.out.println("===== 사칙연산 =====");
		System.out.println("3 + 5 = " + (3 + 5));
		System.out.println("3 - 5 = " + (3 - 5));
		System.out.println("3 * 5 = " + (3 * 5));
		System.out.println("3 / 5 = " + (5 / 3.0));
	}
}
