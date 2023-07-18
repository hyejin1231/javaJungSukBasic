package org.example.ch03;

/**
 * ch03. 나머지 연산자
 * 나누는 피연산자는 0이 아닌 정수만 허용되고 부호는 무시된다!
 */
public class Ex3_12
{
	public static void main(String[] args)
	{
		int x = 10, y = 8;
		System.out.printf("%d를 %d로 나누면, %n", x, y);
		System.out.printf("몫은 %d 이고, 나머지는 %d 입니다.", (x/y), (x%y));
	}
}

