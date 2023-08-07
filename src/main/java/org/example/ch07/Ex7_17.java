package org.example.ch07;

/**
 * ch07. 익명 클래스 anonymous class
 */
public class Ex7_17
{
		// 익명 클래스
		Object iv = new Object()
		{
			void method()
			{
			
			}
		};
	
	static Object cv = new Object()
	{
		void method()
		{
		
		}
	};
	
	void method()
	{
		// 익명 클래스
		Object lv = new Object()
		{
			void method()
			{
			
			}
		};
	}
}

