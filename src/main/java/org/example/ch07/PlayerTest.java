package org.example.ch07;

import org.example.ch07.tmp.AudioPlayer;
import org.example.ch07.tmp.Player;

public class PlayerTest
{
	public static void main(String[] args)
	{
//		Player player = new Player(); // error ! 추상 클래스의 객체 생성 안됨
		AudioPlayer audioPlayer = new AudioPlayer(); // 상속을 통해 추상 클래스를 완성해야 객체 생성 가능 , Player audioPlayer = new AudioPlayer(); 도 가능
		audioPlayer.play(100);
		audioPlayer.stop();
	}
}
