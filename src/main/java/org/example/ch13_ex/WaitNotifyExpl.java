package org.example.ch13_ex;

import java.util.ArrayList;

import com.sun.source.tree.WhileLoopTree;

public class WaitNotifyExpl
{
	public static void main(String[] args) throws InterruptedException
	{
		Table table = new Table();
		
		new Thread(new Cook(table), "COOK").start();
		new Thread(new Customer(table, "donut"), "CUST1").start();
		new Thread(new Customer(table, "burger"), "CUST2").start();
		
		Thread.sleep(5000);
		System.exit(0);
		
	}
}

class Customer implements Runnable
{
	private Table table;
	
	private String food;
	
	public Customer(Table table, String food)
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
			
			if (eatFood()) {
				System.out.println(name + " ate a " + food);
			}else {
				System.out.println(name + " failed to eat. ");
			}
		}
	}
	
	private boolean eatFood()
	{
		return table.remove(food);
	}
}

class Cook implements Runnable
{
	private Table table;
	
	public Cook(Table table)
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

class Table
{
	String[] dishNames = { "donut", "donut", "burger" };
	final int MAX_FOOD = 6;
	
	private ArrayList<String> dishes = new ArrayList<>();
	
	public synchronized void add(String dish)
	{
		if (dishes.size() >= MAX_FOOD) {
			return;
		}
		dishes.add(dish);
		System.out.println("Dishes : " + dish);
	}
	
	public  boolean remove(String food)
	{
		synchronized (this) {
			while (dishes.size() == 0)
			{
				String name = Thread.currentThread().getName();
				System.out.println(name + " is Waiting..");
				try
				{
					Thread.sleep(1000);
				}catch (InterruptedException e) {}
			}
			
			for (int i = 0; i< dishes.size(); i++)
			{
				if (food.equals(dishes.get(i))) {
					dishes.remove(i);
					return true;
				}
			}
		}
		
		return false;
	}
	
	public double dishNum()
	{
		return dishNames.length;
	}
}