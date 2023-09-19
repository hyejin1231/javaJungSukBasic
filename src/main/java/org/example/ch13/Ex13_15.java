package org.example.ch13;

/**
 * ch13. 쓰레드의 동기화 synchronized
 * : 한 번에 하나의 쓰레드만 접근할 수 있도록 객체에 락 lock 을 걸어서 데이터의 일관성을 유지하는 것
 */

public class Ex13_15
{
	public static void main(String[] args)
	{
		Runnable runnable = new RunnableEx();
		Thread thread = new Thread(runnable);
		Thread thread1 = new Thread(runnable);
		
		thread.start();
		thread1.start();
	}
}
class Account
{
	private int balance = 1000; // private 으로 해야 동기화의 의미가 있다.
	
	public synchronized int getBalance() // 읽는 중에도 값이 변경되면 안되니까 동기화 해줘야 함
	{
		return balance;
	}
	
	public synchronized void withDraw(int money) // synchronized 로 메서드 동기화
	{
		if (balance >= money) {
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
			
			}
			
			balance -= money;
		}
	}
}

class RunnableEx implements Runnable
{
	Account account = new Account();
	
	@Override
	public void run()
	{
		while (account.getBalance() > 0)
		{
			int money = (int) (Math.random() * 3 + 1 ) * 100;
			account.withDraw(money);
			System.out.println("balance = " + account.getBalance());
		}
	}
}