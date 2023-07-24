package org.example.ch06.tmp;

/**
 * ch06. 클래스 변수, 인스턴스 변수
 * 개별 속성 -> 인스턴스 변수
 * 공통 속성 -> 클래스 변수
 */
public class Card
{
	public String kind; // 무늬 (개별 속성)
	public int number; // 숫자 (개별 속성)
	
	public static int width = 100; // 폭 (공통 속성)
	public static int height= 200; // 높이 (공통 속성)
	
	@Override
	public String toString()
	{
		return "Card{" +
				"kind='" + kind + '\'' +
				", number=" + number +
				'}';
	}
}
