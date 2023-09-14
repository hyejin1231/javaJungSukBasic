package org.example.ch13;

/**
 * ch13. 쓰레드의 구현과 실행
 * - Thread 클래스를 상속
 * - Runnable 인터페이스를 구현
 */
public class Ex13_1
{
	public static void main(String[] args)
	{
		ThreadEx1_1 thread1 = new ThreadEx1_1();
		
		Runnable r = new ThreadEx1_2();
		Thread thread2 = new Thread(r);
		
		// 이 두 쓰레드 중에 어느것을 먼저 실행할 지는 모름 -> cpu가 스케줄러가 스케줄을 결정하기 때문에
		// start 했다고 즉시 실행된건 아니고, 먼저 start 했다고 먼저 실행되는 건 아니다.
		thread1.start(); // thread1 을 실행시킨다.
		thread2.start(); // thread2 을 실행시킨다.
	}
}

// Thread 클래스를 상속받아서 구현
class ThreadEx1_1 extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i< 5; i++)
		{
			System.out.println(getName()); // 조상인 Thread의 getName() 을 호출
		}
	}
}

// Runnable 인터페이스를 구현
class ThreadEx1_2 implements Runnable
{
	@Override
	public void run()
	{
		for (int i = 0; i< 5; i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}
