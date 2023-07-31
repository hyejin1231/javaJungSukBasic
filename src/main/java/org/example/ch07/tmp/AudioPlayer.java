package org.example.ch07.tmp;

/**
 * ch07. 추상 클래스, 추상 메서드
 * 추상 메서드는 자손 클래스마다 다르게 구현되어야 하는 경우에 사용한다.
 * 추상 클래스를 상속을 통해 완성해야 객체 생성 가능하다.
 */
public class AudioPlayer extends Player
{
	
	@Override
	public void play(int pos)
	{
		System.out.println(pos + "위치부터 play 합니다.");
	}
	
	@Override
	public void stop()
	{
		System.out.println("재생을 멈춥니다.");
	}
}
