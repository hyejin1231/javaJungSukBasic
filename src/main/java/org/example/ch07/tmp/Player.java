package org.example.ch07.tmp;

/**
 * ch07. 추상 클래스, 추상 메서드
 * 추상 클래스
 * 추상 메서드가 있는 클래스를 추상 클래스라고 한다.
 * 다른 클래스 작성에 도움을 주기 위한 클래스, 인스턴스 생성 불가능
 */
abstract public class Player
{
	boolean pause; // 일시 정지 상태인지를 저장하기 위한 변수
	int currentPos; // 현재 play 되고 있는 위치를 저장하기 위한 변수
	
	Player() // 추상 클래스도 생성자가 있어야 한다.
	{
		pause = false;
		currentPos = 0;
	}
	
	abstract void play(int pos); // 추상 메서드
	
	abstract void stop(); // 추상 메서드
	
	void play() // 추상 메서드를 사용할 수 있다.
	{
		play(currentPos);
	}
}
