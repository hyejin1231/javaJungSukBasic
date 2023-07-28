package org.example.ch07.tmp;

/**
 *  ch07. 다형성
 */
public class Tv
{
	int channel;
	String color;
	boolean power;
	
	void power() {power = !power;}
	void channelUp () { channel ++;}
	void channelDown() {channel--;}
}
