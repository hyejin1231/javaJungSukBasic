package org.example.ch13;

/**
 * ch13. suspend(), resume(), stop() 
 */
public class Ex13_13
{
	public static void main(String[] args)
	{
		MyThread thread1 = new MyThread( "*");
		MyThread thread2 = new MyThread( "**");
		MyThread thread3 = new MyThread( "***");
		
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

class MyThread implements Runnable
{
	volatile  boolean suspended = false; // volatile : 쉽게 바뀌는 변수 (복사본 사용 안하고 원본 사용하도록 !)
	
	volatile  boolean stopped = false;
	
	Thread thread;
	
	public MyThread(String name)
	{
		thread = new Thread(this, name);
	}
	
	void start()
	{
		thread.start();
	}
	
	void stop()
	{
		stopped = true;
	}
	
	void suspend()
	{
		suspended = true;
	}
	
	void resume()
	{
		suspended = false;
	}
	
	@Override
	public void run()
	{
		while (!stopped)
		{
			if (!suspended) {
				System.out.println(
						"Thread.currentThread().getName() = " + Thread.currentThread()
								.getName());
				
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
}
