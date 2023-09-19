package org.example.ch13;

/**
 * ch13. join(), yield()
 * join() : 특정 쓰레드가 작업하는 것을 기다리는 것
 * yield() : 남은 시간을 다음 쓰레드에게 양보하고, 자신(현재 쓰레드)는 실행 대기한다. (staic 메서드)
 */
public class Ex13_14
{
	static long startTime = 0;
	public static void main(String[] args)
	{
		Thread14_1 thread1 = new Thread14_1();
		Thread14_2 thread2 = new Thread14_2();
		
		thread1.start();
		thread2.start();
		
		startTime = System.currentTimeMillis(); // 시작 시간
		
		try
		{
			thread1.join(); // main 쓰레드가 thread1 작업이 끝날 때 까지 기다린다.
			thread2.join(); // main 쓰레드가 thread2 작업이 끝날 때 까지 기다린다.
		}
		catch (InterruptedException e) {
		
		}
		
		System.out.println("소요 시간 : " + (System.currentTimeMillis() - startTime));
	}
}

class Thread14_1 extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i < 300; i++)
		{
			System.out.print("-");
		}
	}
}

class Thread14_2 extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i< 300; i++)
		{
			System.out.print("|");
		}
	}
}
