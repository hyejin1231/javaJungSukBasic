package org.example.ch02;

/**
 * ch02. 변수, 변수의 저장 과정
 *
 * 변수 : 하나의 값을 저장할 수 있는 메모리 공간
 * 변수 선언 방법 : [변수타입] [변수이름] ;
 * [변수타입] : 저장할 값이 어떤 타입인지 지정하는 것
 * [변수이름] : 메모리 공간에 이름을 붙여주는 것
 * -> 변수를 선언하고 나면 메모리의 빈 공간에 변수타입에 알맞은 크기의 저장공간이 확보되고,
 * 변수이름을 통해 사용할 수 있게 된다.
 *
 * 변수 초기화 : 변수를 사용하기 전에 처음으로 값을 저장하는 것
 * 메모리는 여러 프로그램이 공유하는 자원이기 때문에 전에 다른 프로그램에 의해 저장된 알 수 없는 값이 있을 수 있기 때문에
 * 사용하기 전에 적절한 값을 넣어 초기화해주는 것이 좋다.
 */
public class Ex2_2
{
	public static void main(String[] args)
	{
		System.out.println("===== 변수 사용 전 =====");
		System.out.println("6 + 3 = " + (6 + 3));
		System.out.println("6 - 3 = " + (6 - 3));
		System.out.println("6 * 3 = " + (6 * 3));
		System.out.println("6 / 3 = " + (6 / 3));
		
		System.out.println();
		System.out.println("===== 변수 사용 후 =====");
		int x = 4,  y = 2;
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y));
		
		System.out.println();
		System.out.println("===== 두 변수의 값 교환 =====");
		int a = 10, b = 20, tmp = 0;
		System.out.println("a = " + a + " b = " + b + "c = ");
		tmp = a;
		a = b;
		b = tmp;
		
		
	}
}
