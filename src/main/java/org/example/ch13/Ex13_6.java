package org.example.ch13;

import javax.swing.*;

/**
 * ch13. 싱글 쓰레드와 멀티 쓰레드, 쓰레드의 I/O 블락킹
 * : 멀티 쓰레드
 */
public class Ex13_6
{
	// 멀티 쓰레드 : 외부 상황으로 인해서 다른 작업을 수행할 수 없을 때, 멀티 쓰레드는 이외의 작업을 수행해서 더 빠르게 효율적으로 작업을 끝낼 수 있다.
	public static void main(String[] args)
	{
		ThreadEx13_6 threadEx136 = new ThreadEx13_6();
		threadEx136.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");
		
	}
}

class ThreadEx13_6 extends Thread
{
	@Override
	public void run()
	{
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
