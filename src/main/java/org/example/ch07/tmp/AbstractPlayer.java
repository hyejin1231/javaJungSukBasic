package org.example.ch07.tmp;

/**
 * ch07. 추상 클래스, 추상 메서드
 * 추상 메서드를 일부만 구현해도 된다. -> 이럴 경우 클래스 앞에 abstract 키워드를 붙여야함
 */
abstract public class AbstractPlayer extends Player
{
	
	@Override
	void play(int pos)
	{
		System.out.println("AbstractPlayer.play");
	}
	
	// stop 은 구현하지 않았기 때문에 클래스 앞에 abstract를 붙여줘야 한다.
}
