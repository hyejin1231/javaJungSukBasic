package org.example.ch13;

/**
 * ch13. 싱글 쓰레드와 멀티 쓰레드, 쓰레드의 I/O 블락킹
 */
public class Ex13_4
{
	public static void main(String[] args)
	{
		MyThread1 myThread1 = new MyThread1();
		MyThread2 myThread2 = new MyThread2();
		
		myThread1.start();
		myThread2.start();
	}
}

// 멀티 쓰레드
class MyThread1 extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i< 300; i++)
		{
			System.out.print("-");
		}
	}
}

class MyThread2 extends Thread
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
