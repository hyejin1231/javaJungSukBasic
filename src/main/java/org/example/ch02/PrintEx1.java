package org.example.ch02;

/**
 * ch02. printf를 이용한 출력
 */
public class PrintEx1
{
	public static void main(String[] args)
	{
		System.out.println("(10 / 3) = " + (10 / 3)); // 3
		System.out.println("(10.0 / 3) = " + (10.0 / 3)); // 3.3333...
		
		// println 은 10진수만 출력한다.
		System.out.println("0x1A = " + 0x1A);
		
		System.out.println("===== 정수형 (접두사 x) =====");
		System.out.printf("10진수 : %d%n", 15); // 10진수 15
		System.out.printf("8진수 : %o%n", 15); // 8진수 17
		System.out.printf("16진수 : %x%n", 15); // 16진수 f
		System.out.printf("2 진수 : %s%n%n", Integer.toBinaryString(15)); // 2진수 1111
		
		System.out.println("===== 정수형 (접두사 O) =====");
		System.out.printf("10진수 : %d%n", 15); // 10진수 15
		System.out.printf("8진수 : %#o%n", 15); // 8진수 17
		System.out.printf("16진수 : %#x%n%n", 15); // 16진수 f
		
		System.out.println("===== 실수형 ===== ");
		float f = 123.456789f;
		// %f, %e : 지수형식, %g : 간략한 형식
		System.out.printf("%f%n", f); // 123.456787 (float는 정밀도 7자리라 뒤에 87는 의미없는 값)
		System.out.printf("%e%n", f); // 1.234568e+02
		System.out.printf("%g%n", 123.456789); // 123.457 간략하게 소수점 포함해서 7자리로 표현됨
		System.out.printf("%g%n%n", 0.00000001);
		
		System.out.println();
		System.out.printf("[%5d]%n", 10);
		System.out.printf("[%-5d]%n", 10); // 왼쪽정렬
		System.out.printf("[%05d]%n", 10); // 공백 대신 0으로 채움
		System.out.printf("d = [%14.10f]%n", 1.23456789); // 전체(소수점 포함) 14자리, 소수점 아래 10자리
		
		System.out.println();
		String url = "www.codechobo.com";
		System.out.printf("[%s]%n",url);
		System.out.printf("[%20s]%n",url);
		System.out.printf("[%-20s]%n",url);
		System.out.printf("[%.8s]%n",url); // 부분 출력
		
		
	}
}
