package org.example.ch07;

/**
 * ch07. 추상 클래스의 작성 (1)
 * 여러 클래스에 공통적으로 사용할 수 있는 추상 클래스를 바로 작성하거나
 * 기존 클래스의 공통 부분을 뽑아서 추상 클래스를 만든다.
 */
abstract class Unit {
	int x, y;
	
	abstract void move(int x, int y);
	
	void stop()
	{
		System.out.println("현재 위치에서 stop 합니다.");
	}
}

class Tank extends Unit
{
	@Override
	void move(int x, int y)
	{
		System.out.println("Tank 현재 위치 x = " + x  + ", y = " + y + " 입니다.");
	}
	
	void changeMode()
	{
		System.out.println("Tank.changeMode");
	}
}

class Marine extends Unit
{
	
	@Override
	void move(int x, int y)
	{
		System.out.println("Marine 현재 위치 x = " + x  + ", y = " + y + " 입니다.");
	}
	
	void stimPack()
	{
		System.out.println("Marine.stimPack");
	}
}

class DropShip extends Unit
{
	
	@Override
	void move(int x, int y)
	{
		System.out.println("DropShip 현재 위치 x = " + x  + ", y = " + y + " 입니다.");
	}
}


public class UnitTest
{
	public static void main(String[] args)
	{
//		Unit[] units = new Unit[3];
//		units[0] = new Marine();
//		units[1] = new Tank();
//		units[2] = new DropShip();
		
		 Unit[] units = {new Marine(), new Tank(), new DropShip()}; // 배열의 생성과 초기화를 한 번에!
		
		for (int i = 0; i < units.length; i++)
		{
			units[i].move(100 * (i+1), 200 * (i+1));
		}
	}
}
