package org.example.ch06;

import org.example.ch06.tmp.Card;

/**
 * ch06. 참조형 매개변수, 참조형 반환타입
 */
public class Ex6_10
{
	public static void main(String[] args)
	{
		Card card = new Card();
		card.number = 10;
		
		Card copyCard = copy(card); // copy 메서드가 static 메서드이면서 같은 클래스에 있어서 객체 생성 없이 호출가능하다.
		
		System.out.println("card.number = " + card.number);
		System.out.println("copyCard.number = " + copyCard.number);
	}
	
	// 반환타입이 참조형이라는 건 객체의 주소가 반환된다는 것이다.
	static Card copy(Card card)
	{
		Card tmp = new Card(); // 1) 새로운 객체 tmp를 생성한다.
		
		tmp.number = card.number; // 2) card.number의 값을 tmp.number에 복사한다.
		
		return tmp; //  3) 복사한 객체의 주소를 반환한다.
	}
}
