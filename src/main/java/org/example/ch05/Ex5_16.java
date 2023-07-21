package org.example.ch05;

/**
 * ch05. String 클래스
 * - String 클래스는 char[] 와 메서드 (기능)를 결합한 것
 * ->  String 클래스 = char[] + 메서드 (기능)
 * - String 클래스는 내용을 변경할 수 없다. (read only)
 */
public class Ex5_16
{
	public static void main(String[] args)
	{
		String str = "abcde";
		
		// 1) charAt(int index) : 문자열에서 해당 위치 index에 있는 문자를 반환한다.
		char c = str.charAt(3);
		System.out.println("str.charAt(3) = " + c); // d
		
		// 2) int length() : 문자열의 길이를 반환한다.
		int length = str.length();
		System.out.println("length = " + length); // 5
		
		// 3) String subString(int from, int to) : 문자열에서 해당 범위 (from ~ to) 의 문자열을 반환한다. (to는 포함 안됨)
		String substring = str.substring(0, 3);
		System.out.println("substring = " + substring); // abc
		
		// 4) boolean equals(Object obj) : 문자열의 내용이 같은지 확인한다. 같으면 true, 다르면 false
		boolean equal = str.equals("abcde");
		System.out.println("str.equals(\"abcde\") = " + equal);
		
		// 5) char[] toCharArray() : 문자열을 문자배열(char[])로 변환해서 반환한다.
		char[] chars = str.toCharArray();
		System.out.println(chars);
	}
}
