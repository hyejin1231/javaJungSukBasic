package org.example.ch05;

/**
 * ch5. 배열의 길이, 배열의 초기화
 * 배열이름.length() : 배열의 길이
 * 배열은 한 번 생성하면 그 길이를 바꿀 수 없다.
 */
public class Ex5_2
{
	public static void main(String[] args)
	{
		int[] arr = new int[5]; // 길이가 5인 int 배열 arr 선언
		System.out.println("arr.length = " + arr.length);
		
		for (int i = 0; i< arr.length; i++)
		{
			arr[i] = i;
			System.out.println("arr[i] = " + arr[i]);
		}
		
	}
}
