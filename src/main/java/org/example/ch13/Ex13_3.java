package org.example.ch13;

/**
 * ch13. 싱글 쓰레드와 멀티 쓰레드, 쓰레드의 I/O 블락킹
 */
public class Ex13_3
{
	// 싱글 쓰레드
	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i< 300; i++)
		{
			System.out.print("-");
		}
		
		System.out.println();
		System.out.println("startTime = " + startTime);
		
		long startTime2 = System.currentTimeMillis();
		for (int i = 0; i< 300; i++)
		{
			System.out.print("|");
		}
		
		System.out.println();
		System.out.println("startTime = " + startTime2);
	}
}
