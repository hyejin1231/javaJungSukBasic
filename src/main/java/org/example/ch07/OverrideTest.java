package org.example.ch07;

/**
 * ch07. 오버라이딩
 * : 상속받은 조상의 메서드를 자신에 맞게 변경하는 것
 */
class Point {
	int x;
	int y;
	
	
	public String toString()
	{
		return "x = " + x + ", y = " + y;
	}
	
	String getLocation()
	{
		return "x = " + x + ", y = " + y;
	}
}

class Point3D extends Point
{
	int z;
	
	// 오버라이딩
	@Override
	String getLocation()
	{
		return "x = " + x + ", y = " + y + ", z = " + z;
	}
}


public class OverrideTest
{
	public static void main(String[] args)
	{
		Point3D point3D = new Point3D();
		point3D.x = 3;
		point3D.y = 7;
		point3D.z = 10;
		
		System.out.println("point3D.getLocation() = " + point3D.getLocation());
		
		Point point = new Point();
		point.x = 10;
		point.y = 20;
		System.out.println("point = " + point);
	}
}
