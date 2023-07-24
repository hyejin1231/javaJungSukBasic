package org.example.ch06.tmp;

public class Tv
{
	// 속성 (변수)
	public int channel; // 채널
	public String color; // 색상
	public boolean power; // 전원 상태
	
	// 기능 (메서드)
	public void channelDown()
	{
		channel--;
	}
	
	public void power()
	{
		power = !power;
	}
	
	public void channelUp()
	{
		channel++;
	}
}
