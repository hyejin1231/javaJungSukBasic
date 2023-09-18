package org.example.ch13;

/**
 * ch13. suspend(), resume(), stop()
 */
public class Ex13_12
{
	public static void main(String[] args)
	{
		RunImplEx13 runImplEx13 = new RunImplEx13();
		Thread thread1 = new Thread(runImplEx13, "*");
		Thread thread2 = new Thread(runImplEx13, "**");
		Thread thread3 = new Thread(runImplEx13, "***");
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		try
		{
			Thread.sleep(2000);
			thread1.suspend();
			
			Thread.sleep(2000);
			thread2.suspend();
			
			Thread.sleep(3000);
			thread1.resume();
			
			Thread.sleep(3000);
			thread1.stop();
			thread2.stop();
			
			Thread.sleep(3000);
			thread3.stop();
		}catch (InterruptedException e){
		
		}
		
	}
}

class RunImplEx13 implements Runnable
{
	
	@Override
	public void run()
	{
		while (true)
		{
			System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
			
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				throw new RuntimeException(e);
			}
		}
	}
}
