package org.example.ch14;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * ch14. 메서드 참조, 생성자의 메서드 참조
 */
public class Ex14_6
{
	public static void main(String[] args)
	{
		// 메서드 참조 사용 전
		Function<String, Integer> function = s -> Integer.parseInt(s);
		System.out.println("function.apply(\"300\") = " + function.apply("300"));
		
		// 메서드 참조 사용 후 -> 입력과 출력의 값이 뭔지 다 알 수 있기 때문에 다 생략해도 된다.
		Function<String, Integer> function1 = Integer::parseInt;
		System.out.println("function1.apply(\"400\") = " + function1.apply("400"));
		
		// Supplier : 입력 x , 출력 o
		// 메서드 참조 사용 전
		Supplier<MyClass> s = () -> new MyClass();
		System.out.println("s.get() = " + s.get());
		
		// 메서드 참조 사용 후
		Supplier<MyClass> supplier = MyClass::new;
		System.out.println("supplier.get() = " + supplier.get());
		
		Function<Integer, MyClass> function2 = MyClass::new;
		System.out.println("function2.apply(10) = " + function2.apply(10));
		System.out.println("function2.apply(10).myAge = " + function2.apply(10).myAge);
		
		// 배열의 메서드 참조
		Function<Integer, int[]> integerFunction = int[]::new; // 메서드 참조 사용 후
		Function<Integer, int[]> integerFunction1 = x -> new int[x]; // 메서드 참조 사용 전
		System.out.println("integerFunction.apply(10) = " + Arrays.toString(integerFunction.apply(10)));
		System.out.println("integerFunction.apply(100).length = " + integerFunction.apply(100).length);
		
	}
}

class MyClass {
	int myAge;
	
	public MyClass()
	{
	}
	
	public MyClass(int myAge)
	{
		this.myAge = myAge;
	}
	
	@Override
	public String toString()
	{
		return "MyClass{" +
				"myAge=" + myAge +
				'}';
	}
}
