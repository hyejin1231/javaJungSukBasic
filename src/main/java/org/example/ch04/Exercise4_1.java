package org.example.ch04;

import java.util.Scanner;

public class Exercise4_1
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요. > ");
		int x = scanner.nextInt();
		
		// 1) int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		if (x > 10 && x < 20) {
			System.out.println("true!");
		}
		
		char ch = (char) scanner.nextInt();
		
		// 2) char형 변수 ch가 공백이나 탭이 아닐 때 true 인 조건식
		if (ch != ' ' || ch != '\t') {
			System.out.println("true!");
		}
		
		// 3) char형 변수 ch가 'x' 또는 'X' 일 때 true 인 조건식
		if (ch == 'x' || ch == 'X') {
			System.out.println("true!");
		}
		
		// 4) char형 변수 ch 가 숫자('0' ~ '9') 일 때 true 인 조건식
		if (ch >= '0' && ch <= '9') {
			System.out.println("true!");
		}
		
		// 5) char형 변수 ch가 영문자(대문자 또는 소문자) 일 때 true 인 조건식
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println("true!");
		}
		
		// 6) int형 변수 year 가 400으로 나누어 떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 true 인 조건식
		int year = scanner.nextInt();
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("true!");
		}
		
		// 7) boolean 형 변수 powerOn 가 false 일 때 true 인 조건식
		boolean powerOn = true;
		if (powerOn == false) {
			System.out.println("true!");
		}
		
		// 8) 문자열 참조변수 str이 "yes" 일 때 true 인 조건식
		String str = scanner.nextLine();
		if (str.equals("yes")) {
			System.out.println("true!");
		}
		
	}
}
