package org.example.ch14;

/**
 * ch14. 함수형 인터페이스
 */
public class Ex14_2
{
	static void execute(MyFunction2 function2) // 매개변수 타입이 함수형 인터페이스인 메서드
	{
		function2.run();
	}
	
	static MyFunction2 getMyFunction() // 반환 타입이 함수형 인터페이스인 메서드
	{
		MyFunction2 f = () -> System.out.println("f3.run()");
		return f;
	}
	
	public static void main(String[] args)
	{
		MyFunction2 function1 = () -> System.out.println("f1.run()"); // 람다식으로 함수형 인터페이스의 run() 구현
		
		MyFunction2 function2 = new MyFunction2() // 익명클래스로 run() 을 구현
		{
			@Override
			public void run()
			{
				System.out.println("f2.run()");
			}
		};
		
		MyFunction2 function3 = getMyFunction();
		
		function1.run();
		function2.run();
		function3.run();
		
		execute(function1);
		execute(() -> System.out.println("run()"));
	}
}

@FunctionalInterface
interface MyFunction2
{
	void run();
}
