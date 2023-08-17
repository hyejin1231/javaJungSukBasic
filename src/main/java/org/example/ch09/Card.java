package org.example.ch09;

import java.util.Objects;

/**
 * ch09. hashCode(), toString()
 * hashCode() : 객체 자신의 해시코드를 반환한다.
 * toString() : 객체 자신의 정보를 문자열로 반환한다.
 */
public class Card
{
	String kind;
	int number;
	
	public Card()
	{
		this("SPADE", 1);
	}
	
	public Card(String kind, int number)
	{
		this.kind = kind;
		this.number = number;
	}
	
	// 인스턴스 변수의 값을 비교하도록 equals() 오버라이딩
	@Override
	public boolean equals(Object obj)
	{
		// 참조변수의 형변환 전환은 반드시 instanceOf 로 확인해야함
		if (! (obj instanceof Card)) {
			return false;
		}
		
		// obj는 Object 타입이기 때문에 kind, number 값을 참조하기 위해서는 Card 타입으로 형변환이 필요함
		Card card = (Card) obj; // obj를 Card로 형변환
		
		return this.kind.equals(card.kind) && this.number == card.number;
	}
	
	// equals()를 오버라이딩하면 hashCode()도 오버라이딩 해야 한다.
	@Override
	public int hashCode()
	{
		return Objects.hash(kind, number);
	}
	
	// Object 클래스의 toString() 오버라이딩
	@Override
	public String toString()
	{
		return "Card{" +
				"kind='" + kind + '\'' +
				", number=" + number +
				'}';
	}
	
	public static void main(String[] args)
	{
		System.out.println(new Card().toString());
		System.out.println(new Card()); // toString() 생략 가능
		
		Card card = new Card();
		Card card1 = new Card();
		
		// equals의 결과가 true인 두 객체의 hash code는 같아야 하기 때문에 hashCode()도 같이 오버라이딩 해야 한다.
		System.out.println("card.equals(card1) = " + card.equals(card1));
		System.out.println("card.hashCode() = " + card.hashCode());
		System.out.println("card1.hashCode() = " + card1.hashCode());
	}
}
