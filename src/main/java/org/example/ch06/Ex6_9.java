package org.example.ch06;

import org.example.ch06.tmp.Card;

/**
 * ch06. 참조형 매개변수, 참조형 반환타입
 */
public class Ex6_9
{
	public static void main(String[] args)
	{
		Card card = new Card();
		card.number = 10;
		System.out.println("main() number : " + card.number);
		
		change(card);
		System.out.println("* After change() *");
		System.out.println("main() number : " + card.number);
	}
	
	static void change(Card card) // 참조형 매개변수 (객체에 대한 주소를 알고 있음)
	{
		card.number = 20;
		System.out.println("change() number : " + card.number);
	}
}
