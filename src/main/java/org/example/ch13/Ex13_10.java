package org.example.ch13;

/**
 * ch13. sleep(), interrupt()
 * - 현재 쓰레드를 지정된 시간만큼 멈추게 한다.
 * - 특정 쓰레드 지정해서 멈추게 할 수는 없다.
 */
public class Ex13_10
{
	public static void main(String[] args)
	{
		Thread13_1 thread131 = new Thread13_1();
		Thread13_2 thread132 = new Thread13_2();
		
		thread131.start();
		thread132.start();
		
		try
		{
			Thread.sleep(2000); // main 쓰레드가 sleep
		}
		catch (InterruptedException e)
		{
		}
		
		System.out.print("<<main 종료>>");
	}
}

class Thread13_1 extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i < 300; i++)
		{
			System.out.print("-");
		}
			System.out.print("<<th1 종료>>");
	}
}

class Thread13_2 extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i < 300; i++)
		{
			System.out.print("|");
		}
			System.out.print("<<th2 종료>>");
	}
}
