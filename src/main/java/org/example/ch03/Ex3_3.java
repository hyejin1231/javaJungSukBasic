package org.example.ch03;

/**
 * ch03. 자동 형변환
 */
public class Ex3_3
{
	public static void main(String[] args)
	{
		byte b = 100; // (int) 캐스팅 괄호 안해도 컴파일러가 byte 타입으로 형변환하여 대입해준다.
		
		int i = 100;
//		byte b = i; // error 발생, 변수 i가 100일거라는 확신이 없기 때문에
		b = (byte) i; // byte 타입으로 수동 형변환해서 대입해줘야 한다.
		
//		b = 1000; // error 발생, 1000이 리터럴이지만 byte 타입의 범위를 넘어간 값의 대입이기 때문에 값손실이 일어나 자동 형변환 안해줌
		b = (byte) 1000; // 따라서 수동형변환해야한다.
		
	}
}
