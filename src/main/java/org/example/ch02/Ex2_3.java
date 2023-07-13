package org.example.ch02;

/**
 * ch02. 상수와 리터럴
 * 변수 : 하나의 값을 저장하기 위한 공간
 * 상수 : 값을 한번만 저장할 수 있는 공간
 * 리터럴 : 그 자체로 값을 의미함
 */
public class Ex2_3
{
	public static void main(String[] args)
	{
		int score = 100; //  변수 , 리터럴
		System.out.println("score = " + score);
		
		score = 200;
		System.out.println("score = " + score);
		
		final int MAX_SCORE = 100; // 상수, 리터럴
		System.out.println("MAX_SCORE = " + MAX_SCORE);
		
	}
}
