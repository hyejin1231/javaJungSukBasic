package org.example.ch13;

import javax.swing.*;

/**
 * ch13. sleep(), interrupt()
 */
public class Ex13_11
{
	public static void main(String[] args)
	{
		Thread13_11 thread1311 = new Thread13_11();
		thread1311.start();
		System.out.println("thread1311.isInterrupted = " + thread1311.isInterrupted());
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");
		thread1311.interrupt();
		
		System.out.println("thread1311.isInterrupted = " + thread1311.isInterrupted()); // true (interrupt() 하면 false -> true 로 변경됨)
		System.out.println("Thread.interrupted = " + Thread.interrupted()); // false (현재 쓰레드가 interrupted 됐는지 확인 -> main 쓰레드)
	}
}

// '게임을 종료하시겠습니까? 10..9..8..7... 이런식의 로직과 동일함
class Thread13_11 extends Thread
{
	@Override
	public void run()
	{
		int i = 10;
		
		while(i != 0 && !isInterrupted())
		{
			System.out.println(i--);
			for (long x=  0; x < 2500000000L ; x++);
		}
		
		System.out.println("카운트가 종료되었습니다.");
	}
}
