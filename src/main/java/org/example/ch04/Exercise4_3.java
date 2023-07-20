package org.example.ch04;

public class Exercise4_3
{
	public static void main(String[] args)
	{
		int sum = 0;
		
		for (int i = 1; i <= 10; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(j + " ");
				sum += j;
			}
			System.out.println();
		}
		System.out.println("sum = " + sum); // 정답 220
	}
}
