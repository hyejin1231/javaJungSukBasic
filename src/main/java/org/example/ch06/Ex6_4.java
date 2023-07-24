package org.example.ch06;

import org.example.ch06.tmp.Tv;

/**
 * ch06. 객체 배열
 * 객체 배열 == 참조변수 배열
 */
public class Ex6_4
{
	public static void main(String[] args)
	{
		Tv tvArr[] = new Tv[3]; // 길이가 3인 Tv 타입의 참조변수 배열
		
		// 객체를 생성해서 배열의 각 요소에 저장
		tvArr[0] = new Tv();
		tvArr[1] = new Tv();
		tvArr[2] = new Tv();
		
	}
}
