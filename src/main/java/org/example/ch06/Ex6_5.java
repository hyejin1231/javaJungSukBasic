package org.example.ch06;

import org.example.ch06.tmp.Card;

/**
 * ch06. 클래스 변수, 인스턴스 변수
 */
public class Ex6_5
{
	public static void main(String[] args)
	{
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		Card card = new Card();
		card.kind = "HEARD";
		card.number = 5;
		
		Card card2 = new Card();
		card2.kind = "SPADE";
		card2.number = 7;
		
		System.out.println();
		System.out.println("card = " + card);
		System.out.println("card2 = " + card2);
		
		// cv 값 변경 (모든 객체가 공유하는 클래스 변수의 값 변경)
		Card.width = 200;
		Card.height = 250;
		
		System.out.println();
		System.out.println("* Card width, height 변경 *");
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
	}
}
