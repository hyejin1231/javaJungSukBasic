package org.example.ch07;

/**
 * ch07. 상속
 */
class Tv { // 부모 클래스
	boolean power;
	 int channel;
	 
	 void power() {power = !power;}
	void channelUp () { channel ++;}
	void channelDown() {channel--;}
}

class SmartTv extends  Tv { // 자식 클래스
	boolean caption;
	
	void displayCaption(String text)
	{
		if (caption) {
			System.out.println("text = " + text);
		}
	}
}
public class Ex7_1
{
	public static void main(String[] args)
	{
		SmartTv smartTv = new SmartTv();
		smartTv.channel= 100; // 조상클래스로부터 상속받은 멤버
		smartTv.channelUp(); // 조상클래스로부터 상속받은 멤버
		smartTv.displayCaption("hi1");
		smartTv.caption = true;
		smartTv.displayCaption("hi2");
	}
}
