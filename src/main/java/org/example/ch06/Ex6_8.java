package org.example.ch06;

import org.example.ch06.tmp.Card;

/**
 * ch06. 기본형 매개변수
 * 기본형 매개변수 : 변수의 값을 읽기만 할 수 있다.
 * 참조형 매개변수 : 변수의 값을 읽고, 변경도 할 수 있다.
 */
public class Ex6_8
{
	public static void main(String[] args)
	{
		Card card = new Card();
		card.number = 10;
		System.out.println("main() number : " + card.number);
		
		change(card.number);
		
		System.out.println("After change card.number");
		System.out.println("main() number : " + card.number);
		
	}
	
	static void change(int number)
	{
		number = 1000; // 지역변수 number 을 변경한 것
		System.out.println("change() number : " + number);
	}
	
}
