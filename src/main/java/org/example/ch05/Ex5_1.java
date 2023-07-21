package org.example.ch05;

/**
 * ch05. 배열의 생성과 선언, 배열의 인덱스
 * 배열 : 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것 -> 많은 양의 데이터를 다루는데 유용
 * 배열의 요소는 서로 연속적이다.
 */
public class Ex5_1
{
	public static void main(String[] args)
	{
		int[] score; // 1) 배열 score를 선언 (배열을 다루기 위한 참조변수 선언)
		
		score = new int[5]; // 2) 배열의 생성 (int 저장공간 x 5, 실제 저장공간 생성)
		
		int[] score2 = new int[5]; // 배열의 선언과 생성을 동시에
		
		score[3] = 100;
		System.out.println("score[3] = " + score[3]);
		
		int value = score[3];
		System.out.println("value = " + value);
	}
}
