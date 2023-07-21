package org.example.ch05;

/**
 * ch05. 2차원 배열
 * : 1차원 배열의 배열
 */
public class Ex5_12
{
	public static void main(String[] args)
	{
		int[][] score = new int[4][3]; // 4행 3열의 2차원 배열 score 생성
		
		int[][] arr = {
				{ 1, 2, 3 }, { 4, 5, 6 }
		}; // 2차원 배열의 생성과 초기화
		
		System.out.println("arr = " + arr);
		System.out.println("arr[0] = " + arr[0]);
	}
}
