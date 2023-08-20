package org.example.ch09;

/**
 * ch09. 래퍼 (Wrapper) 클래스, Number 클래스
 * 래퍼 클래스
 *  : 기본형을 객체로 다뤄야할 때 사용하는 클래스
 */
public class Ex9_10
{
	public static void main(String[] args)
	{
		Integer integer = new Integer(10);
		Integer integer1 = new Integer(10);
		
		System.out.println("(integer1 == integer) = " + (integer1 == integer)); // false
		System.out.println("integer.equals(integer1) = " + integer.equals(integer1)); // true
		System.out.println("integer.compareTo(integer1) = " + integer.compareTo(integer1)); // 같으면 0
		System.out.println("integer.toString() = " + integer.toString());
		
		System.out.println("integer.MAX_VALUE = " + integer.MAX_VALUE); // 2147483647
		System.out.println("integer.MIN_VALUE = " + integer.MIN_VALUE); // -2147483647
		System.out.println("integer.SIZE = " + integer.SIZE + " bits"); // 32 bits
		System.out.println("integer.BYTES = " + integer.BYTES + " byte"); // 4 byte
		System.out.println("integer.TYPE = " + integer.TYPE); // int
	}
}
