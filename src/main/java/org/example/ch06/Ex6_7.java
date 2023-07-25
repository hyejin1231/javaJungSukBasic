package org.example.ch06;

/**
 * ch06. 메서드 호출
 */
public class Ex6_7
{
	public static void main(String[] args)
	{
		// 1) 객체 생성
		MyMath myMath = new MyMath();
		
		// 2) 메서드 호출
		long add = myMath.add(5L, 3L);
		long subtract = myMath.subtract(5L, 3L);
		long multiply = myMath.multiply(5L, 3L);
		double divide = myMath.divide(5L, 3L);
		long max = myMath.max(5L, 3L);
		long min = myMath.min(5L, 3L);
		
		System.out.println("add = " + add);
		System.out.println("subtract = " + subtract);
		System.out.println("multiply = " + multiply);
		System.out.println("divide = " + divide);
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		
	}
}

class MyMath {
	long add(long a, long b)
	{
		return a + b;
	}
	
	long subtract(long a, long b)
	{
		return a - b;
	}
	
	long multiply(long a, long b)
	{
		return a * b;
	}
	
	double divide(double a, double b)
	{
		return  a / b;
	}
	
	long max(long a, long b)
	{
		return (a > b) ? a : b;
	}
	
	long min(long a, long b)
	{
		return (a < b) ? a : b;
	}
}