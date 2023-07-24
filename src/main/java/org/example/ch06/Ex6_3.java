package org.example.ch06;

import org.example.ch06.tmp.Tv;

/**
 * ch06. 객체의 생성과 사용
 */
public class Ex6_3
{
	public static void main(String[] args)
	{
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();
		
		System.out.println("Tv의 현재 채널은 " + tv1.channel + "입니다.");
		System.out.println("Tv의 현재 채널은 " + tv2.channel + "입니다.");
		
		tv1.channel = 7;
		System.out.println();
		System.out.println("*tv1의 channel 값을 변경했습니다.*");
		System.out.println();
		
		// 객체마다 별도의 저장공간을 갖는다.
		System.out.println("Tv의 현재 채널은 " + tv1.channel + "입니다."); // 7
		System.out.println("Tv의 현재 채널은 " + tv2.channel + "입니다."); // 6
		
	}
}
