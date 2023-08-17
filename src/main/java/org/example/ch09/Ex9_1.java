package org.example.ch09;

/**
 * ch09. Object 클래스와 equals()
 * eqauls() : 객체 자신 this와 주어진 객체 obj 를 비교하고 같으면 true, 다르면 false를 반환한다.
 */
public class Ex9_1
{
	public static void main(String[] args)
	{
		Value value = new Value(10);
		Value value1 = new Value(10);
		
		System.out.println("value.equals(value1) = " + value.equals(value1)); // false
	}
}
