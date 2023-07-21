package org.example.ch05;

/**
 * ch05. 커맨드 라인 입력받기
 */
public class Ex5_11
{
	public static void main(String[] args)
	{
		System.out.println("매개변수의 개수 : " + args.length);
		for (int i = 0; i< args.length; i++)
		{
			System.out.println("args[i] = " + args[i]);
		}
	}
}
