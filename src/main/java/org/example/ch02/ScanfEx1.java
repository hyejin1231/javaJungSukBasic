package org.example.ch02;

import java.util.Scanner;

/**
 * ch02. 화면으로부터 입력받기 Scanner
 */
public class ScanfEx1
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int num2 = scanner.nextInt();
		System.out.println("num = " + num + ", num2 = " + num2);
		
	}
}
