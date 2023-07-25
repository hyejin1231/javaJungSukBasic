package org.example.ch06;

/**
 * ch06. 메서드 호출, return문, 반환값
 * return문 : 실행중인 메서드를 종료하고 호출했던 곳으로 돌아간다.
 * 반환값 : 타입이 일치해야 한다!!
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
		
		myMath.printGuGudan(12);
		myMath.printGuGudan(9);
		
		
	}
}

class MyMath {
	
	long add(long a, long b)
	{
		return a + b; // 반환타입이 void가 아닌 경우에는 return문 생략 불가능
	}
	
	long subtract(long a, long b)
	{
		return a - b; // 반환값의 타입이 일치해야한다!!
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
	
	void printGuGudan(int dan)
	{
		if (!(dan >= 2 && dan <= 9)) {
			return;
		}
		
		for (int i = 1; i<= 9; i++)
		{
			System.out.printf("%d * %d = %d%n", dan, i, (dan * i));
		}
		// return; // 생략 가능
	}
}