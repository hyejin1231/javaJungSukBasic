package org.example.ch13;

import javax.swing.*;

/**
 * ch13. 싱글 쓰레드와 멀티 쓰레드, 쓰레드의 I/O 블락킹
 * : 싱글 쓰레드
 */
public class Ex13_5
{
	// 싱글 쓰레드 : 사용자가 입력을 안하면 다음 작업을 진행할 수 없다.
	public static void main(String[] args)
	{
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");
		
		
		for (int i = 10; i > 0; i--)
		{
			System.out.println(i);
			
			try
			{
				Thread.sleep(1000); // 1초씩 시간 지연
			}
			catch (InterruptedException e)
			{
				throw new RuntimeException(e);
			}
		}
	}
}
