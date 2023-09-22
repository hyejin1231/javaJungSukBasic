package org.example.ch13_ex;

import java.util.ArrayList;

public class WaitNotifyExpl2
{
	public static void main(String[] args) throws InterruptedException
	{
		Table2 table = new Table2();
		
		new Thread(new Cook2(table), "COOK").start();
		new Thread(new Customer2(table, "donut"), "CUST1").start();
		new Thread(new Customer2(table, "burger"), "CUST2").start();
		
		Thread.sleep(5000);
		System.exit(0);
		
	}
}

class Customer2 implements Runnable
{
	private Table2 table;
	
	private String food;
	
	public Customer2(Table2 table, String food)
	{
		this.table = table;
		this.food = food;
	}
	
	@Override
	public void run()
	{
		while (true)
		{
			try
			{
				Thread.sleep(1000);
			}catch (InterruptedException e){}
			
			String name = Thread.currentThread().getName();
			
				System.out.println(name + " ate a " + food);
		}
	}
	
}

class Cook2 implements Runnable
{
	private Table2 table;
	
	public Cook2(Table2 table)
	{
		this.table = table;
	}
	
	@Override
	public void run()
	{
		while (true)
		{
			int idx = (int) (Math.random() * table.dishNum());
			table.add(table.dishNames[idx]);
			try
			{
				Thread.sleep(1000);
			}catch (InterruptedException e) {}
		}
	}
}

class Table2
{
	String[] dishNames = { "donut", "donut", "burger" };
	final int MAX_FOOD = 6;
	
	private ArrayList<String> dishes = new ArrayList<>();
	
	public synchronized void add(String dish)
	{
		if (dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " is Waiting..");
			try
			{
				wait();
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
			}
			return;
		}
		dishes.add(dish);
		notify();
		System.out.println("Dishes : " + dish);
	}
	
	public  void remove(String food)
	{
		synchronized (this) {
			String name = Thread.currentThread().getName();
			while (dishes.size() == 0)
			{
				System.out.println(name + " is Waiting..");
				try
				{
					wait();
					Thread.sleep(1000);
				}catch (InterruptedException e) {}
			}
			
			for (int i = 0; i< dishes.size(); i++)
			{
				if (food.equals(dishes.get(i))) {
					dishes.remove(i);
					notify();
					return;
				}
			}
			
			try
			{
				System.out.println(name + " is Waiting..");
				wait();
				Thread.sleep(1000);
			}catch (InterruptedException e) {}
		}
		
	}
	
	public double dishNum()
	{
		return dishNames.length;
	}
}