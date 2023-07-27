package org.example.ch07;

/**
 * ch07. 참조변수 super, 생성자 super()
 * super() : 조상의 생성자
 * 조상의 생성자를 호출할 때 사용
 */
class SuperPoint {
	int x, y;
	
	public SuperPoint(int x, int y)
	{
		// super(); // 모든 생성자는 첫줄에 다른 생성자를 호출한다. -> 따라서 컴파일러가 자동으로 Object의 super()를 호출한다.
		this.x = x;
		this.y = y;
	}
	
	String getLocation()
	{
		return "x = " + x + ", y = " + y;
	}
}

class SuperChild extends SuperPoint{
	int z;
	
	public SuperChild(int x, int y, int z)
	{
		super(x, y); // 조상클래스의 생성자 호출, 생성자의 첫줄에는 반드시 생성자를 호출해야 한다. ★★
		this.z = z; // 자신의 멤버를 초기화
	}
	
	@Override
	String getLocation()
	{
		return "x = " + x + ", y = " + y + ", z = " + z;
	}
}

public class Ex7_3
{
	public static void main(String[] args)
	{
		SuperPoint superPoint = new SuperChild(1, 2, 3);
		System.out.println("superPoint [ " + superPoint.getLocation() + " ]");
	}
}
