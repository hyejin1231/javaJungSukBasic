package org.example.ch03;

/**
 * ch3. 산술변환
 */
public class Ex3_9
{
	public static void main(String[] args)
	{
		int a = 1_000_000; // 1 백만 => 10의 6제곱
		int b = 2_000_000; // 2 백만 => 10의 6제곱
		
		long c = a * b; // int 타입과 int 타입의 연산결과는 int 타입
		System.out.println("c = " + c); // 오버플로우 발생 -1454759936
		
		long d = (long) a * b; // 형변환 해줘야 한다.
		System.out.println("d = " + d);
		
	}
}
