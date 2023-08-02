package org.example.ch07;

/**
 * ch07. 인터페이스 장점 (2)
 * - 개발 시간을 단축할 수 있다.
 * - 변경에 유리한 유연한 코드를 만들 수있다.
 * - 표준화가 가능하다.
 * - 서로 관련없는 클래스들을 관계 맺어줄 수 있다.
 */
interface Repairable {}
class MyUnit {
	int hitPoint;
	final int MAX_HP;
	
	MyUnit(int hp)
	{
		MAX_HP = hp;
	}
}

class AirUnit extends MyUnit
{
	AirUnit(int hp)
	{
		super(hp);
	}
}

class GroundUnit extends MyUnit
{
	GroundUnit(int hp)
	{
		super(hp);
	}
}

class MyTank extends GroundUnit implements Repairable
{
	MyTank()
	{
		super(150);
		hitPoint = MAX_HP;
	}
	
	@Override
	public String toString()
	{
		return "Tank";
	}
}

class SCV extends GroundUnit implements Repairable
{
	
	SCV()
	{
		super(60);
		hitPoint = MAX_HP;
	}
	
	@Override
	public String toString()
	{
		return "SCV";
	}
	
	void repair(Repairable repairable)
	{
		if (repairable instanceof MyUnit) {
			MyUnit myUnit = (MyUnit) repairable;
			while (myUnit.hitPoint != myUnit.MAX_HP)
			{
				myUnit.hitPoint++;
			}
		}
	}
}

class MyMarine extends GroundUnit
{
	MyMarine()
	{
		super(40);
		hitPoint = MAX_HP;
	}
}


public class Ex7_11
{
	public static void main(String[] args)
	{
		MyTank myTank = new MyTank();
		MyMarine myMarine = new MyMarine();
		SCV scv = new SCV();
		
		scv.repair(myTank);
//		scv.repair(myMarine); // error ! Repairable 을 구현하지 않았기 때문
	}
}
