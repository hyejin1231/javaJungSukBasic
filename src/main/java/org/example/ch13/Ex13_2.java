package org.example.ch13;

/**
 * ch13. 싱글 쓰레드와 멀티 쓰레드, 쓰레드의 I/O 블락킹 
 */
public class Ex13_2
{
	static long startTime = 0;
	public static void main(String[] args)
	{
		Runnable runnable1 = new ThreadEx13_1();
		Thread thread1 = new Thread(runnable1);
		Runnable runnable2 = new ThreadEx13_2();
		Thread thread2 = new Thread(runnable2);
		
		thread1.start();
		thread2.start();
		
		startTime= System.currentTimeMillis();
		
		try
		{
			thread1.join(); // main 쓰레드가 thread1의 작업이 끝날 때 까지 기다린다.
			thread2.join(); // main 쓰레드가 thread2의 작업이 끝날 때 까지 기다린다.
		}
		catch (Exception e) {
		}
		System.out.println();
		System.out.println("startTime = " + startTime);
	}
}

class ThreadEx13_2 extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i< 300; i++)
		{
			System.out.print(new String("|"));
		}
	}
}

class ThreadEx13_1 implements Runnable
{
	
	@Override
	public void run()
	{
		for (int i = 0; i <300; i++)
		{
			System.out.print(new String("-"));
		}	
	}
}
