package org.example.ch03;

import java.util.Scanner;

/**
 * ch 03. 논리연산자
 */
public class Ex3_15
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.printf("문자 하나를 입력해주세요. >");
		
		String input = scanner.nextLine();
		ch = input.charAt(0);
		
		if ('0' <= ch && ch <= '9') { // 문자 ch 는 숫자 (0 ~ 9) 이다.
			System.out.printf("입력하신 문자는 숫자입니다. %n");
		}
		
		if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) { // 문자 ch 는 대문자 또는 소문자이다.
			System.out.printf("입력하신 문자는 영문자입니다. %n");
		}
	}
}
