package org.example.ch02;

/**
 * ch02. 리터럴의 타입과 접미사
 */
public class Ex2_4
{
	public static void main(String[] args)
	{
		boolean power = true; // 논리형 boolean : true, false
		System.out.println("power = " + power);
		
		byte b = 127; // 정수형 byte : 범위 -128 ~ 127
		System.out.println("b = " + b);
		
		int oct = 010; // 8진수 -> 10진수로는 8
		int hex = 0x10; // 16진수 -> 10진수로는 16
		System.out.println("oct = " + oct); // println은 10진수로 출력해줌
		System.out.println("hex = " + hex);
		
//		long l = 10_000_000_000; // int의 범위 20억을 넘었기 때문에 접미사를 붙여줘야함
		long l = 10_000_000_000L;
		System.out.println("l = " + l);
		
		float f = 3.14f; // 실수형 float, 접미사 생략 불가
		double d = 3.14; // 실수형 double, 접미사 생략 가능
		System.out.println("f = " + f);
		System.out.println("d = " + d);
		
		
		System.out.println("10. = " + 10.); // 10.0
		System.out.println(".10 = " + .10); // 0.10
		System.out.println("10f = " + 10f);  // 10.0 (접미사는 생략)
		System.out.println("1e3 = " + 1e3); // 1000.0
		
		char ch = 'A';
		System.out.println("ch = " + ch);
		
		int i = 'A';
		System.out.println("i = " + i); // 문자 'A'의 문자코드 65 출력
		
		String str = ""; // 빈문자열 empty string
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2 + str3;
		System.out.println("str = " + str);
		System.out.println("str2 = " + str2);
		System.out.println("str4 = " + str4);
		
		System.out.println("(\"\" + 7 + 7) = " + ("" + 7 + 7)); // 77
		System.out.println("(7 + 7 + \"\") = " + (7 + 7 + "")); // 14
	}
}
