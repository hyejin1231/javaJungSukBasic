package org.example.ch05;

/**
 * ch05. 배열의 활용 (1) ~ (2)
 */
public class Ex5_6
{
	public static void main(String[] args)
	{
		int sum = 0;
		float average = 0f;
		
		int[] score = {100, 88, 100, 100, 90};
		
		for (int i = 0; i< score.length; i++)
		{
			sum += score[i];
		}
		
		average = sum / (float) score.length; // 계산 결과를 얻기 위해서 float로 형변환
		
		System.out.println("sum = " + sum);
		System.out.println("average = " + average);
		
	}
}
