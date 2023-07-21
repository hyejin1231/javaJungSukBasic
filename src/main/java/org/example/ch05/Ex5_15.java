package org.example.ch05;

import java.util.Scanner;

/**
 * ch05. 2차원배열 예제
 */
public class Ex5_15
{
	public static void main(String[] args)
	{
		String[][] words = {
				{ "chair", "의자" },
				{ "computer", "컴퓨터" },
				{ "integer", "정수" }
		};
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i <words.length; i++)
		{
			System.out.printf("Q%d. %s의 뜻은?", i+1 ,words[i][0]);
			
			String input = scanner.nextLine();
			
			if (input.equals(words[i][1])) {
				System.out.printf("정답입니다! %n%n");
			}else {
				System.out.printf("틀렸습니다! %n%n");
			}
		}
	}
}
