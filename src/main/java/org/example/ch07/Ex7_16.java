package org.example.ch07;

/**
 * ch07. 내부 클래스의 제어자와 접근성
 */
public class Ex7_16
{
	int value = 10;
	
	class Inner {
		int value = 20;
		
		void method()
		{
			int value = 30;
			System.out.println("value = " + value);
			System.out.println("this.value = " + this.value);
			System.out.println("Ex7_16.this.value = " + Ex7_16.this.value);
		}
	}
	
	public static void main(String[] args)
	{
		Ex7_16 ex716 = new Ex7_16();
		Inner inner = ex716.new Inner();
		inner.method();
	}
}
