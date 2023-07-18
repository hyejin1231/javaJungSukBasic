package org.example.ch03;

/**
 * ch3. 문자열 비교
 */
public class Ex3_13
{
	public static void main(String[] args)
	{
		String str1 = "abc";
		String str2 = "abc";
		System.out.println("str1.equals(str2) = " + str1.equals(str2)); // true
		System.out.println("(str1 == str2) = " + (str1 == str2)); // true
		
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println("str3.equals(str4) = " + str3.equals(str4)); // true
		System.out.println("(str3 == str4) = " + (str3 == str4)); // 내용은 같지만 서로 다른 객체이기 때문에 false
		
	}
}
