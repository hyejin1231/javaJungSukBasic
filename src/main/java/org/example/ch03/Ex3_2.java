package org.example.ch03;

/**
 * ch3. 증감연산자, 부호연산자
 * 증감연산자(전위형, 후위형)
 */
public class Ex3_2
{
	public static void main(String[] args)
	{
		int i = 5, j = 0;
		
		// j = i;
		// i++;
		j = i++; // 후위형
		System.out.println("i = " + i + ", j = " + j); // i = 6, j = 5
		
		i = 5; j = 0;
		
		// ++i;
		// j = i;
		j = ++i; // 전위형
		System.out.println("i = " + i + ", j = " + j); // i = 6, j = 6
	}
}
